package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex04_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		long v1=src.nextLong();
		int sum=0;
		while(v1>0)
		{
			sum=(int)(sum+v1%10);
			v1=v1/10;
		}
	
		System.out.print(sum);
				
	}

}
