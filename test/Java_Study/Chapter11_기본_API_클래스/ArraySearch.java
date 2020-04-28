package Chapter11_�⺻_API_Ŭ����;

import java.util.Arrays;

public class ArraySearch {
	public static void main(String[] args) {
		// �⺻ Ÿ�԰� �˻�
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("ã�� �ε���: "+index);
		
		// ���ڿ� �˻�
		String[] names = {"ȫ�浿", "�ڵ���", "��μ�"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "ȫ�浿");
		System.out.println("ã�� �ε���: "+index);
		
		// ��ü �˻�
		Custom c1 = new Custom("ȫ�浿");
		Custom c2 = new Custom("�ڵ���");
		Custom c3 = new Custom("��μ�");
		Custom[] customs = {c1, c2, c3};
		Arrays.sort(customs);
		index = Arrays.binarySearch(customs, c1);
		System.out.println("ã�� �ε���: "+index);
	}
}
