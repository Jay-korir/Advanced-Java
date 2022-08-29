package warChallenge.weapons;

import warChallenge.Soldier;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Army {
    private ArrayList<Soldier> soldiers;
    private ArrayList<Gun> guns;
    private LinkedList<Tank> tanks;
    private static final int maxGuns = 40;
    private static final int  maxTanks = 10;

    public Army(){
        guns = new ArrayList<>();
        //guns = new Gun[maxGuns];
        for (int k = 0; k<maxGuns; k++){
            int rand = new Random().nextInt(20);
      if (rand % 3 == 0)
          guns.add(new Gun());
          //guns[k] = new Gun();
      /*else if (rand % 2 == 0)
          guns.add(new Gun());
          //guns[k] = new Gun();
          else
              guns.add(new Gun());
            // guns[k] = new Gun();
            */



        }
        //executing the tank
        tanks = new LinkedList<>();
        for (int t =0; t<maxTanks; t++){
            int rand = new Random().nextInt(10);
            if (rand % 2 == 0)
                tanks.add(new Tank());



        }
    }


    public ArrayList<Soldier> getSoldiers() {
        return soldiers;
    }


    public void setSoldiers(ArrayList<Soldier> soldiers) {
        this.soldiers = soldiers;
        this.assignGuns();
    }
    public boolean hasWeapon(Army army){
        for (int k = 0;k<soldiers.size();k++){
            if (army.getSoldiers().get(k).soldierHasGun())
                return true;
        }
        return false;
    }
public void assignGuns(){
        for (int s = 0; s <soldiers.size(); s ++){
       int gunIndex = new Random().nextInt(maxGuns-1);
       soldiers.get(s).setGun(guns.get(gunIndex));
       //soldiers[s].setGun(guns[gunIndex]);
        }
}
public void assignTanks(){
        for (int s =0; s<soldiers.size();s++){
            int tankIndex = new Random().nextInt(maxTanks-1);
            if (soldiers.get(s).soldierHasGun()){
                soldiers.get(s).setTank(tanks.get(tankIndex));
            }

        }
}
    public ArrayList<Gun> getGuns() {
        return guns;
    }

    public void setGuns(ArrayList<Gun> guns) {
        this.guns = guns;
    }

    public LinkedList<Tank> getTanks() {
        return tanks;
    }

    public void setTanks(LinkedList<Tank> tanks) {
        this.tanks = tanks;
    }

    // public void setSoldiers(List<Soldier> allySoldiers) {

   // }
}
