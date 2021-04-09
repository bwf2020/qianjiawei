package homework0408;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
		// 二分法查找数据
		int [] array = new int [] {3,46,21,8,14,37,29,53,16,67};
		System.out.println("有以下数组：");
		for (int arr : array) {
			System.out.print("\s"+arr);
		}		
		
		//排序
		for (int i=0;i<array.length-1;i++) {
			for (int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					array[i]=array[i]+array[j];
					array[j]=array[i]-array[j];
					array[i]=array[i]-array[j];
				}
			}
		}
		System.out.println("\n排序后为：");
		for (int arr : array) {
			System.out.print("\s"+arr);
		}
		
		System.out.println("\n选择一个数：");
		Scanner sc = new Scanner(System.in); int num = sc.nextInt();
		System.out.println("选择的数为"+num);		 
		
		int min =0;
		int max =array.length;
		int mid = (min+max)/2;
		while(array[mid]!=num) {
			if(array[mid]>num) {
				max=mid;
				mid = (min+max)/2;
			}else {
				min=mid;
				mid = (min+max)/2;
			}			
		}
		
		System.out.println("选择的数在数组中的位置为:第"+(mid+1)+"个");
		
	}

}
