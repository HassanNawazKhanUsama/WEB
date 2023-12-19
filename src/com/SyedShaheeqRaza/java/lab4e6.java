package com.SyedShaheeqRaza.java;
import java.util.Arrays;
 import java.util.Scanner;

public class lab4e6 {
  public static void main(String[] args) { 
    System.out.println("hassan nawaz khan"); 
    System.out.println("21_ARID_717");
int arr[]={0,12,3,4,5,6,7,8,9};
Scanner scanner = new Scanner(System.in);
 System.out.println("Enter element to find in the giver array:"); 
 int num=scanner.nextInt();
int index=Arrays.binarySearch(arr, num);
if(index>0){
System.out.println("element"+num+"found at index"+index);
} else
{
System.out.println("element not found");
} }
}