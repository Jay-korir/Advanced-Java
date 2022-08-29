package warChallenge.weapons;

public class Bomb extends Weapon {
    private String bombType;
    private  int bombNumber;

    //public void changeBombType() {}
   // public void dropBomb(){}

    public Bomb(String bombType, int bombNumber) {
        this.bombType = bombType;
        this.bombNumber = bombNumber;
    }

    public String getBombType() {
        return bombType;
    }

    public void setBombType(String bombType) {
        this.bombType = bombType;
    }

    public int getBombNumber() {
        return bombNumber;
    }

    public void setBombNumber(int bombNumber) {
        this.bombNumber = 500;
    }

    @Override
    public void fire() {
        if (bombNumber > 0){
            if (bombType == "missile"){
                bombNumber--;
                System.out.println("a missile has been dropped ");
            }
            else if (bombType == "grenade");
            bombNumber --;
            System.out.println("grenade has been dropped");
        }
        else{
            bombNumber--;
            System.out.println("an atomic bomb/nuclear weapon dropped");
        }
    }

    @Override
    public void changeModelType() {
        if (bombType.equals("missile") )
            this.setBombType("grenade");
        else if (bombType == "grenade")
            this.setBombType("atomic");
        else
            this.setBombType("missile");
    }
}
