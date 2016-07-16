/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;


public class Reverse {

    
    public static void main(String[] args) {
        System.out.println("enter the value:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int temp=0;
        int n;
        while(a>0){
         n=a%10;
         temp=temp*10+n;
         a=a/10;
        }
        System.out.println("the reverse of no: "+temp);
}}
