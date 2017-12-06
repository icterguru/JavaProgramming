package JavaBasics;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int n = 10;
		int a[] = new int[n];
		int b[] = new int [n - 5];
		for (int i = 0; i < n; i++)
		{
			a[i] = (i + 1) * 2;
			System.out.print("Hello  ");
			if (( i % 3 ) == 0)
				b[i - 2] = a[i];
			System.out.println(a[i]+ "\n");
			
		}
				
		
	}

}
