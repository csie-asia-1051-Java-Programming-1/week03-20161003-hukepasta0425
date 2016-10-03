package ex;
/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex06_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int x=src.nextInt();
		int y=0;
		
		if(x<-1)
		{
			y=18;
		}
		else if(-1<=x&& x<=1)
		{
			y=x*3+9*x-3;
		}
		else
		{
			y=4*x+3;
		}
		System.out.print(y);
	}

}
