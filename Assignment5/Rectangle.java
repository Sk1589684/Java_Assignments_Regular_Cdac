package Assignment5;

import java.lang.reflect.*;

//----------- Sample Classes -----------

class Rectangle {
 public void area(int l, int b) {}
 public void perimeter(int l, int b) {}
}

class Student {
 public void display(int id, String name) {}
 public void calculate(int m1, int m2, int m3) {}
}

class Friend {
 public void info(String name) {}
 public void meet(String place, int time, String day) {}
}

class MyClass {
 public void method5(int a, int b, int c, int d) {
     System.out.println("method5 invoked");
 }

 public void method6(String a, String b, String c, String d) {
     System.out.println("method6 invoked");
 }
}

//----------- Reflection Main Class -----------

