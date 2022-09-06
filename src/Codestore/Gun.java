package Codestore;

import warChallenge.weapons.Army;

import java.util.Random;

public class Gun {
     /*
      public void shelled(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.tank.setShell(0);

    }
    public void bombed(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.bomb.setBomb(0);

    }

    public void jetted(){
        this.alive = false;
        System.out.println(this.militaryId + "killed by jets missile");
        this.jets.setMaxMissile(0);

    }
      else if (choice % 5 == 0){
      int choice = new Random().nextInt(20);
        if (choice % 2 == 0) {
            //ally attacking
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().size());
                if (ally.getSoldiers().get(soldierIndex).gunHasBullets() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    ally.getSoldiers().get(soldierIndex).shoot();
                }else
                    ally.getSoldiers().get(soldierIndex).setAlive(false);

            }
            //enemy shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() );
                choice = new Random().nextInt(5);
                if ((choice % 2 == 0) && enemy.getSoldiers().get(soldierIndex).isAlive())
                    enemy.getSoldiers().get(soldierIndex).shot();
            }
            // System.out.println("officers load the riffle");

        } else
            //enemy shooting
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size() );
                if (enemy.getSoldiers().get(soldierIndex).gunHasBullets() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    enemy.getSoldiers().get(soldierIndex).shoot();
                }else
                    enemy.getSoldiers().get(soldierIndex).setAlive(false);

            }
        //ally shot
        for (int i = 0; i < 5; i++) {
            int soldierIndex = new Random().nextInt(ally.getSoldiers().size() );
            int choiceShot = new Random().nextInt(5);
            if ((choiceShot % 2 == 0) && ally.getSoldiers().get(soldierIndex).isAlive())
                ally.getSoldiers().get(soldierIndex).shot();
        }

    // System.out.println("taliban load the riffle");
    class  TestThread extends  Thread{
        private Army firstArmy;
        private  Army otherArmy;

        public  TestThread(Army firstArmy, Army otherArmy){
            this.firstArmy = firstArmy;
            this.otherArmy = otherArmy;
        }

        @Override
        public void run() {

            int choice = new Random().nextInt(20);
            if (choice % 2 == 0) {
                //ally attacking
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(firstArmy.getSoldiers().size() - 1);
                    if (firstArmy.getSoldiers().get(soldierIndex).gunHasBullets() && firstArmy.getSoldiers().get(soldierIndex).isAlive()) {
                        firstArmy.getSoldiers().get(soldierIndex).shoot();
                    }else
                        firstArmy.getSoldiers().get(soldierIndex).setAlive(false);

                }
                //enemy shot
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(otherArmy.getSoldiers().size() - 1);
                    choice = new Random().nextInt(5);
                    if ((choice % 2 == 0) && otherArmy.getSoldiers().get(soldierIndex).isAlive())
                        otherArmy.getSoldiers().get(soldierIndex).shot();
                }
                // System.out.println("officers load the riffle");


            } else
                //enemy shooting
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(otherArmy.getSoldiers().size() - 1);
                    if (otherArmy.getSoldiers().get(soldierIndex).gunHasBullets() && firstArmy.getSoldiers().get(soldierIndex).isAlive()) {
                        otherArmy.getSoldiers().get(soldierIndex).shoot();
                    }else
                        otherArmy.getSoldiers().get(soldierIndex).setAlive(false);

                }
            //ally shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(firstArmy.getSoldiers().size() - 1);
                int choiceShot = new Random().nextInt(5);
                if ((choiceShot % 2 == 0) && firstArmy.getSoldiers().get(soldierIndex).isAlive())
                    firstArmy.getSoldiers().get(soldierIndex).shot();
            }

            //int choice = new Random().nextInt(20);
            if (choice % 2 == 0) {
                //ally attacking
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(firstArmy.getSoldiers().size() - 1);
                    if (firstArmy.getSoldiers().get(soldierIndex).gunHasBullets() && firstArmy.getSoldiers().get(soldierIndex).isAlive()) {
                        firstArmy.getSoldiers().get(soldierIndex).shoot();
                        if (firstArmy.getSoldiers().get(soldierIndex).tankHasShell() && firstArmy.getSoldiers().get(soldierIndex).isAlive())
                            firstArmy.getSoldiers().get(soldierIndex).shell();
                    } else
                        firstArmy.getSoldiers().get(soldierIndex).setAlive(false);


                }
                //enemy shot
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(otherArmy.getSoldiers().size() - 1);
                    choice = new Random().nextInt(5);
                    if ((choice % 2 == 0) && otherArmy.getSoldiers().get(soldierIndex).isAlive())
                        otherArmy.getSoldiers().get(soldierIndex).shot();
                    otherArmy.getSoldiers().get(soldierIndex).shelled();
                }
                // System.out.println("officers load the riffle");


            } else
                //enemy shooting
                for (int i = 0; i < 5; i++) {
                    int soldierIndex = new Random().nextInt(otherArmy.getSoldiers().size() - 1);
                    if (otherArmy.getSoldiers().get(soldierIndex).gunHasBullets() && otherArmy.getSoldiers().get(soldierIndex).isAlive()) {
                        otherArmy.getSoldiers().get(soldierIndex).shoot();
                        if (otherArmy.getSoldiers().get(soldierIndex).tankHasShell() && otherArmy.getSoldiers().get(soldierIndex).isAlive())
                            otherArmy.getSoldiers().get(soldierIndex).shell();
                    }else
                        otherArmy.getSoldiers().get(soldierIndex).setAlive(false);

                }
            //ally shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(firstArmy.getSoldiers().size() - 1);
                int choiceShot = new Random().nextInt(5);
                if ((choiceShot % 2 == 0) && firstArmy.getSoldiers().get(soldierIndex).isAlive())
                    firstArmy.getSoldiers().get(soldierIndex).shot();
                firstArmy.getSoldiers().get(soldierIndex).shelled();
            }
        }
    }
     public void shelled(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.tank.setShell(0);

    }
    public void bombed(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.bomb.setBomb(0);

    }

    public void jetted(){
        this.alive = false;
        System.out.println(this.militaryId + "killed by jets missile");
        this.jets.setMaxMissile(0);

    }

    /*soldiers.get(s).assignWeaponSoldier(new Gun());
        }
        for (int t = gunPoint; t < (gunPoint + tankPoint); t++){
            soldiers.get(t).assignWeaponSoldier(new Tank());
        }
        for (int b = (gunPoint + tankPoint); b < bombPoint; b++){
            soldiers.get(b).assignWeaponSoldier(new Bomb());
        }
        for (int j = bombPoint; j< soldiers.size(); j++ ){
            soldiers.get(j).assignWeaponSoldier(new Jets());
        public Army(){
/*
        //executing Gun
        guns = new LinkedList<>();

        for (int k = 0; k<maxGuns-1; k++){
            int rand = new Random().nextInt(20);
      if (rand % 3 == 0)
          guns.add(new Gun());





        }
        //executing the tank
        tanks = new LinkedList<>();
        for (int t =0; t<maxTanks-1; t++){
            int rand = new Random().nextInt(10);
            if (rand % 2 == 0)
                tanks.add(new Tank());
        }
        //executing bomb
        bombs = new LinkedList<>();
        for (int t =0; t<maxBombs-1; t++){
            int rand = new Random().nextInt(10);
            if (rand % 2 == 0)
                bombs.add(new Bomb());
        }
        //executing jets
        jets = new LinkedList<>();
        for (int j = 0; j<maxJets; j++){
            int rand = new Random().nextInt(50);
            if (rand % 3 ==0)
                jets.add(new Jets());
        }*/
}





