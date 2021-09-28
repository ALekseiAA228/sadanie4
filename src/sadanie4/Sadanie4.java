/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sadanie4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Sadanie4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numss = new int[100];
        int maximum=100,minimum=1;
        int num=1;
        for (int i = 0; i < 100; i++){
            Random random = new Random();
            if(maximum % 2 == 1)
                maximum = maximum + 1;
                int range = (maximum - minimum + 1) / 2;
                numss[i] = random.nextInt(range) * 2 + minimum;
            
        }
        int k=0;
        Arrays.sort(numss);
        for (int i = 0; i < numss.length; i++) {
            System.out.printf("%4d",numss[i]);
            k++;
            if (k==10){
                System.out.println();
                k=0;
            }
            
        }
    int sum = 0;
    for (int i = 0; i < numss.length; i++) {
        sum = sum + numss[i];
    }
    int numGotov=sum/10;
    System.out.println("| среднее арефметическое:"+numGotov);
}
}