/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject7;

import java.util.Scanner;

/**
 *
 * @author Pro build
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        bai2 a[]=new bai2[100];
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so luong bo xu li: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Thong tin chip "+(i+1));
            a[i]=new bai2();
            a[i].nhap();
        }
        System.out.println("Danh sach chip nho:");
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
        System.out.println("Sap xep chip nho:");
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i].getDoRongBus()*a[i].getTocDoBus())>(a[j].getDoRongBus()*a[j].getTocDoBus()))
                {
                    bai2 temp=new bai2();
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
  
}
}