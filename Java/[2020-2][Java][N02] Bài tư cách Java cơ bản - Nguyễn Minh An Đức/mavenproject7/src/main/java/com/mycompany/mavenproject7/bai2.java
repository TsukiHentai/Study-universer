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
public class bai2 
{
        private String MaChip;
        private int DoRongBus;
        private int TocDoBus;
        private String DungLuong;
    public void test()
    {  
    }
    public void test(String MaChip, int DoRongBus, int TocDoBus, String DungLuong)
    {
        this.MaChip=MaChip;
        this.DoRongBus=DoRongBus;
        this.TocDoBus=TocDoBus;
        this.DungLuong=DungLuong;
    }
    public void nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma chip: ");
        MaChip=sc.next();
        System.out.println("Nhap toc do bus: ");
        TocDoBus=sc.nextInt();
        System.out.println("Nhap dung luong: ");
        DungLuong=sc.next();
        System.out.println("Nhap do rong bus: ");
        DoRongBus=sc.nextInt();
    }
    public void xuat()
    {
        System.out.println("Ma chip: "+ MaChip);
        System.out.println("Do rong bus: "+DoRongBus);
        System.out.println("Toc do bus: "+TocDoBus);
        System.out.println("Dung luong: "+DungLuong);
    }
    public String getMaChip()
    {
        return MaChip;
    }
    public int getTocDoBus()
    {
       return TocDoBus; 
    }
    public int getDoRongBus()
    {
        return DoRongBus;
    }
   }

