package Chapter11_±âº»_API_Å¬·¡½º;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] scores = {99,97,98};
		Arrays.sort(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]="+scores[i]);
		}
		System.out.println();
		
		String[] names = {"È«±æµ¿", "¹Úµ¿¼ö", "±è¹Î¼ö"};
		Arrays.sort(names);
		for(int i=0; i<names.length; i++) {
			System.out.println("names["+i+"]="+names[i]);
		}
		System.out.println();
		
		Custom c1 = new Custom("È«±æµ¿");
		Custom c2 = new Custom("¹Úµ¿¼ö");
		Custom c3 = new Custom("±è¹Î¼ö");
		Custom[] customs = {c1, c2, c3};
		Arrays.sort(customs);
		for(int i=0; i<customs.length; i++) {
			System.out.println("customs["+i+"].name="+customs[i].name);
		}
	}
	
}
