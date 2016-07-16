/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Scanner;


public class sample{

   
    public static void main(String[] args) {
        
        System.out.println("Enter the string:");
        Scanner s=new Scanner(System.in);
         String a=s.nextLine();
         String b=new StringBuffer(a).reverse().toString();
         System.out.println("the reversed string is:"+b);
         
        
        
    }
}
