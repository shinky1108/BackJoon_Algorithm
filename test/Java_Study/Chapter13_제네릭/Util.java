package Chapter13_제네릭;

// 제네릭 메소드 
// public <타입 파라미터,...> 리턴타입 메소드명(매개변수,...) {...}
// public <T> Box<T> boxing(T t) {...}


public class Util {
	public static <K, V> boolean compare(Pair<K, V>p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
