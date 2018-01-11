public class SumOfTwoDice_mine {
	
	public static void main(String[] args) {

		int dice1 = Math.floor(Math.random() * 6) + 1;
		int dice2 = Math.floor(Math.random() * 6) + 1;

		System.out.println("dice1 " + dice1 + " dice2 " + dice2 + "'s sum is " + (dice1 + dice2));
	}
}