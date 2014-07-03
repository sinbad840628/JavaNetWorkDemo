package com.test.java;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.interfaces.DSAKey;

/**
 * 
 * */
public class UpSend {
	public static void main(String[] args) throws Exception {
		//1. 创建UDP服务,通过DatagramSocket
		DatagramSocket ds = new DatagramSocket();
		
		//2.确定数据,并封装成数据包,DatagramPacket(byte[] buf,int length, InetAddress address, int port)
		byte[] buf = "UDP I'm Coming".getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"),10000);
		
		//3.通过socket服务,将已有的数据包发送出去.通过send方法.
		ds.send(dp);
		
		//4.关闭资源
		ds.close();
	
	}// end of main
}
