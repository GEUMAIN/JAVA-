package test2;

import java.util.Scanner;

public class Ex02 {

	// 총 학생의 수를 입력받음
	// 해당 학생들의 성적을 입력받아 총점과 평균을 구하시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 명의 성적을 입력받겠습니까?");
		int num = sc.nextInt();
		
		int score;
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			score = sc.nextInt();
			sum = sum+score;
		}
		System.out.printf("총 %d명 학생의 총점은 %d점 이고, 평균은 %.1f점이다",num,sum,(double)sum/num);
	}
}
