package com.SyedShaheeqRaza.java;
import java.util.Scanner;
public class lab4e11 {
 public static void main(String[] args) {
System.out.println("hassan nawaz khan"); 
System.out.println("21_ARID_717");
Scanner input = new Scanner(System.in);
int sum=0; int average; int size = 5;
int array[] = new int[size];
 System.out.println("Enter Elements of Array");
for(int i=0; i<size; i++){
array[i] = input.nextInt(); 
}
for(int i=0; i<size; i++){
sum += array[i]; 
}
average = sum/size;
System.out.println("Average of array elements is: " + average); }
}
