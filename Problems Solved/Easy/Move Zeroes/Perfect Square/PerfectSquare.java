public class PerfectSquare {

    public static boolean isPerfectSquare(int num) {
        
        int low = 1;
        int high = num;
        
        while (low <= high) {
            
        	long mid = (low + high) >>> 1;
            
        	if (mid * mid == num) {
                return true;
            } 
        	else if (mid * mid < num) {
                low = (int) mid + 1;
            }
        	else {
                high = (int) mid - 1;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    	
    	int input = 16;
    	
    	System.out.println(isPerfectSquare(input));
    }
}
