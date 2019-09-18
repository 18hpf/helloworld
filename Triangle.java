/**
*@program: 打印三角形
*@Description:
*@author: 黄培锋
*@date: 2019-9-18
*/
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入层数：");
		
		int count = in.nextInt();
		Printf(count);
	}	
	//打印三角的方法
	public static void Printf(int count){
		//num为打印“$”的个数
		int num = 1;
		
		//第一个循环表示层数
		for(int i = 1 ;i <= count ; i++){
			
			//打印前面的空格
			for(int j = i ; j < count ; j++){
				System.out.printf(" ");
			}
			
			//打印“$”
			for(int k = 1 ; k <= num ; k++){
				System.out.printf("$");
			}
			
			//每一行最后打上回车
			System.out.printf("\n");
			
			//每次层的“$”比上一层加2
			num += 2;
		}
	}
}



