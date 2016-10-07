//gruppe 33
package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*8;                     // 0-7 Ændring fra 7 til 8.
		int d3 = (int) d2;             // 0-7 integer der runder ned.
		return d3 + 1;                     // 1-8		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
