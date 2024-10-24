import java.util.*;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> reportedCountMap = new HashMap<>();
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        for (String id : id_list) {
            reportMap.put(id, new HashSet<>());
        }
        
        for (String rep : report) {
            String[] tokens = rep.split(" ");
            String reporter = tokens[0];
            String reported = tokens[1];
            
            // 기신고 검증
            if (!reportMap.get(reporter).contains(reported)) {
                reportMap.get(reporter).add(reported);
                reportedCountMap.put(reported, reportedCountMap.getOrDefault(reported, 0) + 1);
            }
        }
        
        Map<String, Integer> resultCountMap = new HashMap<>();
        
        for (String reported : reportedCountMap.keySet()) {
            int count = reportedCountMap.get(reported);
            if (count >= k) {
                
                for (String reporter : reportMap.keySet()) {
                    if (reportMap.get(reporter).contains(reported)) {
                        resultCountMap.put(reporter, resultCountMap.getOrDefault(reporter, 0) + 1);
                    }
                }
            }
        }
        
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i += 1) {
            result[i] = resultCountMap.getOrDefault(id_list[i], 0);
        }
        return result;
    }
}

