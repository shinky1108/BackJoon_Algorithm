package Chapter7_상속;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone 객체 생성
		DmbCellPhone myPhone = new DmbCellPhone("자바폰", "검정",10);
		
		//CellPhone으로부터 상속받은 필드
		System.out.println("모델: "+myPhone.model);
		System.out.println("색상: "+myPhone.color);
		
		//DmbCellPhone의 필드
		System.out.println("채널: "+myPhone.channel);
		
		// CellPhone으로부터 상속받은 메소드 호출
		myPhone.powerOn();
		myPhone.bell();
		myPhone.sendVoicce("여보세요");
		myPhone.receiveVoice("안녕하세요! 저는 홍길동입니다.");
		myPhone.sendVoicce("반갑습니다!");
		myPhone.hangUp();
		
		//DmbCellPhone의 메소드 호출
		myPhone.turnOnDmb();
		myPhone.changChannelDmb(12);
		myPhone.turnOffDmb();
	}
}
