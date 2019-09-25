import java.util.*;

public class BinarySearch{
	public static void main(String[] args){
		int[] num = {1,3,5,7,9,11,4,8};
		int i = Arrays.binarySearch(num,9);
		if (i >= 0){
			System.out.println("已找到，下标为：" + i);
		}
		else{
			System.out.println("未找到");
		}
	}
}