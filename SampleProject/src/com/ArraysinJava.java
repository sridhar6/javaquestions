package com;



//public class ArraysinJava
//{
  //  public static void main(String[] args)
   // {
   //     int[] a = new int[3];
 
     //   a[1] = 50;
 
     //   Object o = a;
 
      //  int[] b = (int[])o;
 
      //  b[1] = 100;
 
       // System.out.println(a[1]);
 
       // ((int[])o)[1] = 500;
 
       // System.out.println(a[1]);
   // }
public class ArraysinJava
{
    static void methodOne(int[] a)
    {
        int[] b = new int[5];
 
        a = b;
 
        System.out.print(a.length);
 
        System.out.print(b.length);
    }
 
    public static void main(String[] args)
    {
        int[] a = new int[10];
 
        methodOne(a);
 
        System.out.print(a.length);
    }
}
