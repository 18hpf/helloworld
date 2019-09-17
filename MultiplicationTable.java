public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("run:");
		int sum = 1;
		for(int i = 1;i <= 9; i++){
			for(int j = 1 ; j <= 9; j++){
				System.out.printf(" %d*%d = %d" , j , i ,i*j);
				if( j == sum ){
					System.out.printf("\n");
					break;
				}
				else{
					System.out.printf(" ");
				}
			}
			sum++;
		}
	}
}
