package warChallenge.weapons;

public class TearGas extends Weapon {
    public TearGas() {
        this.modelType= "CN1";
        this.modelNumber = 500;
    }

    @Override
    public void fire() {
        if (modelNumber>0){
            if (modelType.equals("CN1")){
            System.out.println("GSU releases the teargas @@@@");
            modelNumber--;
            }
            else
                System.out.println("GSU  releases the double shift teargas @@");
            modelNumber += 2;
        }
    }

    @Override
    public void changeModelType() {
        if (modelType.equals("CN1") )
            modelType = "CN2";
else
    modelType = "CN1";
    }
}
