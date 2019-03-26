public class PowerOfFour {

    public static boolean isPowerOfFour(int num) {

    	// return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        if (num % 4 == 0) {
        	return true;
        }
        else {
        	
        	return false;
        }

    }
    
    public static void main(String[] args) {
    	
    	int input = 16;
    	System.out.println(isPowerOfFour(input));
    }
}
