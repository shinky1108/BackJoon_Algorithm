package Chapter11_기본_API_클래스;

// 객체 동등 비교 equals() 메소드

public class Member {
	public String id; 
	
	public Member (String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj instanceof Member) {		// 매개값이 Member 타입인지 확인
			// Member 타입으로 강제 타입 변환하고 id 필드값이 동일한지 검사한 후, 동일하다면 true 반환!
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
