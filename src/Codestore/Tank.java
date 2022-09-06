package Codestore;



public class Tank {
    /*
        int choice = new Random().nextInt(20);
        if (choice % 2 == 0) {
            //ally attacking
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().size());
                if (ally.getSoldiers().get(soldierIndex).tankHasShell() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    ally.getSoldiers().get(soldierIndex).shell();
                }else
                    ally.getSoldiers().get(soldierIndex).setAlive(false);

            }
            //enemy shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() );
                choice = new Random().nextInt(5);
                if ((choice % 2 == 0) && enemy.getSoldiers().get(soldierIndex).isAlive())
                    enemy.getSoldiers().get(soldierIndex).shelled();
            }
            // System.out.println("officers load the riffle");

        } else
            //enemy shooting
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() );
                if (enemy.getSoldiers().get(soldierIndex).tankHasShell() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    enemy.getSoldiers().get(soldierIndex).shell();
                }else
                    enemy.getSoldiers().get(soldierIndex).setAlive(false);

            }
        //ally shot
        for (int i = 0; i < 5; i++) {
            int soldierIndex = new Random().nextInt(ally.getSoldiers().size() );
            int choiceShot = new Random().nextInt(5);
            if ((choiceShot % 2 == 0) && ally.getSoldiers().get(soldierIndex).isAlive())
                ally.getSoldiers().get(soldierIndex).shelled();
        }

        // System.out.println("taliban load the riffle");

    public void runTank() {
        TankThread enemyThread = new TankThread(enemy,ally);
        enemyThread.start();
        TankThread allyThread = new TankThread(ally,enemy);
        allyThread.start();
    }
    class TestThread extends Thread {
    private Army firstArmy ;
    private Army otherArmy;

    public  TestThread(Army firstArmy, Army otherArmy){
        this.firstArmy = firstArmy;
        this.otherArmy = otherArmy;
    }

    int choice = new Random().nextInt(20);
    int choice1 = new Random().nextInt(5);
   // int soldierIndex = new Random().nextInt(firstArmy.getSoldiers().size()-1);
    int soldierIndex = new Random().nextInt(1000);
    int soldierIndex1 = new Random().nextInt(otherArmy.getSoldiers().size()-1);

    public void run() {
        if (choice % 2 == 0) {
            if (firstArmy.getSoldiers().get(soldierIndex).gunHasBullets() && firstArmy.getSoldiers().get(soldierIndex).isAlive()) {
                firstArmy.getSoldiers().get(soldierIndex).shoot();
            } else
                firstArmy.getSoldiers().get(soldierIndex).setAlive(false);


            //enemy shot
            for (int i = 0; i < 5; i++) {


                if ((choice1 % 2 == 0) && otherArmy.getSoldiers().get(soldierIndex1).isAlive())
                    otherArmy.getSoldiers().get(soldierIndex1).shot();
            }
        }else
        if (otherArmy.getSoldiers().get(soldierIndex).gunHasBullets() && otherArmy.getSoldiers().get(soldierIndex).isAlive()) {
            otherArmy.getSoldiers().get(soldierIndex).shoot();
        } else
            otherArmy.getSoldiers().get(soldierIndex).setAlive(false);


        //enemy shot
        for (int i = 0; i < 5; i++) {


            if ((choice1 % 2 == 0) && firstArmy.getSoldiers().get(soldierIndex1).isAlive())
                firstArmy.getSoldiers().get(soldierIndex1).shot();
        }
        if (choice % 3 == 0) {
            if (firstArmy.getSoldiers().get(soldierIndex).tankHasShell() && firstArmy.getSoldiers().get(soldierIndex).isAlive()) {
                firstArmy.getSoldiers().get(soldierIndex).shoot();
            } else
                firstArmy.getSoldiers().get(soldierIndex).setAlive(false);


            //enemy shot
            for (int i = 0; i < 5; i++) {


                if ((choice1 % 2 == 0) && otherArmy.getSoldiers().get(soldierIndex1).isAlive())
                    otherArmy.getSoldiers().get(soldierIndex1).shelled();
            }
        }else
        if (otherArmy.getSoldiers().get(soldierIndex).tankHasShell() && otherArmy.getSoldiers().get(soldierIndex).isAlive()) {
            otherArmy.getSoldiers().get(soldierIndex).shell();
        } else
            otherArmy.getSoldiers().get(soldierIndex).setAlive(false);


        //enemy shot
        for (int i = 0; i < 5; i++) {


            if ((choice1 % 2 == 0) && firstArmy.getSoldiers().get(soldierIndex1).isAlive())
                firstArmy.getSoldiers().get(soldierIndex1).shelled();
        }
    }
}
// int tankIndex = new Random().nextInt(maxTanks - 1);
            //if (soldiers.get(s).soldierHasTank()) {
              //  soldiers.get(s).setTank(tanks.get(tankIndex));
            //}
    */
}
