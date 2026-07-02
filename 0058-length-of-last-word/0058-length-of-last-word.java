/*class Solution {
    public int lengthOfLastWord(String s) {

        s = s.trim();

        String[] words = s.split(" ");

        return words[words.length - 1].length();
    }
}*/
class Solution {
    public int lengthOfLastWord(String s) {
        int count =0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!= ' '){
            count++;
            i--;
        }return count;



    }
}