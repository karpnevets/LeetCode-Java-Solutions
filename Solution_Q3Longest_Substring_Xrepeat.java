import java.util.ArrayList;

public class Solution_Q3Longest_Substring_Xrepeat {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        int MAX_Len = 0;
        ArrayList temp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.substring(i, i+1));
            for (int j = i+1; j < s.length(); j++) {
                if (temp.contains(s.substring(j, j+1))){
                    if (MAX_Len < temp.size()){
                        MAX_Len = temp.size();

                    }
                    temp.clear();
                    break;
                }
                else{
                    temp.add(s.substring(j, j+1));
                    if (j == s.length() - 1){
                        if (MAX_Len < temp.size()){
                            MAX_Len = temp.size();

                        }
                        temp.clear();
                        break;
                    }
                }
            }
        }
        return MAX_Len;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }
}

/**Attempts: 4   Runtime: 1161ms   Memory: 45.56MB**/
