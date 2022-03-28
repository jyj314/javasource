package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderEx1 {

	public static void main(String[] args) {
		// 입력 : 파일, 출력 :화 면
		// == InputStream
		try(Reader reader = new FileReader("E:\\coding\\temp\\file1.txt");) {
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
