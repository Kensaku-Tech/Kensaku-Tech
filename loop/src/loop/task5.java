package loop;

public class task5 {

	public static void main(String[] args) {

		int i = 1;
		for(int q = 1; q <= 9; q++) {

			System.out.print(i * q);

			if((i * q) + i < 10) {
				System.out.print("  ");
			}else if((i * q ) + i >= 10) {
				System.out.print(" ");
			}

			if(q == 9 && i * q < 81) {

				System.out.println("");
				q = 0;
				i++;

			}
		}
	}

}
