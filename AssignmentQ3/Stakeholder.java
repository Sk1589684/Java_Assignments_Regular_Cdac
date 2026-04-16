package AssignmentQ3;

import java.util.*;


class Stakeholder {
 int id;
 String name;
 String email;

 Stakeholder(int id, String name, String email) {
     this.id = id;
     this.name = name;
     this.email = email;
 }
}

//Vendor class
class Vendor1 extends Stakeholder {
 String phone;
 List<String> products;

 Vendor1(int id, String name, String email, String phone, List<String> products) {
     super(id, name, email);
     this.phone = phone;
     this.products = products;
 }

 void display() {
     System.out.println("Vendor ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("Phone: " + phone);
     System.out.println("Products: " + products);
     System.out.println();
 }
}

//Abstract Customer class
abstract class Customer extends Stakeholder {
 String creditClass;
 double discount;
 String plan;

 Customer(int id, String name, String email, String creditClass, double discount, String plan) {
     super(id, name, email);
     this.creditClass = creditClass;
     this.discount = discount;
     this.plan = plan;
 }

 abstract void display();
}

//Individual Customer
class Individual extends Customer {
 String phone;

 Individual(int id, String name, String email, String creditClass,
            double discount, String plan, String phone) {

     super(id, name, email, creditClass, discount, plan);
     this.phone = phone;
 }

 void display() {
     System.out.println("Individual Customer ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("Phone: " + phone);
     System.out.println("Credit Class: " + creditClass);
     System.out.println("Discount: " + discount);
     System.out.println("Plan: " + plan);
     System.out.println();
 }
}

//Company Customer
class Company extends Customer {
 String relationshipManager;
 double creditLine;
 int extensions;
 List<String> numbers;

 Company(int id, String name, String email, String creditClass,
         double discount, String plan, String relationshipManager,
         double creditLine, int extensions, List<String> numbers) {

     super(id, name, email, creditClass, discount, plan);
     this.relationshipManager = relationshipManager;
     this.creditLine = creditLine;
     this.extensions = extensions;
     this.numbers = numbers;
 }

 void display() {
     System.out.println("Company Customer ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("Relationship Manager: " + relationshipManager);
     System.out.println("Credit Line: " + creditLine);
     System.out.println("Extensions: " + extensions);
     System.out.println("Numbers: " + numbers);
     System.out.println("Credit Class: " + creditClass);
     System.out.println("Discount: " + discount);
     System.out.println("Plan: " + plan);
     System.out.println();
 }
}

