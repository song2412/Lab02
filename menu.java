/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author songh
 */
public class menu {
    public static void main(String[] args) {
        System.out.println("----------Menu------");
        System.out.println("Giai phuong trinh bac nhat");
        System.out.println("Giai phuong trinh bac hai");
        System.out.println("Tinh tien dien");
        System.out.println("---------End--------");
        Scanner sc=new Scanner(System.in);
        int chon=sc.nextInt();
        switch (chon)
   {
        case 1:
            BAITAP2.PT01();
            break;
        case 2:
         Bai201.PT02();
         break;
        case 3:
        Lab03.tienDien();
        case 4:
            break;
            default:
            System.err.println("Nhap sai");
        }
    }
}      
