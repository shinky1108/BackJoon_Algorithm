package Chapter9_ÁßÃ¸_Å¬·¡½º¿Í_ÁßÃ¸_ÀÎÅÍÆäÀÌ½º;

public class Outter2 {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			// ÁßÃ¸ °´Ã¼ ÂüÁ¶ 
			System.out.println(this.field);
			this.method();
			
			// ¹Ù±ù °´Ã¼ ÂüÁ¶ 
			System.out.println(Outter2.this.field);
			Outter2.this.method();
		}
	}
}
