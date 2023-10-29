package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		
		long milliseconds = 0;
		int len = 0;
		
		//버퍼링 기능을 제공하는 스트림
		try(FileInputStream fis = new FileInputStream("a.exe");
				FileOutputStream fos = new FileOutputStream("b.exe");
			//버퍼링 하기(보조스트림 buffered로 감싸기)
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			milliseconds = System.currentTimeMillis();
			int i = 0;
			while((i = fis.read()) != -1) {
				fos.write(i);
				len++;
			}
			milliseconds = System.currentTimeMillis() - milliseconds;
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println(len);
		System.out.println(milliseconds);
				
	}

}
