package net.tcp;

import java.io.BufferedReader ;
import java.io.BufferedWriter ;
import java.io.IOException ;
import java.io.InputStream ;
import java.io.InputStreamReader ;
import java.io.OutputStreamWriter ;
import java.net.ServerSocket ;
import java.net.Socket ;

public class ClientDemo {
	
	public static void main(String [] args) {
		try {
			Socket socket = new Socket("localhost" ,8888);
			for(;;) {
				BufferedWriter br = new  BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				br.write("hello World");
//				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//				String readLine = reader.readLine();
//				System.out.println("客户端接收消息:" + readLine) ;
//				br.close();
//				reader.close();
//				socket.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
