/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package positive;

import java.util.Scanner;


public class Positive1 {

    
    public static void main(String[] args) {
        System.out.println("Enter the no:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>0){
            System.out.println("the no: is positive");
        }
            else if(a<0){
                System.out.println("the no: is negative");
            }
            else{
                System.out.println("the no:is zero");
                }
        }
    }
