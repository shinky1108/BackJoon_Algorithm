package Chapter11_기본_API_클래스;

import java.util.Arrays;
import java.util.Objects;

// Objects.deepEquals(a1, a2) = 배열의 인덱스까지 비교 
// Objects.equals(a1, a2)

public class EqualsAndDeepEqualsExample {
	public static void main(String[] args) {
		Integer o1 = 1000;
		Integer o2 = 1000;
		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.equals(o1, null));
		System.out.println(Objects.equals(null, null));
		System.out.println(Objects.equals(null, o2));
		System.out.println(Objects.deepEquals(o1, o2)+"\n");
		
		Integer[] arr1 = {1,2};
		Integer[] arr2 = {1,2};
		System.out.println(Objects.equals(arr1, arr2));
		System.out.println(Objects.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(arr1, arr2));
		System.out.println(Arrays.deepEquals(null, arr2));
		System.out.println(Arrays.deepEquals(arr1, null));
		System.out.println(Objects.deepEquals(null, null));
	}
}
