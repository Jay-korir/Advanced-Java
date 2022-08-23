package warChallenge.amunition;

public class Jets {
    private  String jetType;
   private int ammunition;
   private  int maxAmmunition;
   private String specialization;

    public Jets() {
        this.jetType = "dual";
        this.specialization ="fighterBombs";
        this.maxAmmunition = 10000;
        reloadAmmunition();
    }

    public void reloadAmmunition() {
        ammunition = maxAmmunition;
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
    public void fireAmmunition(){
        if (ammunition > 0){
            if (jetType == "dual" && specialization == "fighterBombs"){
                ammunition -= 2;
                System.out.println("the dual jet has released 2 fighter bombs ✈️✈️");
            }
            ammunition --;
            System.out.println("the single jet has released one interceptor ✈✈️");
        }

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getMaxAmmunition() {
        return maxAmmunition;
    }

    public void setMaxAmmunition(int maxAmmunition) {
        this.maxAmmunition = maxAmmunition;
    }

    public String getJetType() {
        return jetType;
    }

    public void setJetType(String jetType) {
        this.jetType = jetType;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }
}
