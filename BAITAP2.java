/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author songh
 */
public class BAITAP2 {
    public static void PT01() {
        double a,b,x ;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap a:");
        a=sc.nextDouble();
        System.out.println("nhap b:");
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
            System.out.println("phuong trinh vo nghiem");
        }else{
            System.out.println("phuong trinh vo so nghiem");
            }
        }else{
                x=-b/a;
                System.out.println("vay nghiem x ="+x);
                }
    }
    public static void main(String[]args){
        PT01();
    }
}
