package Array;
import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArray ob=new MyArray ();
		
		System.out.println(ob.getCapacity());
		
		ob.add(4);
		ob.add(5);
		
//		System.out.println(ob);
		
		ob.add(8, 1);
		ob.add(9,1);
		System.out.println(ob);
		
		System.out.println(ob.findSum());
		
		ob.display();
		System.out.println(ob.findMax());
		
		 System.out.println(Arrays.toString(ob.reverseArray(true)));
		 
		 System.out.println(Arrays.toString(ob.reverseArray(false)));
		 
		 System.out.println("-------------------------------------------");
		
		 
//		 System.out.println(ob.rotateArray(true, 3));
		 
		 System.out.println("-------------------------------------------");
	}

}
