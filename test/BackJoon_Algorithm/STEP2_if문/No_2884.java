import java.util.Scanner;

public class No_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(!(h>=0 && h<25)) {
			System.out.println("시간 설정이 잘못되었습니다.");
			System.exit(0);
		}
		if(!(m>=0 && m<61)) {
			System.out.println("분 설정이 잘못되었습니다.");
			System.exit(0);
		}
		
		if(m<45) {
			if(h == 0) {
				h = 23;
				m += 60;
				m -= 45;
			}else {
				h -= 1;
				m += 60;
				m -= 45;
			}
		}else
			m -= 45;
		System.out.println(h+" "+m);
	}
}
