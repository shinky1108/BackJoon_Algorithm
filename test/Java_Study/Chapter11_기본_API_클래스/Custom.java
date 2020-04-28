package Chapter11_기본_API_클래스;

public class Custom implements Comparable<Custom>{
	String name;
	Custom(String name){
		this.name = name;
	}
	@Override
	public int compareTo(Custom o) {
		return name.compareTo(o.name);
	}
}
