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
public class Bai201 {
    public static void PT02() {
        double a,b,c,x1,x2,delta;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
        System.out.println("Nhap c:");
        c=sc.nextDouble();
        delta=Math.pow(a,b)-4*a*c;
        if(a==0){
            System.out.println("Giai phuong trinh bac nhat");
        }else{
         if(delta<0){
             System.out.println("phuong trinh vo nghiem ");
         }else if (delta==0){
             x1=-b/(2*a);
             System.out.println("phuong trinh co nghiem kep x1=x1"+x1);
         } else{
                 x1=(-b-Math.sqrt(delta))/(2*a);
                 x2=(-b+Math.sqrt(delta))/(2*a);
                 System.err.println("phuong trinh co nghiem");
                 System.out.println("x1 ="+x1);
                 System.err.println("x2 ="+x2);
                 }
             
        }
            
    }
    public static void main(String[]args){
        PT02();
    }
 }
