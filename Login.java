import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String username , password ;
		boolean flag = false ;
		
		System.out.printf("username:");
		username = scan.nextLine();
		System.out.printf("password:");
		password = scan.nextLine();
		
		Verify ver = new Verify();
		flag = ver.verification(username, password);
		
		if ( flag) {
			System.out.println("login successfully!");
		}
		else {
			System.out.println("Wrong account name or password");
		}
	}

}