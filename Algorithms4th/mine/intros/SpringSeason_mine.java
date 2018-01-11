public class SpringSeason_mine {
	public static void main(String[] args){

		int m = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);

		boolean isSpring = false;

		if (m == 3) {
			if (d >= 20 && d <= 31) {
				isSpring = true;
			}
		} else if (m > 3 && m < 6) {
			isSpring = true;
		} else if (m == 6) {
			if (d >= 1 && d <= 20) {
				isSpring = true;
			}
		}

		System.out.println("Month " + m + " Day " + d + " is " + (isSpring ? "" : "not ") + "in Spring Season");
	}
}