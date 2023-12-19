package com.SyedShaheeqRaza.java;
import java.util.Scanner;
public class lab4e5 {
    public static void main(String[] args) { 
        System.out.println("hassan nawaz khan");
System.out.println("21_ARID_717");
Scanner sc=new Scanner(System.in); 
System.out.println("enter row length of an array"); 
int row=sc.nextInt();
System.out.println("enter column length of an array");
int column=sc.nextInt();
int a[][]=new int[row][column];
System.out.println("enter" +row*column+"element to store in array:\n"); for (int i=0;i<row;i++){
for (int j=0;j<column;j++){ a[i][j]=sc.nextInt();
} }
}
} 

