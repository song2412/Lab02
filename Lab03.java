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
public class Lab03 {
    public static void tienDien() {
        Scanner sc= new Scanner(System.in);
        int soDien,tien;
        System.out.println("Nhap so Dien");
        soDien=sc.nextInt();
        if(soDien<50)
        {
            tien = soDien*1000;
        }
        else{
            tien=50*1000+(soDien-50)*1200;
        }
        System.out.println("so tien phai tra la:"+tien);
    }
    public static void main(String[]args){
        tienDien();
    }
        
   }
