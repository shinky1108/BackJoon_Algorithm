package Chapter11_�⺻_API_Ŭ����;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		Custom c1 = new Custom("ȫ�浿");
		Custom c2 = new Custom("�ڵ���");
		Custom c3 = new Custom("��μ�");
		Custom[] customs = {c1, c2, c3};
		Arrays.sort(customs);
		for(int i=0; i<customs.length; i++) {
			System.out.println("customs["+i+"].name="+customs[i].name);
		}
	}
	
}
