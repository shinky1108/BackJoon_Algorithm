package Chapter11_�⺻_API_Ŭ����;

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
