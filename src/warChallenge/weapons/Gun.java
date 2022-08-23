package gun;



public class Gun implements shootable {

    int bullets;
    int maxBullets;
    char shootingMode; // S for single, A for automatic 5 bullets (per shot)
    public void reloadBullets() {
        bullets = maxBullets;
    }

    public char getShootingMode() {
        return shootingMode;
    }

    public void setShootingMode(char shootingMode) {
        this.shootingMode = shootingMode;
    }

    public void changeShootingMode() {
        if (shootingMode == 'S')
            this.setShootingMode('A');
        else
            this.setShootingMode('S');
    }

    public Gun() {
        this.shootingMode = 'S';
        this.maxBullets = 50;
        reloadBullets();
    }
    public void shootBullets() {
        if (bullets > 0)
        {
            if (shootingMode == 'S'){
                bullets --;
                System.out.println("-");
            }
            else {
                bullets -= 5;
                System.out.println("-----");
            }
        }
    }
    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public int getMaxBullets() {
        return maxBullets;
    }

    public void setMaxBullets(int maxBullets) {
        this.maxBullets = maxBullets;
    }
/*
    private AK47 ak47;
    private M16 m16;




    String gun;
    public Gun(String gun) {
        this.ak47 = new AK47();
        this.m16 = new M16();

    }
    //   public void shootBullets() { }


    public AK47 getAk47() {
        return ak47;
    }

    public void setAk47(AK47 ak47) {
        this.ak47 = ak47;
    }

    public M16 getM16() {
        return m16;
    }

    public void setM16(M16 m16) {
        this.m16 = m16;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    @Override
    public void reloadBullets() {

    }

    @Override
    public void shoot() {
        System.out.println("this is a gun of model AK47 shooting");
        this.ak47.shoot();


        System.out.println("this is a gun of model M16 shooting");
        this.m16.shoot();
    }

    public void changeShootingMode() {
                this.ak47.changeShootingMode();
                this.m16.changeShootingMode();
            }*/
        }





