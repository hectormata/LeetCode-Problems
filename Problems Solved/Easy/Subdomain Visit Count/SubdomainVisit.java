import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubdomainVisit {

	public static List<String> subDomainVisits(String[] cpdomains) {
		
		Map<String, Integer> counts = new HashMap<String, Integer>();
		
		for (String domain : cpdomains) {
			
			String[] cpInfo = domain.split("\\s+");
			String[] frags = cpInfo[1].split("\\.");
			int count = Integer.valueOf(cpInfo[0]);
			String cur = "";
			
			for (int i = frags.length - 1; i >= 0; i--) {
				
				cur = frags[i] + (i < frags.length - 1 ? "." : "") + cur;
				counts.put(cur, counts.getOrDefault(cur, 0) + count);
			}
		}
		
		List<String> answer = new ArrayList<String>();
		
		for (String dom : counts.keySet()) {
			
			answer.add("" + counts.get(dom) + " " + dom);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		
		String[] cpdomains = {"9001 discuss.leetcode.com"};
		
		List<String> answer = subDomainVisits(cpdomains);
		
		for (String a : answer) {
			System.out.println(a);
		}
	}
}
