package warChallenge.weapons;

public class Jets {
    private  String jetType;
   private int missile;
   private  int maxMissile;
   private String specialization;

    public Jets() {
        this.jetType = "dual";
        this.specialization ="fighterBombs";
        this.maxMissile = 10000;
        reloadAmmunition();
    }

    public void reloadAmmunition() {
        missile = maxMissile;
    }
public void  changeSpecialization(){
        if(specialization.equals("fighterBombs")){
            this.setSpecialization("interceptor");
        }
        else
            this.setSpecialization("fighterBombs");
}
    public void  changeJetType(){
        if(jetType.equals("dual")){
            this.setJetType("single");
            this.setSpecialization("interceptor");
        }
        else
            this.setJetType("dual");
        this.setSpecialization("fighterBombs");
    }
    public void fireMissile(){
        if (missile > 0){
            if (jetType == "dual" && specialization == "fighterBombs"){
                missile -= 2;
                System.out.println("the dual jet has released 2 fighter bombs ✈️✈️");
            }
            missile --;
            System.out.println("the single jet has released one interceptor ✈✈️");
        }

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMaxMissile() {
        return maxMissile;
    }

    public void setMaxMissile(int maxMissile) {
        this.maxMissile = maxMissile;
    }

    public String getJetType() {
        return jetType;
    }

    public void setJetType(String jetType) {
        this.jetType = jetType;
    }

    public int getMissile() {
        return missile;
    }

    public void setMissile(int missile) {
        this.missile = missile;
    }

    public int getJets() {
        return getJets();
    }


}
