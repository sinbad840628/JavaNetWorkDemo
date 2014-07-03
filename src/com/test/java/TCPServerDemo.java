package com.test.java;

import java.io.IOException;
import java.net.Socket;

/**
 * 演示TCP传输:客户端和服务端
 * 客户端对应的对象是socket,服务端对应的是ServerSocket.
 * 
 * 客户端:通过查阅socket,发现在该对象建立的时候,就可以去连接指定的主机.
 * 因为TCP是面向连接的,所以在建立socket服务时,就要有服务端存在,并连接成功,行程通路后,在该通道进行数据的传输.
 * 
 * 步骤:
 * 1:创建socket服务,并制定要连接的主机和端口.
 * 2.
 * */

/**
 * 难就难在服务端的使用,
 * */
public class TCPServerDemo {

	public static void main(String[] args) throws Exception, IOException {
		Socket s = new Socket("127.0.0.1",10003);
	}
}
