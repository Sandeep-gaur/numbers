/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;


public class Factorial {

   
    public static void main(String[] args) {
        System.out.println("enter the value:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        
        }
            System.out.println("the factorial is"+fact);
    }
}
