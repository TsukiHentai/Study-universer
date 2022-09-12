package com.mycompany.linhkiendientu;
import java.util.Scanner;
class LinhKien
{
    String maSP;
    String hangSX;
    int SoLuong;
    void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap vao ma san pham: ");
        maSP=sc.nextLine();
        System.out.println("Nhap vao hang san xuat: ");
        hangSX=sc.next();
        System.out.println("Nhap vao so luong hang co san: ");
        SoLuong=sc.nextInt();
    }
    void Xuat()
    {
        System.out.println("Ma san pham: "+maSP);
        System.out.println("Hang san xuat: "+hangSX);
        System.out.println("So luong co san: "+SoLuong);
    }
}
class DienTro extends LinhKien
{
    int GiaTri;
    String MaKichThuoc;
    int CongSuat;
    @Override
    void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap gia tri dien tro: ");
        GiaTri=sc.nextInt();
        System.out.println("Nhap ma kich thuoc: ");
        MaKichThuoc=sc.next();
        System.out.println("Nhap cong suat: ");
        CongSuat=sc.nextInt();
    }
    @Override
    void Xuat()
    {
        super.Xuat();
        System.out.println("Gia tri dien tro: "+GiaTri);
        System.out.println("Ma kich thuoc: "+MaKichThuoc);
        System.out.println("Cong suat: "+CongSuat);
    }
}
class CuonCam extends LinhKien
{
    int DienCam;
    int DongDienLamViec;
    @Override
    void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap dien cam: ");
        DienCam=sc.nextInt();
        System.out.println("Nhap dong dien lam viec: ");
        DongDienLamViec=sc.nextInt();
    }
    @Override
    void Xuat()
    {
        super.Xuat();
        System.out.println("Dien cam:"+DienCam);
        System.out.println("Dong dien lam viec: "+DongDienLamViec);
    }
}
class TuDien extends LinhKien
{
    String LoaiTu;
    int DienApLamViec;
    int DienDung;
    @Override
    void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap loai tu: ");
        LoaiTu=sc.next();
        System.out.println("Nhap dien ap lam viec: ");
        DienApLamViec=sc.nextInt();
        System.out.println("Nhap dien dung: ");
        DienDung=sc.nextInt();
    }
    @Override
    void Xuat()
    {
        super.Xuat();
        System.out.println("Loai tu: "+LoaiTu);
        System.out.println("Dien ap lam viec: "+DienApLamViec);
        System.out.println("Dien dung: "+DienDung);
    }
}
class BJT extends LinhKien
{
    int DienApChoPhep;
    int DongGioiHan;
    int HeSo;
    String loai;
    @Override
    void Nhap()
    {
        Scanner sc=new Scanner(System.in);
        super.Nhap();
        System.out.println("Nhap dien ap cho phep: ");
        DienApChoPhep=sc.nextInt();
        System.out.println("Nhap dong gioi han: ");
        DongGioiHan=sc.nextInt();
        System.out.println("Nhap he so: ");
        HeSo=sc.nextInt();
        System.out.println("Nhap loai: ");
        loai=sc.next();
    }
    @Override
    void Xuat()
    {
        super.Xuat();
        System.out.println("Dien ap cho phep: "+DienApChoPhep);
        System.out.println("Dong gioi han: "+DongGioiHan);
        System.out.println("He so: "+HeSo);
        System.out.println("Loai: "+loai);
    }
}
public class LinhKienDienTu {
    public static void TimKiem(LinhKien a[],int n)
    {
        int dem=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma linh kien can tim");
        String tk;
        tk=sc.nextLine();
        for(int i=0;i<n;i++)
        {
            if(tk==a[i].maSP);
            a[i].Xuat();
            dem++;
        }
        if(dem==0)
            System.out.println("Khong tim thay linh kien can tim!");
    }
    public static void SapXep(LinhKien a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i].maSP.compareTo(a[i].maSP)>0)
                {
                    LinhKien temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong linh kien: ");
        n=sc.nextInt();
        LinhKien[] a=new LinhKien[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Nhap san phan:");
            System.out.println("1. Dien tro.");
            System.out.println("2. Cuon cam.");
            System.out.println("3. Tu dien.");
            System.out.println("4.BJT");
            int b;
            b=sc.nextInt();
            if(b==1)
                a[i]=new DienTro();
            if(b==2)
                a[i]=new CuonCam();
            if(b==3)
                a[i]=new TuDien();
            if(b==4)
                a[i]=new BJT();
            a[i].Nhap();
        }
        System.out.println("Danh sach linh kien la: ");
        for(int j=0;j<n;j++)
        {
            a[j].Xuat();
        }
        TimKiem(a,n);
        SapXep(a,n);
    }
}