// 구구단을 짝수 단만 출력 (2,4,6,8)
package chap_04;

public class _ex_01 {
	public static void main(String[] args) {
		Loop1:
		for (int i=2; i<9; i+=2) {
			for (int j=1; j<9; j++) {
				System.out.println(i + "*" +j + "="+(i*j));
				if(j>i) break;
			}
		}
	}
}
