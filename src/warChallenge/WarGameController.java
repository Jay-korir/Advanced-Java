package warChallenge;

import warChallenge.weapons.Army;
import warChallenge.weapons.DifficultyLevel;
import warChallenge.weapons.Points;
import warChallenge.weapons.Registration;
import warChallenge.weapons.warThreads.BombThread;
import warChallenge.weapons.warThreads.GunThread;
import warChallenge.weapons.warThreads.JetsThread;
import warChallenge.weapons.warThreads.TankThread;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


import static warChallenge.weapons.Points.*;
import static warChallenge.weapons.Registration.*;


public class WarGameController {

   public static DifficultyLevel difficultyLevel;
   static private Army ally;
  static   private Army enemy;

  //to change the number of soldiers make sure the number is even that is divisible by 4
    private static final int maxSoldiers = 30;


    public WarGameController(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
        this.setUpGame();
    }

    public void setUpGame() {
        ally = new Army();
        enemy = new Army();

        LinkedList<Soldier> allySoldiers = new LinkedList<>();
        LinkedList<Soldier> enemySoldiers = new LinkedList<>();
        for (int k = 0; k < maxSoldiers; k++) {
            enemySoldiers.add(new Soldier("enemy0" + k));
            allySoldiers.add(new Soldier("Ally0" + k));

        }
        ally.setSoldiers(allySoldiers);
        enemy.setSoldiers(enemySoldiers);
    }


    private boolean allSoldiersAreDead(Army army) {
        for (int j = 0; j < army.getSoldiers().size(); j++)
            if (army.getSoldiers().get(j).isAlive())
                return false;

        return true;
    }

    private synchronized int deadSoldiers(Army army){
        int alive = 0;
        for (int k = 0; k < army.getSoldiers().size(); k++){
            if (army.getSoldiers().get(k).isAlive()) {
                alive = alive + 1;
            }
        }
        int deadSoldiers = army.getSoldiers().size() - alive;
        return deadSoldiers;

    }



    private boolean noWeaponHasBullets(Army army) {
        boolean bulletsDepleted = true;
        for (int k = 0; k < army.getSoldiers().size(); k++){
            bulletsDepleted=!army.getSoldiers().get(k).gunHasBullets();
        if (!bulletsDepleted)
            break;}

        return bulletsDepleted;
    }
    private boolean noTankHasShell(Army army) {
        boolean bulletsDepleted = true;
        for (int k = 0; k < army.getSoldiers().size(); k++){
            bulletsDepleted=!army.getSoldiers().get(k).tankHasShell();
            if (!bulletsDepleted)
                break;}
        return bulletsDepleted;
    }
    private boolean noBombHasShell(Army army) {
        boolean bulletsDepleted = true;
        for (int k = 0; k < army.getSoldiers().size(); k++){
            bulletsDepleted=!army.getSoldiers().get(k).bombHasShell();
            if (!bulletsDepleted)
                break;}
        return bulletsDepleted;
    }

    public void runGame() throws InterruptedException, IOException {


 GunThread enemyThread = new GunThread(enemy,ally);
 //enemyThread.start();
 GunThread allyThread = new GunThread(ally,enemy);
//allyThread.start();
TankThread tankThreadEnemy = new TankThread(enemy,ally);
//tankThreadEnemy.start();
TankThread allyThreadTank = new TankThread(ally,enemy);
//allyThreadTank.start();
BombThread bombThread = new BombThread(ally,enemy);
//bombThread.start();
BombThread bombThread1 = new BombThread(enemy,ally);
//bombThread1.start();
JetsThread jetsThread = new JetsThread(ally,enemy);
//jetsThread.start();
JetsThread jetsThread1 = new JetsThread(enemy,ally);

        enemyThread.start();
        allyThread.start();
        tankThreadEnemy.start();
        allyThreadTank.start();
        bombThread.start();
        bombThread1.start();
        jetsThread.start();
       jetsThread1.start();

        enemyThread.join();
        allyThread.join();
        tankThreadEnemy.join();
        allyThreadTank.join();
        bombThread.join();
        bombThread1.join();
        jetsThread.join();
        jetsThread1.join();


    }
    static int points = 0;
    public void scores() throws IOException {
        File obj = new File(pointsPath);
        if (obj.createNewFile()) {
            System.out.println("File is created");
        }

        if(deadSoldiers(ally)> deadSoldiers(enemy)) {
            String str = name + ", lost," +  0 + "," + difficultyLevel + "," + date ;
            Points.writeToFile(pointsPath, str);
            points += 0;
        }
        else {
            String str = name + ", won," +  1000 + "," + difficultyLevel + "," + date;
            Points.writeToFile(pointsPath, str);
            points += 1000;

        }
    }



    public void run() throws InterruptedException, IOException {


        while (true) {

            if (allSoldiersAreDead(ally) || allSoldiersAreDead(enemy) || noWeaponHasBullets(ally) || noWeaponHasBullets(enemy)||noBombHasShell(ally)) {
                System.out.println("soldiers are dead the games is over");
                System.out.println("deadSoldiers==" + deadSoldiers(ally));
                System.out.println("deadSoldiers==" + deadSoldiers(enemy));
                this.scores();
                System.out.println("=====");
                if (deadSoldiers(ally)< deadSoldiers(enemy))
                    System.out.println("Bravo you have won the game you have killed the enemy\n");
                else
                    System.out.println("oops you have lost the game your soldiers have  been killed\n");

                setUpGame();

                System.out.println();
                System.out.println("your points are " + name + " = " + points+ "  points" );
                System.out.println("===========table of members played============");
                readFile();

                break;
            }


        this.runGame();
            Thread.sleep(2000);


    }

}

    public static void registration () throws  InterruptedException, IOException {
        try {
            File obj = new File("warGame.txt");
            if (obj.createNewFile()) {
                System.out.println("File is created");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }

        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  Choice  1 to continue");
        choice = sc.nextInt();

        if (choice == 1) {
            Registration user = new Registration();
            user.register();

        } else {
            System.out.println("Choose invalid Option proceed to register");
            System.out.println("Enter  Choice  1 to continue");
            choice = sc.nextInt();
            Registration user = new Registration();
            user.register();

        }
        Registration.getMembers();



    }

}
