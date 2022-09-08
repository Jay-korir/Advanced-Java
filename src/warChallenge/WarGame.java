package warChallenge;


import warChallenge.weapons.DifficultyLevel;

import java.io.IOException;
import java.util.Scanner;

import static warChallenge.WarGameController.registration;
import static warChallenge.weapons.Registration.addMembers;
import static warChallenge.weapons.Registration.name;

public class WarGame {


// - Setup the game [Soldiers, Army (Ally, Enemy), Weapon Arsenal]
    // - Run the game [ Soldiers shoot at enemy, Control Weapons + Arsenal ]
    // - Control the game. Determine, when the game ends...
    // [1 - All soldiers are dead,
    // [2 - No weapon has bullets


    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("==welcome to the game the number one game ======");
       registration();

        System.out.println( "====="+name +"======now enjoy the game =====\n");
        System.out.println("hey you welcome to the war game thug of war challenge");
        System.out.println("Select a level to play \n1.EASY \t2.MEDIUM\t3.HARD");
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();
        switch (selection){
            case 1:
                Long start = System.currentTimeMillis();
                new WarGameController(DifficultyLevel.EASY).run();
                Long end = System.currentTimeMillis();
                Long total = end-start;
                System.out.println("total time" + "=" + total);
                break;
            case 2:
                Long start1 = System.currentTimeMillis();
                new WarGameController(DifficultyLevel.MEDIUM).run();
                Long end1 = System.currentTimeMillis();
                Long total1 = end1-start1;
                System.out.println("total time" +"=" + total1);
                break;
            case 3:
                Long start2 = System.currentTimeMillis();
                new WarGameController(DifficultyLevel.HARD).run();
                Long end2 = System.currentTimeMillis();
                Long total2 = end2-start2;
                System.out.println("total time" + "=" + total2);
                break;
            default:
                System.out.println("wrong selection try again");


        }



            }

        }





