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
public class b2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float TB;
        System.out.println("Nhap điem trung binh");
        TB=sc.nextFloat();
        if (TB<5)
        {
            System.out.println("kem");
        }else
        {
            if((TB>=5)||(TB<=7)){
                System.out.println("Trung binh" );
        }else{
                if((TB>=7)||(TB<=8)){
                    System.out.println("kha");
                }else{
                    System.out.println("Gioi");
                }
            }
        }
 
    }
}
