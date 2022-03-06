public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[4];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
	    //a[4] = 5;  If we exiute this line then it give ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		for(int i=0; i<a.length; i++)
		{
			try {
			System.out.println("Print Array A " +a[i]);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("I am Out Of for Loop ");
	}

}
