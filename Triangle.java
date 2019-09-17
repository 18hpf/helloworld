import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int num = 1;
		for(int i = 1 ;i <= count ; i++){
			for(int j = i ; j < count ; j++){
				System.out.printf(" ");
			}
			for(int k = 1 ; k <= num ; k++){
				System.out.printf("$");
			}
			System.out.printf("\n");
			num +=2;
		}
	}
}

