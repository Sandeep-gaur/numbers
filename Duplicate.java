/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicate;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Duplicate {

   
    public static void main(String[] args) {
        System.out.println("enter the String:");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String str="";
        char c;
        int l=a.length();
        for(int i=0;i<l;i++){
            c=a.charAt(i);
            if(c!=' '){
                str=str+c;
                a=a.replace(c,' ');
                
            }}
            System.out.println("the original string is:"+str);
    }
    }
