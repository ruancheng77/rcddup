package com.rcddup.java.designpatterns.strategy;

/**
 * 策略模式（strategy）
 * <p>
 * 策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类提供统一的方法，
 * 多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数，
 * </p>
 * <p>
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，
 * 外部用户只需要决定用哪个算法即可。
 * </p>
 * 
 * @author RuanCheng QQ:410093793
 * @version 创建时间:2016年12月4日上午9:47:22
 */
public class TestDemo {
	public static void main(String[] args) {
		String exp1 = "2+8";
		String exp2 = "2*8";
		String exp3 = "2-8";

		ICalculator cal1 = new Plus();
		int result1 = cal1.calculate(exp1);

		ICalculator cal2 = new Multiply();
		int result2 = cal2.calculate(exp2);

		ICalculator cal3 = new Minus();
		int result3 = cal3.calculate(exp3);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
