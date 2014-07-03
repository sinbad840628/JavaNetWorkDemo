package com.test.java;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpRece2 {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(10001);
		
		while( true){
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			ds.receive(dp);
			
			String ip = dp.getAddress().getHostAddress();
			String data = new String( dp.getData(),0,dp.getLength());
			
			System.out.println(ip + "::" + data);
			
		}
	}
}
/**
 * 如何实现两个窗口,这连个窗口同时支持互相收发
 * 编写一个聊天程序,有收数据的部分和发数据的部分,
 * 这两部分需要同时执行.
 * 那就需要用到多线程技术
 * 一个线程负责收,一个线程负责发.
 * 
 */