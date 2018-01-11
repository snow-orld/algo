public class Distance_mine {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		float distance = sqrt(1.0 * x * x + 1.0 * y * y);

		System.out.println(distance);
	}
}