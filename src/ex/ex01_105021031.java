package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex01_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			String str=src.next();
			char[] data=str.toCharArray();
			for(int i =data.length-1;i>=0;i--)
			{
				System.out.print(data[i]);
			}
			
	}

}
