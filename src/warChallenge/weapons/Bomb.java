package warChallenge.weapons;

public class Bomb  {
    private String bombType;
    private  int bombNumber;
    private int bomb;

    int maxBomb;

    //public void changeBombType() {}
   // public void dropBomb(){}

    public Bomb() {
        this.bombType = "missile";
        this.bombNumber = 50;
        this.bomb = 50;
        this.maxBomb = 100;
        reloadBomb();
    }
    public void reloadBomb() {
        bomb = maxBomb;
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

    public void setBomb(int bomb) {
        this.bomb = bomb;
    }


    public void fire() {
        if (bombNumber > 0){
            if (bombType == "missile"){
                bombNumber--;
                System.out.println("a missile has been dropped #########");
                changeModelType();
            }
            else if (bombType == "grenade");
            bombNumber --;
            System.out.println("grenade has been dropped $$$$$$$$");
            changeModelType();
        }
        else{
            bombNumber--;
            System.out.println("an atomic bomb/nuclear weapon dropped%%%%%%");
            changeModelType();
        }
    }


    public void changeModelType() {
        if (bombType.equals("missile") )
            this.setBombType("grenade");
        else if (bombType == "grenade")
            this.setBombType("atomic");
        else
            this.setBombType("missile");
    }
    public int getBomb() {
        return getBomb();
    }
}
