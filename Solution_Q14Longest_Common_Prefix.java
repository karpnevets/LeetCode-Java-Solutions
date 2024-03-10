public class Solution_Q14Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        int minword = 0;
        int minlen = Integer.MAX_VALUE;
        String prefix = "";
        boolean inall = true;

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minlen){
                minlen = strs[i].length();
                minword = i;
            }
        }
        prefix = strs[minword];
        while (prefix.length() > 0){
            inall = true;
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].indexOf(prefix) != 0){
                    inall = false;
                    break;
                }
            }
            if (inall == false && prefix.length() > 1)
                prefix = prefix.substring(0, prefix.length() - 1);
            else if (inall == false && prefix.length() == 1)
                return "";
            else if (inall == true)
                break;
        }
        return prefix;
    }
}

/**Attempts: 1   Runtime: 0ms   Memory: 41.46MB**/