package test2;

import java.util.Scanner;

public class Ex05 {

	// up & down
	// 1부터 100까지의 정수 중의 랜덤으로 수를 부여받음.
	// 예를 들어 랜덤의 수가 71이라고 가정하면,
	// 플레이어가 50을 말하면, UP 이라고 응답을 해주고,
	// 플레이어가 80을 말하면, DOWN 이라고 응답을 해준다.
	// 총 몇 번만에 정답을 맞혔는지 출력하시오
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ranNum =(int)(Math.random()*100)+1;
		int cnt = 0;
		int guess;
		
		do {
			System.out.println("정답을 추측하세요");
			guess = sc.nextInt();
			cnt++;
			if(guess > ranNum) {
				System.out.println("DOWN");
			}else if ( guess < ranNum) {
				System.out.println("UP");
			}
		}while ( guess != ranNum);
		
		System.out.println("축하힙니다 시도 횟수 : "+cnt);
	}
}
