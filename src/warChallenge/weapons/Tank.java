package warChallenge.weapons;

public class Tank  implements Actionable{
    private String tankNumber;
    public String tankModel; // T-72
    int shell;
    int maxShell;

    public Tank() {
        this.tankNumber = "1234r";
        this.tankModel = "canon";
        this.shell = 50;
        this.maxShell = 100;
        reloadShell();
    }
    public void changeModel() {
        if (tankModel == "canon")
            this.setTankModel("longbow");
        else
            this.setTankModel("canon");
    }

    public void fire() {
        if (shell > 0)
        {
            if (tankModel == "canon"){
                shell --;
                System.out.println("the canon has reached 3000m away");
                changeModel();
            }
            else {
                shell --;
                System.out.println("the shell has reached an enemy 8000M away");
                changeModel();
            }
        }

    }

    public void reloadShell() {
        shell = maxShell;
    }

    public String getTankNumber() {
        return tankNumber;
    }

    public void setTankNumber(String tankNumber) {
        this.tankNumber = tankNumber;
    }

    public String getTankModel() {
        return tankModel;
    }

    public void setTankModel(String tankModel) {
        this.tankModel = tankModel;
    }

    public int getShell() {
        return shell;
    }

    public void setShell(int shell) {
        this.shell = shell;
    }

    public int getMaxShell() {
        return maxShell;
    }

    public void setMaxShell(int maxShell) {
        this.maxShell = maxShell;
    }

    public int getTank() {
        return getTank();
    }
}


