package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) {
		// 입력 : 키보드
//		InputStream in = System.in; // system.in 은 키보드 system.out 은 화면
//		
//		try {
//			int input = in.read(); // read() : 한 바이트만 읽어옴
//			System.out.println((char)input);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		//try-with-resources 형태로 변경
        // system.in 은 키보드 system.out 은 화면
		
		try (InputStream in = System.in){
			int input = in.read(); // read() : 한 바이트만 읽어옴
			System.out.println((char)input);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
