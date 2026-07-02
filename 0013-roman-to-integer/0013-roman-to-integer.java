class Solution {
    public int romanToInt(String s) {

        int ans = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            int curr = 0;

            if (s.charAt(i) == 'I') curr = 1;
            else if (s.charAt(i) == 'V') curr = 5;
            else if (s.charAt(i) == 'X') curr = 10;
            else if (s.charAt(i) == 'L') curr = 50;
            else if (s.charAt(i) == 'C') curr = 100;
            else if (s.charAt(i) == 'D') curr = 500;
            else if (s.charAt(i) == 'M') curr = 1000;

            if (curr < prev) {
                ans -= curr;
            } else {
                ans += curr;
            }

            prev = curr;
        }

        return ans;
    }
}