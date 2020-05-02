package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList();
		
		movieList.add(new Movie("�����", "�׼�", "12�� ������"));
		movieList.add(new Movie("���˵���", "�׼�", "19�� ������"));
		movieList.add(new Movie("�̼����ļ���", "�׼�", "15�� ������"));
		
		System.out.print("Title ���� ��: ");
		for(Movie movie : movieList) {
			System.out.print("["+movie.getTitle()+"]");
		}
		System.out.println();
		
		Collections.sort(movieList);
		System.out.print("Title �������� ���� : ");
		for(Movie movie : movieList) {
			System.out.print("["+movie.getTitle()+"]");
		}
		
		
	}
}
