package warChallenge;

import warChallenge.weapons.Gun;
import warChallenge.weapons.*;

public class Soldier {
    private Gun gun;
    private boolean alive;


    private Tank tank;
    private Bomb bomb;
    private Jets jets;
    private TearGas tearGas;
    private MarineShip marineShip;
    private String militaryId;
    private char type; // A or E

    public Soldier(String militaryId) {
        this.militaryId = militaryId;
        this.alive = true;
        this.gun = new Gun();
        this.tank = new Tank();
        this.bomb = new Bomb("grenade",50);
        this.jets = new Jets();
        this.tearGas = new TearGas();
        this.marineShip = new MarineShip();


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
    public boolean soldierHasGun(){
        if (this.gun.getGun()>0)
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

    public void shooting(){
          if (this.alive==true) {
        System.out.println(this.militaryId+" shooting");
        this.gun.shootBullets();
          }
    }
    public void shot(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.gun.setBullets(0);
    }
    public void shelled(){
        this.alive = false;
        System.out.println(this.militaryId+ "  just died");
        this.tank.setShell(0);
    }

    public void explode(){
        this.marineShip.description();
        System.out.println(this.militaryId +"   explode from the ship");
        this.marineShip.fire();
    }
    public void changeMarine(){
        this.marineShip.changeModelType();
    }
    public void tearGasThem(){
        this.tearGas.description();
        System.out.println(this.militaryId +"   throw the teargas");
        this.tearGas.fire();
    }
public  void changeModelType(){
        this.tearGas.changeModelType();
}
    public void shoot() {

            System.out.println(this.militaryId + " shooting");
            this.gun.shootBullets();


    }

    public void changeShootingMode() {
        this.gun.changeShootingMode();
    }

    public void shell() {
        System.out.println(this.militaryId + "  shelling");
        this.tank.fireShell();
    }
    public void changeTankModel(){
        this.tank.changeTankModel();
    }

    public void releaseBomb(){
        System.out.println(this.militaryId + " bombed the enemy");
        this.bomb.fire();
    }
    public void changeBombType(){
        this.bomb.changeModelType();
    }
    public  void  fireJet(){
        System.out.println(this.militaryId + "jetting");
        this.jets.fireAmmunition();
    }
    public void changeJetType(){
        this.jets.changeJetType();
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }
}
