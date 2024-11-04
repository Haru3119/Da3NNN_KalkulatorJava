package com.ykhr.nnnday4_kalkulator;

import java.util.Scanner;

public class NnnDay4_Kalkulator {

    public static void main(String[] args) {
        char oprt;
        double num1, num2, hsl;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Mssukkan Operator : +, -, *, atau /");
        oprt = scan.next().charAt(0);
        
        System.out.println("Masukkan Bilanagan Pertama : ");
        num1 = scan.nextDouble();
        
        System.out.println("Masukkan Bilanagan Kedua : ");
        num2 = scan.nextDouble();
        
        switch (oprt) {
            case  '+' :
                hsl = num1 + num2;
                System.out.printf(num1 + " + " + num2 + " = " + hsl);
                break;
            
            case  '-' :
                hsl = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + hsl);
                break;
                
            case  '*' :
                hsl = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + hsl);
                break;
                
            case  '/' :
                hsl = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + hsl);
                break;
                
            default : 
                System.out.println("Invalid!!!");
                break;  
        };
        
        scan.close();
    }
}
