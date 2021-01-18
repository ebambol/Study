package test;

public class ForReverse {

	public static void main(String[] args) {
		byte[] bytes = { 1 , 2 , 3 };
		for ( int i = bytes.length ; i-- > 0 ; )
		{
		    System.out.println( bytes[ i ] );
		}
	}

}
