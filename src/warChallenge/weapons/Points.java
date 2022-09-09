package warChallenge.weapons;

import java.io.*;
import java.util.*;

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
            myWriter.flush();
            myWriter.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

public static void readFile() throws IOException {

    ArrayList<String> myList;
    try (BufferedReader bufReader = new BufferedReader(new FileReader(pointsPath))) {
        myList = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            myList.add(line);
            line = bufReader.readLine();
        }
        bufReader.close();
    }
    for (String itr:myList) {
        System.out.println(itr);
                }

   // Iterator itr = myList.iterator();
//while (itr.hasNext())
  //  System.out.println(itr.next());
//return myList.stream().toArray();

}

}





