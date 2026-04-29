package Array;

public class MyArray {
    private int[] arr;
    private int count;

    // Default constructor
    public MyArray() {
        arr = new int[10];
        count = 0;
    }

    // Parameterized constructor
    public MyArray(int capacity) {
        arr = new int[capacity];
        count = 0;
    }

    // Constructor with existing array
    public MyArray(int[] arr, int count) {
        this.arr = arr;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int getCapacity() {
        return arr.length;
    }

    // Add at end
    public boolean add(int x) {
        if (count < arr.length) {
            arr[count++] = x;
            return true;
        }
        return false;
    }

    // Add at position
    public boolean add(int x, int pos) {
        if (count < arr.length && pos >= 0 && pos <= count) {
            for (int i = count; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = x;
            count++;
            return true;
        }
        return false;
    }

    // Search
    public int searchByValue(int val) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == val) return i;
        }
        return -1;
    }

    // Delete by position
    public boolean deleteByPosition(int pos) {
        if (pos >= 0 && pos < count) {
            for (int i = pos; i < count - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count--;
            return true;
        }
        return false;
    }

    // Delete by value
    public int deleteByValue(int val) {
        int pos = searchByValue(val);
        if (pos != -1) {
            deleteByPosition(pos);
            return pos;
        }
        return -1;
    }

    // Rotate array
    public void rotateArray(boolean right, int num) {
        if (count == 0) return;

        num = num % count;

        if (right) {
            for (int j = 0; j < num; j++) {
                int temp = arr[count - 1];
                for (int i = count - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            }
        } else {
            for (int j = 0; j < num; j++) {
                int temp = arr[0];
                for (int i = 0; i < count - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[count - 1] = temp;
            }
        }
    }

    // Reverse array
    public int[] reverseArray(boolean inPlace) {
        if (inPlace) {
            for (int i = 0, j = count - 1; i < j; i++, j--) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return arr;
        } else {
            int[] arr1 = new int[count];
            for (int i = count - 1, j = 0; i >= 0; i--, j++) {
                arr1[j] = arr[i];
            }
            return arr1;
        }
    }

    // Find max
    public int findMax() {
        if (count == 0) return Integer.MIN_VALUE;

        int max = arr[0];
        for (int i = 1; i < count; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }

    // Exchange index and value
    public int[] exchangeIndexValue() {
        int max = findMax();
        if (max < 0) return new int[0];

        int[] arr1 = new int[max + 1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = -1;
        }

        for (int i = 0; i < count; i++) {
            int val = arr[i];
            if (val >= 0 && val < arr1.length) {
                arr1[val] = i;
            }
        }

        return arr1;
    }

    // Sum
    public int findSum() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Display
    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    @Override
    public String toString() {
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = arr[i];
        }
        return "MyArray [arr=" + java.util.Arrays.toString(temp) + ", count=" + count + "]";
    }
}


















































































































//package Array;
//
//public class MyArray {
//    private int[] arr;
//    private int count;
//    private int size;
//
//    // Default constructor
//    public MyArray() {
//        arr = new int[10];
//        count = 0;
//        size = 10;
//    }
//
//    // Parameterized constructor
//    public MyArray(int size) {
//        this.size = size;
//        arr = new int[size];
//        count = 0;
//    }
//
//    // Constructor with array
//    public MyArray(int[] arr, int count, int size) {
//        this.arr = arr;
//        this.count = count;
//        this.size = size;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public int getCapacity() {
//        return arr.length;
//    }
//
//    // Add at end
//    public boolean add(int x) {
//        if (count < arr.length) {
//            arr[count] = x;   // fixed
//            count++;
//            return true;
//        }
//        return false;
//    }
//
//    // Add at specific position
//    public boolean add(int x, int pos) {
//        if (count < arr.length && pos >= 0 && pos <= count) {
//
//            // shift elements to right
//            for (int i = count; i > pos; i--) {
//                arr[i] = arr[i - 1];
//            }
//
//            arr[pos] = x;
//            count++;
//            return true;
//        }
//        return false;
//    }
//
//    // Search by value
//    public int searchByValue(int val) {
//        for (int i = 0; i < count; i++) {
//            if (arr[i] == val) {
//                return i;
//            }
//        }
//        return -1; // not found
//    }
//
//  public boolean deleteByPosition(int pos) {
//	  if(pos<count) {
//		  for(int i =pos+1 ;i<count;i++) {
//		  count --;
//		  
//		  return true;}
//
//  
//  }
//	  return false;
//  
//}
//  public int deleteByValue(int val) {
//	  int pos=searchByValue(val);
//	  
//	  if(pos!=1) {
//		  boolean flag=deleteByPosition(pos);
//		  
//		  if(flag) {
//			  return pos;
//		  
//		  }
//		  
//	  }
//	  return -1;
//	  
//  }
//  //flag = true then rotate right for n times;
//  //flsg = false ther return left gor n times;
//  
//  public void rotateArray(boolean flag,int num) {
//	
//	if(flag) {
//		for (int j=0;j<num;j++) {
//			int temp=arr[count-1];
//			for(int i=count-1;i>0;i--) {
//				arr[i]=arr[i-1];
//				
//			}
//			arr[0]=temp;
//		}
//	}
//	else {
//		for(int j=0;j<num;j++) {
//			int temp=arr[0];
//			
//			for(int i=0;i<count;i++) {
//				arr[i]=arr[i+1];
//			}
//			arr[count-1]=temp;
//		}
//	}
//  }
////if flag is true then reverse the array in place 
//// else reverse the copy of array 
//  public int[] reverseArray(boolean flag) {
//	  if(flag) {
//		  for(int i = 0, j = count - 1; i < j; i++, j--) {
//			  int temp=arr[i];
//			  
//			  arr[i]=arr[j];
//			  
//			  arr[j]=temp;
//		  }
//	  }
//	  else {
//		  int[] arr1=new int[count];
//		  
//		  for(int i=count-1,j=0;i>=0;i--,j++) {
//			  arr[j]=arr[i];
//		  }
//		  return arr1;
//	  }
//	  return arr;
//  }
////find max number 
//  //create a new array of size max+1
//  //Initialize new array with -1
//  //then copy indexes at value positions 
////  int maxnum=findMax();
//  
//  public int findMax() {
//	  int max=arr[0];
//	  
//	  for(int i=0;i<count;i++) {
//		  if(arr[i]>max) {
//			  max=arr[i];
//			  
//		  }
//		  
//	  }
//	  return max;
//  }
//  
//  public int[] exchangeIndexValue() {
//	  int maxnum=findMax();
//	  
//	  int[] arr1= new int[maxnum+1];
//	  
//	  for(int i=0;i<arr.length;i++) {
//		  arr1[i]=-1;
//	  }
//	  
//	  for(int i=0;i<count;i++) {
//		  int b=arr[i];
//		  
//		  arr[b]=i;
//	  }
//	  return arr1;
//  }
//  
//public int findSum() {
//	int sum=0;
//	
//	for(int i=0;i<count;i++) {
//		sum+=arr[i];
//		
//	}
//	return sum;
//	
//}
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////package Array;
////
////public class MyArray {
////private int[] arr;
////private int count;
////
////private int size;
////
////
////public MyArray() {
////	arr=new int[10];
////	count=0;
////	size=10;
////}
////
////
/////**
//// * @param size
//// */
////public MyArray(int size) {
////
////	this.size = size;
////	arr=new int[size];
////	count=0;
////}
////
////
////public MyArray(int[] arr, int count, int size) {
////	super();
////	this.arr = arr;
////	this.count = count;
////}
////
////public int getCount() {
////	return count;
////}
////
////public int getCapacity() {
////	return arr.length;
////}
////
////public boolean add(int x) {
////	if(count<arr.length) {
////		arr[count]=0;
////		count++;
////		
////		return true;
////		
////	}
////	return false;
////}
//////add in between function 
//////shift values on location to right from ps to arr.length
//////add numbers at position 
////public boolean add(int x,int pos) {
////	if((count<arr.length) && (pos<count)) {
////		for(int i=count;i>=pos;i--) {
////		arr[i]=arr[i+1];
////		arr[pos]=x;
////		
////		count++;
////		return true;
////		}
////	}
////	else {
////		return false;
////		
////	}
////	
//////search the given value & return its position
////
////	public int searchByValue(int val) {
////		for(int i=0;i<count;i++) {
////			if(arr[i]==val) {
////				return i;
////			}
////			
////		}
////		return 1;
////}
////}
//
//
