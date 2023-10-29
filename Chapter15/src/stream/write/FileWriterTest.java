package stream.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write("A");
			char[] cbuf = {'B','C','D','E'};
			fw.write(cbuf);
			fw.write("안녕하세요");
			fw.write(cbuf, 1, 2);
			fw.write("123");
			
			System.out.println("end");
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
