package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;

public class FileReaderEx2 {

	public static void main(String[] args) {
		// 입력 : 파일, 출력 :화 면
		// == InputStream
		try(Reader reader = new FileReader("E:\\coding\\temp\\file1.txt");) {  //,Charset.forName("ms949") 인코딩방식이 다르면 한글이 깨진다
			int ch;
			while((ch=reader.read())!=-1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
