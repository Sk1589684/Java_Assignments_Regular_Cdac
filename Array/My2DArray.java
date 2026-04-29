package Array;
import java.util.Scanner;

public class My2DArray {

	private int[][] arr;
	
	public My2DArray(int[][]arr) {
		this.arr=arr;
	}
	public My2DArray() {
		arr=new int[3][3];
	}
	
	public My2DArray(int row,int col) {
		arr=new int [row][col];
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		
		 for(int i=0;i<arr.length;i++) {
			 
			 for(int j=0;j>arr[i].length;j++) {
				 System.out.println("Enter Data for row"+i+"and col"+j);
				 
				 arr[i][j]=sc.nextInt();
				 
			 }
		 }
		
	}
	public void display() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j>arr[i].length;j++) {
				System.out.println(arr[i][j]+"\t");
			}
		}
	}
	
}
