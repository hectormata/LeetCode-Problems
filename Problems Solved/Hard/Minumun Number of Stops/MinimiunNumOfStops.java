public class MinimunNumOfStops {
    
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        
    	int N = stations.length;
    	long[] dp = new long[N + 1];
    	dp[0] = startFuel;
    	
    	for (int i = 0; i < N; i++) {
    		for (int j = i; j >= 0; j--) {
    			
    			if (dp[j]>= stations[i][0]) {
    				dp[j + 1] = Math.max(dp[j  + 1], dp[j] + (long) stations[i][1]);
    			}
    		}
    	}
    	
    	for (int i = 0; i <= N; i++) {
    		if (dp[i] >= target) {
    			return i;
    		}
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	
    	int target0 = 1;
    	int startFuel0 = 1;
    	int[][] stations0 = {{10},
    						{100}};
    	
    	System.out.println(minRefuelStops(target0, startFuel0, stations0) + "\n");
    	
    	int target1 = 100;
    	int startFuel1 = 1;
    	int[][] stations1 = {{10},
    						{100}};
    	
    	System.out.println(minRefuelStops(target1, startFuel1, stations1) + "\n");
    	
    	int target2 = 100;
    	int startFuel2 = 10;
    	int[][] stations2 = {{10, 60},
    						 {20, 30},
    						 {30, 30},
    						 {60, 40}};
    	System.out.println(minRefuelStops(target2, startFuel2, stations2));
    }
}
