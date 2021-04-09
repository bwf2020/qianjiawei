package homework0408;

import java.text.DecimalFormat;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// 购买商品
				
		System.out.println("***手套的单价为5.8元***");
		System.out.println("***袜子的单价为8.9元***");
		System.out.println("*******全场八折！*******");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========购物车=======");
		System.out.println("=====购买多少手套=====");
		int glove =sc.nextInt();
		System.out.println("购买手套数量："+glove);
		System.out.println("=====购买多少袜子=====");
		int socks =sc.nextInt();
		System.out.println("购买袜子数量："+socks);
		double price =(glove*5.8+socks*8.9)*0.8;
		//控制double类型的小数点后位数
		DecimalFormat df = new DecimalFormat("0.00");		
		System.out.println("折扣价应付"+df.format(price)+"元");
		
		System.out.println("======请付款======");
		int amount = sc.nextInt();
		System.out.println("付款金额："+amount);
		while(amount<price) {
			System.out.println("支付金额不足，还需支付："+df.format(price-amount)+"元");
			System.out.println("====请继续支付====");
			int add = sc.nextInt();
			amount = amount+add;
		}
		System.out.println("找零："+df.format(amount-price));		
		System.out.println("=====谢谢惠顾=====");
	}

}
