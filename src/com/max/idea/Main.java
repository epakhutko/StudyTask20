package com.max.idea;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Input number of strings: ");
        Scanner inp = new Scanner(System.in);
        int numSt = inp.nextInt()+1;
        int symbolNum=0;
        int stringNum=0;
        System.out.printf("Input the strings:\n");
        String[] TextArr = new String[numSt];
        for (int i=0; i<numSt; i++) {
            TextArr[i] = inp.nextLine();
        }
        for (int q=0; q<numSt; q++) {
            int count=0;
            int len=TextArr[q].length();
            char[] Arr = new char[len];
            for (int j = 0; j < len; j++) {
                Arr[j] = TextArr[q].charAt(j);
            }
            boolean check;
            for (int w=1; w<len; w++) {
                check=false;
                for (int e=0; e<w; e++) {
                    if (Arr[e]==Arr[w]) {
                        check = true;
                    }
                }
                if (check==false) {
                    count++;
                }
            }
            if (count>symbolNum) {
                symbolNum=count;
                stringNum=q;
            }
        }
        System.out.printf("Answer: %s", TextArr[stringNum]);
    }
}
