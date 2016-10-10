package hw;
import java.util.*;
public class hw05_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+i*(i+1);
			}
			System.out.print(sum);
	}

}
