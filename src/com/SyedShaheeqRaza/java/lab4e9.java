package com.SyedShaheeqRaza.java;
import java.util.Scanner;
public class lab4e9 {


public static void main(String[] args) { 
    System.out.println("hassan nawaz khan");
System.out.println("21_ARID_717");
 Scanner input = new Scanner(System.in);
System.out.println("Enter size of Array"); 
int size = input.nextInt();
int array[] = new int[size];
System.out.println("Enter Elements of Array"); 
for(int i=0; i<size; i++){
array[i] = input.nextInt();
 }
int sum=0;
for(int i=0; i<size; i++){
sum += array[i]; }
System.out.println("Sum of array elements is: " + sum);
 }}
