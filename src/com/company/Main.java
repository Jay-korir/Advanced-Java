package com.company;

import java.util.Scanner;

import static com.company.Solution.xyBalance;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.repeatSeparator("this","and",2));
        System.out.println(solution.xyBalance("aaxbby"));
       // System.out.println(solution.xyBalance("xxxxxxxxxy"));
        System.out.println(solution.prefixAgain("abXYabc", 1));
        System.out.println(solution.zipZap("zzzzzipzop"));
    }
}
