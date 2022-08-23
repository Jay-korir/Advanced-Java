package warChallenge.amunition;

public class Tank {
    private String tankNumber;
    public String tankModel; // T-72
    int shell;
    int maxShell;

    public Tank(String tankNumber, String tankModel, int shell, int maxShell) {
        this.tankNumber = tankNumber;
        this.tankModel = tankModel;
        this.shell = shell;
        this.maxShell = maxShell;
        reloadShell();
    }
    public void changeTankModel() {
        if (tankModel == "canon")
            this.setTankModel("longbow");
        else
            this.setTankModel("canon");
    }

    public void fireShell() {
        if (shell > 0)
        {
            if (tankModel == "canon"){
                shell --;
                System.out.println("the shell has reached 3000m away");
            }
            else {
                shell --;
                System.out.println("the shell has reached an enemy 8000M away");
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
}

