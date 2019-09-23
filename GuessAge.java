import java.util.Scanner;

public class GuessAge{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		int check = age/18 ;
	
		switch( check ){
			case 0 : 
				System.out.println( "小姐姐" ); 
				break;
			case 1 :
				System.out.println( "大姐姐");
				break;
			default :
				System.out.println( "老阿姨"); 
				break;
		}
	}
}