package demo.junit2;

public class MainTest {
	public static void main(String[] args) {
		int a = 10, b = 11;
		int f = a |= b;
		//int f = a | b;
		
		System.out.println("f " +f);
		System.out.println("a " +a);
		System.out.println("b " +b);
	}
}
