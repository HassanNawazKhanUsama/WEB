package com.SyedShaheeqRaza.java;
import java.util.Scanner;
public class lab4e10 {
public static void main(String[] args) { 
    System.out.println("hassan unawaz khan");
System.out.println("21_ARID_717");
 Scanner input = new Scanner(System.in);
System.out.println("Enter size of Array");
 int size = input.nextInt();
int array[] = new int[size];
System.out.println("Enter Elements of Array");
 for(int i=0; i<size; i++){
array[i] = input.nextInt(); 
}
int min;
int temp;
for(int i=0; i<size; i++){
min = i;
for(int j=i+1; j<size; j++){
if(array[j]<array[min]){ 
    min = j;
} }
if(min != i){
temp = array[min]; array[min] = array[i]; 
array[i] = temp;
} }
System.out.println("Ascending Sorted Array is:"); 
for(int i=0; i<size; i++){
System.out.print(array[i] + "\t"); }
} }