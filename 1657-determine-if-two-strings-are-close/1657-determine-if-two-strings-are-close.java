import java.util.Set;
import java.util.HashSet;
class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        //1. For checking the Frequency of the two Strings we are created two 
        // arrays for two strings
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        // For checking characters are present in both string are must be same
        // for this we are using hastset
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        
        //For Iteration over the String Convert it into charArray and update 
        // the Array count and add in set to character matching for both strings
        
        for(char c : word1.toCharArray()){
            count1[ c - 'a']++; // for arranging as per ascii values of increment
            set1.add(c);   // For removing duplicates
        }
        
        for(char c : word2.toCharArray()){
            count2[ c - 'a']++; // for arranging as per ascii values of increment
            set2.add(c);   // For removing duplicates in word2 
        }
        
        //For sorting both arrays for the matching the Frequency of Both Strings
        Arrays.sort(count1);
        Arrays.sort(count2);
        
        return set1.equals(set2) && Arrays.equals(count1,count2);
        
        
    }
}