package warChallenge.amunition;

public abstract class Ammunition {
    String modelType;
    int modelNumber;
    public  abstract void fire();
    public abstract void changeModelType();
    public void description(){
        System.out.println("I am a very dangerous weapon in army");
    }
}
