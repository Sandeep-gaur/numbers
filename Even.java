/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package even;

import java.util.Scanner;


public class Even {

    
    public static void main(String[] args) {
        System.out.println("enter the no:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0){
            System.out.println("the no:is even");
        }
            else
        {
            System.out.println("the no: is odd");
        }
        }
    }

