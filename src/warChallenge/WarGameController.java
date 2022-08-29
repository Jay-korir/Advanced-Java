package warChallenge;

import warChallenge.weapons.Army;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;



public class WarGameController {
    private static final int maxSoldiers = 10;
    private Army ally;
    private Army enemy;

    public WarGameController() {
        this.setUpGame();
    }

    public void setUpGame() {
        ally = new Army();
        enemy = new Army();

        ArrayList<Soldier> allySoldiers = new ArrayList<>();
        ArrayList<Soldier> enemySoldiers = new ArrayList<>();
        for (int k = 0; k < maxSoldiers; k++) {
            allySoldiers.add(new Soldier("Ally0" + k));
            enemySoldiers.add(new Soldier("enemy" + k));
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

    private boolean noWeaponHasBullets(Army army) {
        for (int k = 0; k < army.getSoldiers().size(); k++)
            if (army.getSoldiers().get(k).gunHasBullets())
                return false;

        return true;
    }

    public void runGame() {
        int choice = new Random().nextInt(20);
        if (choice % 2 == 0) {
            //ally attacking
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().size() - 1);
                if (ally.getSoldiers().get(soldierIndex).gunHasBullets() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    ally.getSoldiers().get(soldierIndex).shoot();
                }else
                    ally.getSoldiers().get(soldierIndex).setAlive(false);

            }
            //enemy shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() - 1);
                choice = new Random().nextInt(5);
                if ((choice % 2 == 0) && enemy.getSoldiers().get(soldierIndex).isAlive())
                    enemy.getSoldiers().get(soldierIndex).shot();
            }
           // System.out.println("officers load the riffle");

        } else
            //enemy shooting
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() - 1);
                if (enemy.getSoldiers().get(soldierIndex).gunHasBullets() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    enemy.getSoldiers().get(soldierIndex).shoot();
                }else
                    enemy.getSoldiers().get(soldierIndex).setAlive(false);

            }
        //ally shot
        for (int i = 0; i < 5; i++) {
            int soldierIndex = new Random().nextInt(ally.getSoldiers().size() - 1);
            int choiceShot = new Random().nextInt(5);
            if ((choiceShot % 2 == 0) && ally.getSoldiers().get(soldierIndex).isAlive())
                ally.getSoldiers().get(soldierIndex).shot();
        }
       // System.out.println("taliban load the riffle");
    }

    public void run() throws InterruptedException {
        while (true) {
            if (allSoldiersAreDead(ally) || allSoldiersAreDead(enemy) || noWeaponHasBullets(ally) || noWeaponHasBullets(enemy)){
                System.out.println("soldiers are dead");
                setUpGame();
            break;
        }
        this.runGame();
            Thread.sleep(200);
    }

}
    public  static void operations(){




        Activities action[] = Activities.values();
        for (Activities choice : action) {
            System.out.println(choice.toString());
            System.out.println("Enter FOR THE NEXT choice in this order--\n1.GUN-TANK-BOMB-JETS-TEARGAS-MARINESHIP");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();


            switch (choice) {
                case GUN:
                    System.out.println("thi is gun executing");
                    Soldier soldier = new Soldier("MIL_ID_000747");
                    soldier.shoot();
                    soldier.changeShootingMode();
                    System.out.println();
                    break;
                case TANK:
                    System.out.println("This is a tank attacking the enemy");
                    Soldier soldier1 = new Soldier("mil_kEA_A007");
                    soldier1.shell();
                    soldier1.changeTankModel();
                    System.out.println();
                    break;
                case BOMB:
                    System.out.println("This is a Bomb sending a missile to an enemy");
                    Soldier soldier2 = new Soldier("Ak76tg9");
                    soldier2.releaseBomb();
                    soldier2.changeBombType();
                    System.out.println();
                    break;
                case JETS:
                    System.out.println("Here the Jet comes");
                    Soldier soldier3 = new Soldier("kenyaJet1");
                    soldier3.fireJet();
                    soldier3.changeJetType();
                    System.out.println();
                    break;
                case TEARGAS:
                    System.out.println("the teargas is released");
                    Soldier soldier4 = new Soldier("BGJMS10");
                    soldier4.tearGasThem();
                    soldier4.changeModelType();
                    System.out.println();
                    break;
                case MARINESHIP:
                    System.out.println("here comes the marine ship explodes");
                    Soldier soldier5 = new Soldier("smjgb10");
                    soldier5.explode();
                    soldier5.changeMarine();
                    System.out.println();
                    break;
            }
        }

    }
}
