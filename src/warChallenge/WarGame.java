package warChallenge;





public class WarGame {


// - Setup the game [Soldiers, Army (Ally, Enemy), Weapon Arsenal]
    // - Run the game [ Soldiers shoot at enemy, Control Weapons + Arsenal ]
    // - Control the game. Determine, when the game ends...
    // [1 - All soldiers are dead,
    // [2 - No weapon has bullets
  /*  private static Soldier[] createSoldiers() {
        Soldier[] soldiers = new Soldier[1000];
        for (int k = 0; k < 1000; k++) {
            Soldier soldier = new Soldier("MIL_ID_000747");
            soldiers[k] = soldier;
        }
        return soldiers;
    }
*/
//from main// Army army = new Army();
//       // army.setSoldiers(createSoldiers());

    public static void main(String[] args) throws InterruptedException {

       // WarGameController.operations();
       new WarGameController().run();

            }

        }





