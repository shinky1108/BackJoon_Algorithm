package Chapter13_���׸�;

// ���ѵ� Ÿ�� �Ķ���� 
// public <T extends ����Ÿ��> ����Ÿ�� �޼ҵ�(�Ű�����, ...) {...}
// public <T extends Number> int compare(T t1, T t2);

public class UUtil {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2); 
	}
}
