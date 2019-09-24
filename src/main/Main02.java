package main;

public class Main02 {

	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder();

		for (int i = 2020; i <= 2100; i++) {
			for (int j = 1; j <= 12; j++) {
				buf = new StringBuilder();
				buf.append(i);
				buf.append("/");
				buf.append(j);
				buf.append("/");
				buf.append("10");
				System.out.println(buf.toString());

				buf = new StringBuilder();
				buf.append(i);
				buf.append("/");
				buf.append(j);
				buf.append("/");
				if (j == 2) {
					buf.append("28");
				} else {
					buf.append("30");
				}
				System.out.println(buf.toString());
			}
		}
	}

}
