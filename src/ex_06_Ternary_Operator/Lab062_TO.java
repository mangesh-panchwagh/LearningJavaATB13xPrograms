package ex_06_Ternary_Operator;

public class Lab062_TO {

	public static void main(String[] args) {
		
		// Age to vote ? 
		int age = 10;
		int age1 = 29;
		String canIVote = age > 18 ? "Vote" : "Can not Vote";
		String canIVote1 = age1 > 18 ? "Vote" : "Can not Vote";
		System.out.println(canIVote);
		System.out.println(canIVote1);
	}
}
