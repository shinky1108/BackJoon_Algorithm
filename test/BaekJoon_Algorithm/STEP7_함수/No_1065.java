package STEP7_ÇÔ¼ö;

public class No_1065 {
	
	static long sum(int[] a) {
		long res = 0;
		for(int i=0; i<a.length; i++) {
			res+=a[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		long result = sum(arr);
		
		System.out.println(result);
	}
}
