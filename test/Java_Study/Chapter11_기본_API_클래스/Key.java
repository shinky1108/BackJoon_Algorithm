package Chapter11_기본_API_클래스;

// hashCode() 를 사용하여 두 객체가 동등한지 비교 
// 우선 hashCode() 메소드를 실행해서 리턴된 해시코드 값이 같은지 확인 후, equals() 함수로 최종 확인! 

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
	
}
