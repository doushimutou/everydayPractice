package com.averyday.demo.suanfa;

/**
 * Description
 * Author ayt  on
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]


 */
public class TestQuene {
	public static void main(String[] args) {
		CQueue cQueue = new CQueue();
		int a=cQueue.deleteHead();
		cQueue.appendTail(5);
		cQueue.appendTail(2);
		int d=cQueue.deleteHead();
		int e=cQueue.deleteHead();
	}
}
