package Chapter13_Á¦³×¸¯;

public class BoxxExample {
	public static void main(String[] args) {
		Box_Generic<String> box1 = new Box_Generic<String>();
		box1.set("Hello");
		String str = box1.get();
		
		Box_Generic<Integer> box2 = new Box_Generic<Integer>();
		box2.set(5);
		int value = box2.get();
	}
}
