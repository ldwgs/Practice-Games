package press.ludwig;

// This class is only for functions. Temporary until I find out how to use methods from different classes without 
// initialising them.
public class Functions {
	public Functions() {
		
	}
	
	public int randomWithRange(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
}
