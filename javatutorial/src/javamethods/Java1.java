package javamethods;

public class Java1 {
	private static void addingTwoNumbers(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * for (int i=0;i<5;i++) { for (int j=0;j<5;j++) {System.out.print(" *"); }
		 * System.out.println(); }
		 */
		/*
		 * for ( int i=0;i<5;i++) { for (int j=0;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 */
		/*
		 * for (int i=0; i<5;i++) { for ( int j=i;j<5;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		/*
		 * for (int i=0;i<5;i++) { for(int j=i;j<5;j++) { System.out.print(" "); } for
		 * (int j=i;j<5;j++) { System.out.print("* "); } System.out.println(); }
		 */

		/*
		 * for (int i=1; i<=5; i++) { for (int j=i;j<=5;j++) {System.out.print(" "); }
		 * for (int j=1;j<=i;j++) {System.out.println("*"); } }
		 */
		/*
		 * for (int i=0;i<5;i++) { for(int j =0; j<i;j++) { System.out.print("  "); }
		 * for (int j=i;j<5;j++) { System.out.print("* "); } System.out.println(); }
		 */
		/*
		 * for(int i=0;i<4;i++) { for (int j=i;j<5;j++) { System.out.print("  "); } for
		 * (int j=0; j<i;j++) { System.out.print("* "); } for (int j =0; j<=i;j++) {
		 * System.out.print("* "); } System.out.println(); } for ( int i=0; i<5; i++) {
		 * for (int j=0;j<=i;j++) { System.out.print("  "); } for (int j= i; j<4; j++) {
		 * System.out.print("* "); } for (int j =i; j<5;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		/*
		 * for(int i=0;i<4;i++) { for ( int j=i; j<5;j++) { System.out.print("  "); }
		 * for (int j=0;j<=i;j++) { System.out.print("* "); } for (int j=0;j<i;j++) {
		 * System.out.print("* "); } System.out.println(); } for (int i=0;i<5;i++) { for
		 * (int j=0; j<=i; j++) { System.out.print("  "); } for (int j=i; j<4;j++) {
		 * System.out.print("* "); } for (int j=i; j<5;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */
		// String name = "Arjun";
		// System.out.println(name.length() + name + name.toUpperCase());
addingTwoNumbers(15,20);
	}

}
