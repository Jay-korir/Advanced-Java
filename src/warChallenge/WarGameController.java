package warChallenge;

import warChallenge.weapons.Army;
import warChallenge.weapons.DifficultyLevel;
import warChallenge.weapons.warThreads.BombThread;
import warChallenge.weapons.warThreads.GunThread;
import warChallenge.weapons.warThreads.JetsThread;
import warChallenge.weapons.warThreads.TankThread;

import java.util.LinkedList;

import static warChallenge.Soldier.*;


public class WarGameController {

   public static DifficultyLevel difficultyLevel;
   static private Army ally;
  static   private Army enemy;
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
    private int deadSoldiers(Army army){
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

    public void runGame() {


 GunThread enemyThread = new GunThread(enemy,ally);
 enemyThread.start();
 GunThread allyThread = new GunThread(ally,enemy);
allyThread.start();
TankThread tankThreadEnemy = new TankThread(enemy,ally);
tankThreadEnemy.start();
TankThread allyThreadTank = new TankThread(ally,enemy);
allyThreadTank.start();
BombThread bombThread = new BombThread(ally,enemy);
bombThread.start();
BombThread bombThread1 = new BombThread(enemy,ally);
bombThread1.start();
JetsThread jetsThread = new JetsThread(ally,enemy);
jetsThread.start();
JetsThread jetsThread1 = new JetsThread(enemy,ally);
jetsThread1.start();

    }


    public void run() throws InterruptedException {
        while (true) {
            if (allSoldiersAreDead(ally) || allSoldiersAreDead(enemy) || noWeaponHasBullets(ally) || noWeaponHasBullets(enemy)||noBombHasShell(ally)){
                System.out.println("soldiers are dead the games is over");
                System.out.println("deadSoldiers=="+ deadSoldiers(ally));
                System.out.println("deadSoldiers=="+ deadSoldiers(ally));
                System.out.println("=====");
                if (allSoldiersAreDead(ally))
                    System.out.println("Bravo you have won the game you have killed the enemy");
                else
                    System.out.println("oops you have lost the game your soldiers have  been killed ");
                setUpGame();
            break;
        }

        this.runGame();
            Thread.sleep(2000);


    }

}

}
