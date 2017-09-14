package guvi;
import java.util.Scanner;
public class Multiply2String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		Integer a1=Integer.parseInt(a);
		Integer b1=Integer.parseInt(b);
		int c1=a1*b1;
		String c=String.valueOf(c1);
		System.out.println(c);
s.close();
	}

}