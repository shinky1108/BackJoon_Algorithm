package Chapter13_제네릭;

// 비제네릭 타입 이용 : Object 타입을 사용하면 모든 종류의 자바 객체를 저장할 수 있는다는 장점은 있지만,
// 저장할 때 타입 변환이 발생하고, 읽어올 때에도 타입 변환이 발생함 

public class BoxExample {
	public static void main(String[] args) {
		Box_non box = new Box_non();
		box.set("홍길동");					// String -> Object (자동 타입 변환)
		String name = (String) box.get();	// Object -> String (강제 타입 변환)
		
		box.set(new Apple());				// Apple -> Object (자동 타입 변환)
		Apple apple = (Apple) box.get();	// Objcet -> Apple (강제 타입 변환) 
	}
}
