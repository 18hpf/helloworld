public class Verify {

	public static void main(String[] args) {
		
	}	
	boolean verification( String useraname2, String password2) {
		String username = "18hpf";
		String password = "123456";
		
		if(username.equals(useraname2) && password.equals(password2)) {
			return true;
		}
		else { 
			return false;
		}
	}

}