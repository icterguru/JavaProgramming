package Java2Novice;

public class UseOf_toString {

	public static void main(String a[]){
		int x = 5;
		Integer ix = 12;
		
		int y = 10;
		Integer iy= 13;
		
		System.out.println("ix + iy = " + (ix + iy));
		System.out.println("ix * iy = " + (ix * iy));

		System.out.println("ix.toString() + iy.toString() = " + (ix.toString() + iy.toString()));
		System.out.println("ix.toString() * iy.toString() is invalid ... " );

		System.out.println("x.toString() is invalid ...   " );
		
	//	System.out.println("ix.toString() * iy.toString() = " + (ix.toString() * iy.toString()));

	}
}
