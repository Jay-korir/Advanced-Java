package gun;

import warChallenge.shootable;

public class AK47 implements shootable {

int bullets, maxBullets;
char shootingMode;

    public AK47() {
        this.bullets = bullets;
        this.maxBullets = maxBullets;
        this.shootingMode = 'S';
        reloadBullets();
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

    public char getShootingMode() {
        return shootingMode;
    }

    public void setShootingMode(char shootingMode) {
        this.shootingMode = shootingMode;
    }

    @Override
    public void reloadBullets() {
        bullets = maxBullets;
    }

    @Override
    public void shootBullets() {
        if (bullets > 0)
        {
            if (shootingMode =='S'){
                bullets --;

                System.out.println("-");
            }
            else {
                bullets -= 5;
                System.out.println("-----");
            }
        }
    }

    @Override
    public void changeShootingMode() {
        if (shootingMode == 'S')
            this.setShootingMode('A');
        else
            this.setShootingMode('S');
    }
}
