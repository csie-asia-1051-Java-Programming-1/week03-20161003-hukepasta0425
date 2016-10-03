package hw;
import java.util.*;
public class hw03_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int x=src.nextInt();
		int sum=1;
		for(int i=x;i>0;i--)
		{
			sum=i*sum;
//			System.out.println(i);

		}
		System.out.print(sum);
	}

}
