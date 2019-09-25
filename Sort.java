import java.util.*;
import java.lang.Math;

public class Sort{
	public static void main(String[] args){
		int[] num = new int[(int)(Math.random()*10)];
		for ( int i = 0; i < num.length; i++){
			num[i] = (int)(Math.random()*10);
		}
		for ( int j:num){
			System.out.print( j + " ");
		}
		System.out.print("\nSorting result:");
		Arrays.sort(num);
		for ( int k : num ){
			System.out.print( k + " ");
		}
	}
}