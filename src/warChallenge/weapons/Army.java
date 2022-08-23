package warChallenge.amunition;

import gun.Gun;
import warChallenge.Soldier;

public class Army {
    private Soldier[] soldiers;
    private Gun[] guns;
    private Tank[] tanks;


    public Soldier[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers = soldiers;
    }

    public Gun[] getGuns() {
        return guns;
    }

    public void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    public Tank[] getTanks() {
        return tanks;
    }

    public void setTanks(Tank[] tanks) {
        this.tanks = tanks;
    }
}
