public class ReverseANumber {

    public static int reverse(int x) {
    	
    	int reversedNum = 0;
    	
    	while (x != 0) {
    	
    		int collapsed = x % 10;
    		int tmp = reversedNum * 10 + collapsed;
    		if ((tmp - collapsed) / 10 != reversedNum) {
    			return 0;
    		}
    		reversedNum = tmp;
    		x = x / 10;
    		
    	}
    	
    	return reversedNum;
        
    }
    
    
    public static void main(String[] args) {
    	
    	int x = 123;
    	System.out.println(reverse(x));

  
    }
}
