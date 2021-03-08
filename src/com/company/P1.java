package com.company;
import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first, second;
        System.out.println("please enter first number:");
        first = input.nextInt();
        System.out.println("please enter second number:");
        second = input.nextInt();
        int gcd , tmp ;
        if(first < second){
            tmp = first ;
            first = second ;
            second = tmp ;
        }
        while(first % second != 0){
            tmp = first % second ;
            first = second ;
            second = tmp ;
        }
        gcd = second ;
        if(gcd == 1){
            System.out.println("The numbers are coprime");
        }
        else{
            System.out.println("The numbers are NOT coprime");
        }
    }
}