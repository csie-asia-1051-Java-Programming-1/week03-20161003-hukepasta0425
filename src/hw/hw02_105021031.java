package hw;

import java.util.*;

public class hw02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int a=src.nextInt();
//		int b[]=new int[a];
		int x=0,y=0,z=0;
		
		for(int i=1;i<=a;i++)
		{
			int b=src.nextInt();
			if(b>0)
			{
				x++;
			}
			else if(b==0)
			{
				y++;
			}
			else
			{
				z++;
			}
		}
			System.out.println("正數"+x+"個");
			System.out.println("0有"+y+"個");
			System.out.println("負數"+z+"個");
	}

}
