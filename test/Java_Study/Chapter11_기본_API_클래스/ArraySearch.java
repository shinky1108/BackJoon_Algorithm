package Chapter11_기본_API_클래스;

import java.util.Arrays;

public class ArraySearch {
	public static void main(String[] args) {
		// 기본 타입값 검색
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("찾은 인덱스: "+index);
		
		// 문자열 검색
		String[] names = {"홍길동", "박동수", "김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("찾은 인덱스: "+index);
		
		// 객체 검색
		Custom c1 = new Custom("홍길동");
		Custom c2 = new Custom("박동수");
		Custom c3 = new Custom("김민수");
		Custom[] customs = {c1, c2, c3};
		Arrays.sort(customs);
		index = Arrays.binarySearch(customs, c1);
		System.out.println("찾은 인덱스: "+index);
	}
}
