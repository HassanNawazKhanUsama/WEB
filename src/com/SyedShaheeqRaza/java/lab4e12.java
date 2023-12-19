package com.SyedShaheeqRaza.java;
 import java.util.Arrays;
import java.util.Scanner;
public class lab4e12 {
public static void main(String[] args) { 
    System.out.println("hassan nawaz khan");
System.out.println("21_ARID_717"); 
Scanner input = new Scanner(System.in);
int array[] = {23,34,45,56,67};
int element = 45;
int index = Arrays.binarySearch(array, element);
if(index>=0){
System.out.println("Element " + element + " is found at " + index + " index.");
}else{
System.out.println("Element not found"); }
}
 }