package warChallenge.weapons;

public class MarineShip extends Weapon {
    public MarineShip() {
        this.modelType = "tankerShip";
        this.modelNumber = 4000;
    }

    @Override
    public void fire() {
        if (modelNumber>0){
            if (modelType.equals("tankerShip")){
                System.out.println("marine ship releases the teargas @@@@");
                modelNumber--;
            }
            else
                System.out.println("marine ship releases the double shift teargas @@");
            modelNumber += 2;
        }

    }

    @Override
    public void changeModelType() {
        if (modelType.equals("tankerShip") )
            modelType = "containerShip";
        else
            modelType = "containership";
    }

    @Override
    public void description() {
        System.out.println("this is an example of polymorphism through overridng..marine ship atack");
    }
}
