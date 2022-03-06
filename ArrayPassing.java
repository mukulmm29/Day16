public class ArrayPassing {
	private static void printArray(Integer[] k){
        System.out.println("Array contents printed through method:");
       for(Integer val: k)
          System.out.print(val + " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] k = {10,20,30,40,50,60,70,80};     
        printArray(k);
	}

}
