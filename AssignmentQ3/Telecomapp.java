package AssignmentQ3;

import java.util.Arrays;

//Main class
public class Telecomapp {
public static void main(String[] args) {

   // Vendor object
   Vendor1 v = new Vendor1(1, "ABC Supplies", "abc@mail.com", "9999999999",
           Arrays.asList("SIM Cards", "Routers"));

   // Individual customer
   Individual ind = new Individual(101, "Raj", "raj@mail.com", "A",
           10.0, "Prepaid", "8888888888");

   // Company customer
   Company comp = new Company(201, "XYZ Ltd", "xyz@mail.com", "A+",
           20.0, "Corporate", "Mr. Sharma",
           500000, 50, Arrays.asList("9000000001", "9000000002"));

   // Display all
   v.display();
   ind.display();
   comp.display();
}
}