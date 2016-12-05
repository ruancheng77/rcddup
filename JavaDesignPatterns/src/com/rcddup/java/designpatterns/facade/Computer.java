package com.rcddup.java.designpatterns.facade;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月3日下午6:59:45
 */
public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;

	public Computer() {
		cpu = new CPU();
		memory = new Memory();
		disk = new Disk();
	}
	
	public void startup(){
		System.out.println("start the computer!");
		cpu.startup();
		memory.startup();
		disk.startup();
		System.out.println("start computer finished!");
	}
	
	public void shutdown(){
		System.out.println("begin to close the computer!");
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
		System.out.println("computer closed!");
	}
}
