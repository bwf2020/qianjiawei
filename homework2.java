package homework0408;

import java.text.DecimalFormat;
import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {
		// ������Ʒ
				
		System.out.println("***���׵ĵ���Ϊ5.8Ԫ***");
		System.out.println("***���ӵĵ���Ϊ8.9Ԫ***");
		System.out.println("*******ȫ�����ۣ�*******");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("========���ﳵ=======");
		System.out.println("=====�����������=====");
		int glove =sc.nextInt();
		System.out.println("��������������"+glove);
		System.out.println("=====�����������=====");
		int socks =sc.nextInt();
		System.out.println("��������������"+socks);
		double price =(glove*5.8+socks*8.9)*0.8;
		//����double���͵�С�����λ��
		DecimalFormat df = new DecimalFormat("0.00");		
		System.out.println("�ۿۼ�Ӧ��"+df.format(price)+"Ԫ");
		
		System.out.println("======�븶��======");
		int amount = sc.nextInt();
		System.out.println("�����"+amount);
		while(amount<price) {
			System.out.println("֧�����㣬����֧����"+df.format(price-amount)+"Ԫ");
			System.out.println("====�����֧��====");
			int add = sc.nextInt();
			amount = amount+add;
		}
		System.out.println("���㣺"+df.format(amount-price));		
		System.out.println("=====лл�ݹ�=====");
	}

}
