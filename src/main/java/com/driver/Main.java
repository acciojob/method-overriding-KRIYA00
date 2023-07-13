package com.driver;

public class Main
{
public static class A
{
 public String meth()
 {
     return "Invoking method from class A";
 }
}
public static  class B extends A
{
  @Override
  public String meth()
{
    return "Method is overridden in Extendend class B";
}
}
public static void main(String args[])
{
    B ob = new B();
    ob.meth();
  //  System.out.println(ob.meth());
  B ob1 = new B();
  ob1.meth();
 //   System.out.println(ob1.meth());
}

}


