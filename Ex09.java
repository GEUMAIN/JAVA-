package test;

import java.util.Scanner;

public class Ex09 {
	//특정한 숫자까지 더해서 pi값 구하기
	public static void main(String[] args) {
		double pi = 0;
		double bunmo= 1;
		double buho= 1;
		Scanner sc = new Scanner(System.in);
		int ln = sc.nextInt();
		for (int i =0; i<ln; i++) {
			pi = pi+(4/bunmo)*buho;
			bunmo=bunmo+2;
			buho=buho*-1;
		}
		System.out.println(pi);
	}
}
