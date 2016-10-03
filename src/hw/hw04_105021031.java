package hw;
import java.util.*;
public class hw04_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int x=src.nextInt();
		int sum=1;
		int i=x;
		while(i>0)
		{
			sum=sum*i;
				i=i-1;
		}
			System.out.print(sum);
	}

}
