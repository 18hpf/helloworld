public class SayHello{
	public static void main(String[] arge){
		System.out.println("Bellow is the function of sayhello");
		SayHello(0);
	}
	public static void SayHello(int sum){
		System.out.println("say hello!" + Sum());
	}
	public static int Sum(){
		int sum=0;
		for (int i = 1;i <= 100;i++ ){
			sum = sum + i;
		}
		return sum;
	}
}