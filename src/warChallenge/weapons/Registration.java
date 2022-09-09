package warChallenge.weapons;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Registration {
   static String path = "WarGame.txt";


    public static String name;

    static  DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-YYYY");
   public static  String date = LocalDate.now().format(myFormatObj);
    public void register() throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name to continue: ");
         name = sc.nextLine();
         addMembers();
          System.out.println("=====welcome to the warGame=====starting shortly");
                    System.out.println();
                    Thread.sleep(4000);


                }
public static void addMembers() {

    try {
     BufferedWriter   bw = new BufferedWriter(new FileWriter(path, true));
        bw.write(name + "  "+ date + "\n");

        bw.close();
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    System.out.println("success");

}


public static void getMembers () throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);

                }
                br.close();
                fr.close();
            }
        }
