package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i = 0; i < bs.length; i++) {
			bs[i] = data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("output.txt")) {
			/*
			// 두 번째 인자로 true를 주면 계속 이어서 쓴다.
			fos.write(65);
			//ASCII 값에 해당하는 Character을 찍음
			fos.write(66);
			fos.write(67);
			*/
//			fos.write(bs);
			fos.write(bs, 2, 10);
			
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}

}
