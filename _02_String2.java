package chap_03;

public class _02_String2 {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		
		//문자열 변환
		System.out.println(s.replace("and", ",")); //and 를, 로 변환
		System.out.println(s.substring(7)); //인덱스 기준 7부터 시작 (이전 내용은 삭제)
		System.out.println(s.substring(7, 10)); // 인덱스 기준 7부터 10미만의 문자열을 출력
		System.out.println(s.substring(s.indexOf("Java"))); 
		System.out.println(s.substring(s.indexOf("Java"),s.lastIndexOf("and")));
		
		//공백제거 - trim
		s = "            I love Java.      ";
		System.out.println(s.trim()); // 앞뒤 공백 제거, 단어 사이에 공백은 제거하지 않음
		
		//문자열 결합
		String s1 = "java";
		String s2 = "Python";
		System.out.println(s1 + ","+ s2);
		System.out.println(s1 + s2);
		System.out.println(s1.concat(",").concat(s2));
	}
}
