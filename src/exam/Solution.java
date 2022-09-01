package exam;

import java.util.*;
import java.util.Collections;

public class Solution {
    public static void findMissingNum() {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        //int myArray[] = {1,2,3,4,6,7,8,9,10};
        int n = 100;
        int sumAll = (n * (n + 1)) / 2;
        int sumArray = 0;


        for (int i = 0; i <= n - 2; i++) {
            sumArray = sumArray + myArray[i];
        }
        int missingNum = sumAll - sumArray;
        System.out.println("missing number is " + missingNum);
    }

    public static void duplicateNumber() {
        int arr[] = {22, 4, 5, 6, 4, 67, 90, 22, 67};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void traverseList() {
        List<String> names = new LinkedList<String>();
        names.add("james");
        names.add("simon");
        names.add("mercy");
        names.add("bonny");
        names.add("george");

        Iterator<String> list = names.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }

    public static void listToArray() {
        ArrayList<String> oop = new ArrayList<String>();
        oop.add("inheritance");
        oop.add("encapsulation");
        oop.add("abstraction");
        oop.add("polymorphism");

        String[] namesArray = new String[oop.size()];
        oop.toArray(namesArray);
        System.out.println(oop);
    }

    public static void shuffleList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(137);
        numbers.add(2);
        numbers.add(78);
        numbers.add(359);

        System.out.println("before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("after shuffling: " + numbers);
    }

    public static void minAndMax() {
        TreeSet<Integer> mySet = new TreeSet<Integer>();
        mySet.add(567);
        mySet.add(4);
        mySet.add(56);
        mySet.add(120);
        System.out.println("minimum :" + mySet.first());
        System.out.println("maximum :" + mySet.last());
    }

    public static void sortArray() {
        int[] arr = {89, 87, 4, 179, 8906, 50, -9, -567};
        Arrays.sort(arr);
        System.out.println("sorting in ascending order:" + Arrays.toString(arr));
         for (int i = arr.length-1; i >=0; i--){
             System.out.print(arr[i] + "  ");
             System.out.println();


         }
    }

    public static void manipulateString(String str) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whitespaces = 0;
        for (Character ch : str.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isSpaceChar(ch)) {
                whitespaces++;

            }


    }

    System.out.println("number of vowels:" + vowels);
    System.out.println("number of consonants :" + consonants);
    System.out.println(" number of digits:" + digits);
    System.out.println("number of whitespaces:" + whitespaces);
}
public static void occurrenceAlphabet(String str){
    /*HashMap <Character, Integer> countMap = new HashMap<>();
    for (int i = 0; i <=str.length()-1; i++)
    {
        if(countMap.containsKey(str.charAt(i)))
        {
            int count = countMap.get(str.charAt(i));
            countMap.put(str.charAt(i), ++count);
        }
        else
        {
            countMap.put(str.charAt(i),1);
        }
    }
    System.out.println(countMap);
    */
    int count[] = new int[256];

    int len = str.length();

    for (int i = 0; i < len; i++)
        count[str.charAt(i)]++;

    char ch[] = new char[str.length()];
    for (int i = 0; i < len; i++) {
        ch[i] = str.charAt(i);
        int occ = 0;
        for (int j = 0; j <= i; j++) {
            if (str.charAt(i) == ch[j])
                occ++;
        }

        if (occ == 1)
            System.out.println("Occurrence of "+ str.charAt(i) + ":" + count[str.charAt(i)]);
    }
}





    public static void main(String[] args) {
        findMissingNum();
        duplicateNumber();
        traverseList();
        listToArray();
        shuffleList();
        minAndMax();
        sortArray();
        manipulateString("jam3es  kori4r");
        occurrenceAlphabet("google");
      class  myComparator implements Comparator{

          @Override
          public int compare(Object o1, Object o2) {
              Integer i1 = (Integer) 01;
              Integer i2 = (Integer) 02;
              if (i1<i2)
                  return +1;
              else if (i1>i2) {
                  return -1;
              }
              else
                  return 0;
          }
      }

    }

}
