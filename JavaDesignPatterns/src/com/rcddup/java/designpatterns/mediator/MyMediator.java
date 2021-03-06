package com.rcddup.java.designpatterns.mediator;

/**
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月6日下午3:52:34
 */
public class MyMediator implements Mediator {

	private User1 user1;

	private User2 user2;

	public User1 getUser1() {
		return user1;
	}

	public User2 getUser2() {
		return user2;
	}

	@Override
	public void createMediator() {
		user1 = new User1(this);
		user2 = new User2(this);
	}

	@Override
	public void workAll() {
		user1.work();  
        user2.work();  
	}

}
