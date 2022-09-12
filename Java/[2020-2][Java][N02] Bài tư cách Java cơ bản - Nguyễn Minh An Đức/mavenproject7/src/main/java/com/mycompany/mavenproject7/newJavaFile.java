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
    @SuppressWarnings("empty-statement")
    public static void main(String args[]) 
    {
        bai2[] a=new bai2[100];
//        int n;
        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhap so luong bo xu li: ");
//        n=sc.nextInt();
//        for(int i=0;i<n;i++)
//        {
//            System.out.println("Thong tin chip "+(i+1));
//            a[i]=new bai2();
//            a[i].nhap();
//        }
//        System.out.println("Danh sach chip nho:");
//        for(int i=0;i<n;i++)
//        {
//            a[i].xuat();
//        }
//        System.out.println("Sap xep chip nho:");
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                if((a[i].getDoRongBus()*a[i].getTocDoBus())>(a[j].getDoRongBus()*a[j].getTocDoBus()))
//                {
//                    bai2 temp=new bai2();
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        for(int i=0;i<n;i++)
//        {
//            a[i].xuat();
//        }
        int b;
        boolean nice=true;
        do{
        System.out.println("1.Them chip nho");
        System.out.println("2.Sua chip nho");
        System.out.println("3.Xoa chip nho");
            System.out.println("4.Sap xep chip nho");
            System.out.println("5.Danh sach chip nho");
        System.out.println("0.Thoat chuong trinh");
        b=sc.nextInt();
        int dem=0;

        
        switch(b)
        {
            case 1:
                System.out.println("Nhap thong tin chip nho:");
                a[dem]=new bai2();
                a[dem].nhap();
                dem++;
                break;
            case 2:
                String c;
                System.out.println("Nhap ma chip nho can sua");
                c=sc.nextLine();
                int i,kt=0;
                for(i=0;i<dem;i++)
                {
                    if(c==a[i].getMaChip());
                    {
                    System.out.println("Tim thay!");
                    kt=1;
                    break;
                    }
                }
                if(kt==1) 
                {
                    bai2 temp=new bai2();
                    System.out.println("Nhap thong tin sua:");
                    temp.nhap();
                    temp=a[i];
                }
                else
                    System.out.println("Khong tim thay chip nho can sua");
                break;
            case 3:
                String d;
                System.out.println("Nhap thong tin chip nho can xoa");
                d=sc.nextLine();
                int j,kt1=0;
                for(i=0;i<dem;i++)
                {
                    if(d==a[i].getMaChip());
                    {
                    System.out.println("Tim thay!");
                    kt1=1;
                    break;
                    }
                }
                if(kt1==1) 
                {
                    for(int k=i;k<dem-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                }
                else
                    System.out.println("Khong tim thay chip nho can xoa");
                break;
//            case 4:
//                    for(i=0;i<dem;i++)
//                        {
//                            for(j=i+1;j<dem;j++)
//                            {
//                                if((a[i].getDoRongBus()*a[i].getTocDoBus())>(a[j].getDoRongBus()*a[j].getTocDoBus()))
//                                {
//                                    bai2 temp2=new bai2();
//                                    temp2=a[i];
//                                    a[i]=a[j];
//                                    a[j]=temp2;
//                                }
//                            }
//                        }
//                    break;
            case 5:
                for(i=0;i<dem;i++)
                {
                    a[i].xuat();
                }
                break;
            default:
                System.out.println("Ket thuc chuong trinh");
                nice=false;
                break;
        }
}while(nice);
}
}