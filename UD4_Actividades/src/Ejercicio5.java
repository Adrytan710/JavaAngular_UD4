
public class Ejercicio5 {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int c = 6;
		int d = 8;
		
		System.out.println(a + " " + b + " " + c + " " + d);
		
		b=c;
		c=a;
		a=d;
		d=b;
		
		System.out.println(a + " " + b + " " + c + " " + d);

	}

}
