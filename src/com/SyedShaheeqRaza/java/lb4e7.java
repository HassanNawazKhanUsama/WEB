package com.SyedShaheeqRaza.java;
  import java.util.Scanner;
public class lb4e7 {


public static void main(String[] args) {
System.out.println("hassan  nawaz khan"); 
System.out.println("21_ARID_717");
int n,temp;
Scanner s=new Scanner (System.in); 
System.out.println("enter the number of element:"); 
n=s.nextInt();
 
int a[]=new int[n];
System.out.println("enter the elements of the array:"); for (int i=0;i<n;i++){
a[i]=s.nextInt(); }
for (int i=0;i<n;i++){
for (int j=i+1;j<n;j++){
if(a[i] < a[j])
{
temp=a[i]; a[i]=a[j]; a[j]=temp;
}
} }
System.out.println("array elements in descending order"); for (int i=0;i<n-1;i++){
System.out.println(a[i]);
}
System.out.print(a[n-1]); }
}
