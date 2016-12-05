package com.rcddup.java.designpatterns.observer;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日下午12:52:25
 */
public class MySubject extends AbstractSubject {

	@Override
	public void operation() {
		System.out.println("update self!");
		notifyObservers();
	}

}
