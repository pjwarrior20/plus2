

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;

class fisrt1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
           
      
            int a = scanner.nextInt();
            int k = scanner.nextInt();

            
            int[] weights = new int[a];
            for (int i = 0; i < a; i++) {
                weights[i] = scanner.nextInt();
            }

           
            Arrays.sort(weights);

           
            int chef = 0;
            int son = 0;

            for (int i = a - 1; i >= 0; i--) {
                if (a - i <= k) {
                    son += weights[i];
                } else {
                    chef += weights[i];
                }
            }

           
            int d = chef - son;

        
            System.out.println(d);
        }

        scanner.close();
    }
}