/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject6;

import java.util.Scanner;

/**
 *
 * @author Pro build
 */
public class NewClass {
    public static boolean check(int n) 
    {  
        int temp = (int)Math.sqrt(n);
        if(temp*temp == n) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String [] args)
    {
        int n;
        System.out.println("Nhập số cần kiêm tra: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(check(n)==true)
            System.out.println(n+ " là số chính phương");
        else
            System.out.println(n+ " không là số chính phương");
    }
}
