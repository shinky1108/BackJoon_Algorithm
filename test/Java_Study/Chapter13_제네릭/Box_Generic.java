package Chapter13_���׸�;

public class Box_Generic <T>{
	private T t;
	public T get() {System.out.println(t); return t;}
	public void set(T t) {this.t = t;}
}
