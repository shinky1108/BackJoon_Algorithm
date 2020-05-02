package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList();
		
		intList.add(5);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(1);
		
		Collections.sort(intList);
		System.out.print("Collections.sort:");
		for(Integer integer : intList) {
			System.out.print("["+integer+"]");
		}
		System.out.println();
		
		Collections.sort(intList, new Descending());
		System.out.print("��������: ");
		for(Integer integer : intList) {
			System.out.print("["+integer+"]");
		}
		System.out.println();
		
		Collections.sort(intList, new Ascending());
		System.out.print("��������: ");
		for(Integer integer : intList) {
			System.out.print("["+integer+"]");
		}
		
		
	}
}
