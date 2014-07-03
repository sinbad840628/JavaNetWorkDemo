package com.test.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 网络模型:
 * 1.你的找到接收方的IP地址:
 * 2.数据要发送到对方的指定程序上,为了标识这些应用程序,所以给这些网络应用程序都用了数字来进行标识.
 * 3.为了更清晰的对数字有个称呼,就叫做端口,逻辑端口.
 *   定义通信规则.这个通讯规则称之为协议.
 *   国籍组织定义通信协议,这个通信规则称之为TCP/IP协议.
 * QA.端口可不是网线接口,网线接口就是物理端口.
 * 为什么QQ应用程序对应的消息不会发送到MSN的应用程序上啊?
 * 
 * 你本机和外界的通信协议根本就不同的话,你怎么和外界进行联系?
 * 连资格都没有啊..
 * 
 * 如果你是192地址段开头的话,对方的电脑最好也是192开头的地址段的.
 * IPV6和IPV4地址段的.
 * 太屌了,不光包括数字,还包括字母.
 * 子网掩码是什么呢?
 * 这个以后再研究.
 * IP地址就是:一台电脑的通信地址,先找IP地址,然后再来找对应的逻辑端口.
 * 
 * IP端口的是0~65535.
 * 0~1024被系统的程序被保留着.所以尽量不要占用,如果你占用了的话,很有可能会发现IP端口发生冲突.
 * 常用的端口,Web服务器 80端口 MySQL:3306 这些端口其实是可以改的.
 * [网络传输三要素]
 * IP,端口,传输协议(TCP,IP,UDP等).
 * 
 * OSI参考模型(分为7层)
 * 这7层分别包含了:
 * 	应用层,先封装一下,加上应用层的特征.
 * 	表示层也有自己的特征,加上表示层的标记.
 * 	会话层也加上了对应的封装和标识.
 * 	传输层加上了TCP的标记,
 * 	网络层要做的就是给发送信息的IP地址,盖个章,告诉这个发送包,你要发送到哪个地址.
 * 	数据链路层,告诉这个数据包是通过什么方式来给对方
 * 	最后一层是物理层:是通过网线,无线wifi,红外,蓝牙,光纤?来连接的吗?
 * 
 * 等发送到了接收方之后,接收方要做的事情就是数据拆包,
 * 反向拆包,直到
 * 
 * TCPIP参考模型(分为5层)
 * 应用层,
 * 传输层,
 * 网际层
 * 主机至网络层.
 * 
 * 网络编程在传输层这一层混.我们玩底层的.
 * 应用层是机器封装的.
 * 
 * 网际层最常见的是IP.
 * TCP是什么意思?传输控制协议.
 * 
 * 咱们现在脱离应用层,直接在网络层玩, 在Java API的 java.net中找到
 * 
 * */
public class JavaNetworkDemo {
	public static void main(String[] args) throws UnknownHostException {
//		InetAddress i = InetAddress.getLocalHost();
//		System.out.println(i.toString());
//		System.out.println("Address:" + i.getHostAddress());
//		System.out.println("Name:" + i.getHostName());
		
		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("Address:" +ia.getHostAddress());
		System.out.println("Name:" + ia.getHostName());
	}
}
