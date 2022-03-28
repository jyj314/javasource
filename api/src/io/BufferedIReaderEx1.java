package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class BufferedIReaderEx1 {
	public static void main(String[] args) {
		
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\coding\\temp\\file1.txt"))
		try (Reader in = new FileReader("E:\\coding\\temp\\file1.txt");
			//InputStreamReader in = new InputStreamReader(new FileInputStream("E:\\coding\\temp\\file1.txt"), "ms949");
			BufferedReader bis = new BufferedReader(in);
			Writer out = new FileWriter("E:\\coding\\temp\\output2.txt");
			BufferedWriter bos = new BufferedWriter(out);){
			
			String str=null;
			while((str=bis.readLine())!=null) {
				bos.write(str);
				bos.newLine();//엔터
			}
		
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); //어디서 exception 이 났는지 추적해줌
		} catch (IOException e) {
			e.printStackTrace(); //어디서 exception 이 났는지 추적해줌
		}

	}

}
