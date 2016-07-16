/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package largest;

import java.util.Scanner;


public class Largest {

   
    public static void main(String[] args) {
        System.out.println("enter the values:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        if((a>b)&&(a>c))
        {
                System.out.println("a is greater");
                
            }
            else if((b>a)&&(b>c))
            {
                System.out.println("b is greater");
            }
            
            else if((c>a)&&(c>b))
                System.out.println("c is greater");
            }
        }
