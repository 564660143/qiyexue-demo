package net.tcp;

import java.io.BufferedReader ;
import java.io.BufferedWriter ;
import java.io.IOException ;
import java.io.InputStream ;
import java.io.InputStreamReader ;
import java.io.OutputStreamWriter ;
import java.net.ServerSocket ;
import java.net.Socket ;

public class ServerDemo {
	
	public static void main(String [] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			for(;;) {
				Socket accept = serverSocket.accept();
				BufferedReader reader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
				String readLine = reader.readLine();
				System.out.println("接收消息:" + readLine) ;
				BufferedWriter br = new  BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
				br.write("hello 七夜雪");
				br.close();
				reader.close();
//				accept.close();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
