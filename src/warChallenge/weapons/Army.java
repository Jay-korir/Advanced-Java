package warChallenge.weapons;

import warChallenge.Soldier;
import java.util.LinkedList;


public class Army {
    private LinkedList<Soldier> soldiers;

    public LinkedList<Soldier> getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(LinkedList<Soldier> soldiers) {
        this.soldiers = soldiers;
        this.assignWeapon();

    }
    public boolean hasWeapon(Army army){
        for (int k = 0; k< soldiers.size(); k++){
            if (army.getSoldiers().get(k).soldierHasGun()||army.getSoldiers().get(k).soldierHasTank() )
                return true;
        }
        return false;
    }


public void assignWeapon(){
    for (int s = 0; s < 15; s++) {
        soldiers.get(s).assignGun();
    }
    for (int s =15; s < 20; s++) {
        soldiers.get(s).assignTanks();
    }
    for (int s = 20; s < 25; s++) {
        soldiers.get(s).assignBombs();
    }
    for (int j = 25; j < soldiers.size(); j++) {
        soldiers.get(j).assignJets();;
    }
}


}
