package warChallenge;

import warChallenge.weapons.Gun;
import warChallenge.weapons.*;

public class Soldier {
    private Gun gun;
    private boolean alive;
    private Tank tank;
    private Bomb bomb;
    private Jets jets;
    private String militaryId;
    private char type; // A or E

    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.alive = true;
        this.gun = new Gun();
        this.tank = new Tank();
        this.bomb = new Bomb();
        this.jets = new Jets();
            }

    public boolean isAlive()
    {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean gunHasBullets(){
        if (this.gun.getBullets()>0)
            return true;
        else
            return false;
    }
    public boolean tankHasShell(){
        if (this.tank.getShell()>0)
            return true;
        else
            return false;
    }
    public boolean bombHasShell(){
        if (this.bomb.getBombNumber()>0)
            return true;
        else
            return false;
    }
    public boolean jetHasMissile(){
        if (this.jets.getMissile()>0)
            return true;
        else
            return false;
    }
    public boolean soldierHasGun(){
        if (this.gun.getGun()>0)
            return true;
        else
            return false;
    }
    public boolean soldierHasBomb(){
        if (this.bomb.getBomb()>0)
            return true;
        else
            return false;
    }
    public boolean soldierHasTank(){
        if (this.tank.getTank()>0)
            return true;
        else
            return false;
    }
    public boolean soldierHasJets(){
        if (this.jets.getJets()>0)
            return true;
        else
            return false;
    }

    public void setGun(Gun gun){
        this.gun = gun;
    }

    public Gun getGun() {
        return gun;
    }


    public void shoot() {
        if (this.alive = true) {
            System.out.println(this.militaryId + " shooting");
            this.gun.shootBullets();
        }
    }
    public void shell() {
        if (this.alive == true){
            System.out.println(this.militaryId + "  shelling");
            this.tank.fire();
        }
    }

    public static int allyCount =0;
    public static int enemyCount =0;
    public void shot(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.gun.setBullets(0);

    }



    public void changeShootingMode() {
        this.gun.changeShootingMode();
    }


    public void changeTankModel(){
        this.tank.changeModel();
    }

    public void releaseBomb(){
        System.out.println(this.militaryId + " released a bomb");
        this.bomb.fire();
    }
    public void changeBombType(){
        this.bomb.changeModelType();
    }
    public  void  fireJet(){
        System.out.println(this.militaryId + "jetting");
        this.jets.fireMissile();
    }
    public void changeJetType(){
        this.jets.changeJetType();
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public Bomb getBomb() {
        return bomb;
    }

    public void setBomb(Bomb bomb) {
        this.bomb = bomb;
    }

    public Jets getJets() {
        return jets;
    }

    public void setJets(Jets jets) {
        this.jets = jets;
    }
    public void assignGun() {
this.gun = gun;
        }

    public void assignTanks () {
            this.tank = tank;
            }
    public void assignBombs () {
        this.bomb = bomb;
            }
    public void assignJets () {
        this.jets = jets;
            }

        }
