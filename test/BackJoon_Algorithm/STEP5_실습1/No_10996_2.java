package STEP5_½Ç½À1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_10996_2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++) {
			if(i%2 == 0) {
				sb.append('*');
			}else {
				sb.append(' ');
			}
		}
		sb.append('\n');
		
		for(int i=0; i<num; i++) {
			if(i%2 !=0) {
				sb.append('*');
			}else {
				sb.append(' ');
			}
		}
		sb.append('\n');
		
		String str = sb.toString();
		
		for(int i=1; i<num; i++) {
			sb.append(str);
		}
		System.out.println(sb);
	}
}
