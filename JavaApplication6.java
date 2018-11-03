/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner b=new Scanner (System.in);
        int a=b.nextInt();
        int f=1;
        for(int i=1;i<=a;i++)
        {
            f=f*i;
        }
        System.out.print(f);
    }
    
}
