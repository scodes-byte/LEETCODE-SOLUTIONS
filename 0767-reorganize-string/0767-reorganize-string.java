import java.util.*;

public class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];
        
        // Count frequency of characters
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Check if rearrangement is possible
        int maxCount = 0;
        for (int count : freq) {
            if (count > maxCount) maxCount = count;
        }
        if (maxCount > (n + 1) / 2) return "";
        
        // Max heap to store characters by frequency
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                maxHeap.offer(new int[]{i, freq[i]});
            }
        }
        
        StringBuilder result = new StringBuilder();
        int[] prev = {-1, 0}; // previous character index and count
        
        while (!maxHeap.isEmpty()) {
            int[] current = maxHeap.poll();
            result.append((char)(current[0] + 'a'));
            current[1]--;
            
            if (prev[1] > 0) {
                maxHeap.offer(prev);
            }
            prev = current;
        }
        
        return result.length() == n ? result.toString() : "";
    }
}
