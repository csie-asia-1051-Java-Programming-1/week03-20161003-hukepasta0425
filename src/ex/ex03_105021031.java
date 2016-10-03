package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex03_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		char chr=src.next().charAt(0);
		if(chr>=65&& 90>=chr)
		{
			chr=(char)(chr+32) ;
		}
		else if(chr>=97 && 122>=chr)
		{
			 chr =(char)(chr-32);
		}
		System.out.print(chr);
	}

}
