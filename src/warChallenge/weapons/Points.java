package warChallenge.weapons;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static warChallenge.weapons.Registration.Uname;

public class Points{
   public static String pointsPath = "scores.txt";
    public void scorePoints() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("The scores are here");

    }
    public static void writeToFile(String PATH, String str) {
        try {
            FileWriter myWriter = new FileWriter(PATH, true);
            myWriter.write(str + "\n");
            System.out.println();
            myWriter.flush();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void getPoints() throws IOException {
        FileReader fr = new FileReader(pointsPath);
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
    public static int getPointsUser(String player) throws IOException {
        int point = 0;
        for (int i = 0; i< readFile(pointsPath).size(); i++){
            if(readFile(pointsPath).get(i).get(0).equals(player)){

               point = point + Integer.parseInt(readFile(pointsPath).get(i).get(1).trim());
            }
        }
        return point;
        /*
        BufferedReader reader;
        reader = new BufferedReader(new FileReader(pointsPath));
        String data  =reader.readLine();
        while (data !=null){
            if (data.contains(Uname));
            System.out.println(data);
        }*/
    }

    private static ArrayList<ArrayList<String>> readFile(String PATH) throws FileNotFoundException {
        ArrayList<ArrayList<String>> allPlayers = new ArrayList();
        try {
            File myObj = new File(PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                ArrayList<String> myList = new ArrayList<String>(Arrays.asList(data.trim().split(",")));
                allPlayers.add(myList);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return allPlayers;
    }
}

