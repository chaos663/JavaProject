package stream.decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
//		try(FileInputStream fis = new FileInputStream("reader.txt")){
		try(InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))){
			//InputStreamReader가 보조 스트림이다. 생성자안에 주 스트림 넣어서 
			int  i = 0;
			while((i= irs.read()) != -1) {
				System.out.print((char)i);
			}
		}catch (IOException e) {
			System.out.println(e);
		}  
		
		//소켓 통신할 때 
		Socket socket = new Socket();
//		socket.getInputStream();
		// 여기서는 한글만 읽을 수 있게 됨
		InputStreamReader ir;
		try {
			ir = new InputStreamReader(socket.getInputStream());
			// 이 보조 스트림은 직접 읽고 쓰는 기능은 없다. 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
