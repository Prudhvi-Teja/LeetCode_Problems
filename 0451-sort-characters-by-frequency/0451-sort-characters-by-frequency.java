import java.util.*;
class Solution {
    
    // Sort hashMap based on the Value 
    public HashMap<Character,Integer> sortMap(HashMap<Character,Integer> map){
        
        // To store the elements in the list we used LinkedList
        
        List<Map.Entry<Character,Integer>> list =
                new LinkedList<Map.Entry<Character,Integer>>(map.entrySet());
        
        // For Sorting the we are using customized sorting order 
        Collections.sort(list, (Map.Entry<Character, Integer> o1,
                    Map.Entry<Character, Integer> o2) -> {
            
            return -(o1.getValue()).compareTo(o2.getValue());
            
        });
        
        // For Storing the sorted List into HashMap which must be insertion Order
        // Should be preserved for that LinkedHashMap
        
        HashMap<Character,Integer> hm = new
                LinkedHashMap<>();
        
        for(Map.Entry<Character,Integer> kv : list)
            hm.put(kv.getKey(),kv.getValue());
        
        return hm;
        
    }
    
    
    public String frequencySort(String s) {
               
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        map = sortMap(map);
        
        for(Map.Entry<Character,Integer> res : map.entrySet()){
            
            for(int i =0 ; i< res.getValue(); i++)
                sb.append(res.getKey());
            
        }
        
        
        return sb.toString();
        
    }
}