public class Solution_Q13Roman_to_Integer {
    public int romanToInt(String s) {
        int num = 0;
        int index = 0;
        while (index < s.length()) {
            if (s.charAt(index) == 'M') {
                num += 1000;
                index++;
            } else if (s.charAt(index) == 'D') {
                num += 500;
                index++;
            } else if (s.charAt(index) == 'C') {
                index++;
                if (index == s.length()) {
                    num += 100;
                    return num;
                } else {
                    if (s.charAt(index) == 'M') {
                        num += 900;
                        index++;
                    } else if (s.charAt(index) == 'D') {
                        num += 400;
                        index++;
                    } else
                        num += 100;
                }
            } else if (s.charAt(index) == 'L') {
                num += 50;
                index++;
            } else if (s.charAt(index) == 'X') {
                index++;
                if (index == s.length()) {
                    num += 10;
                    return num;
                } else {
                    if (s.charAt(index) == 'C') {
                        num += 90;
                        index++;
                    } else if (s.charAt(index) == 'L') {
                        num += 40;
                        index++;
                    } else
                        num += 10;
                }
            } else if (s.charAt(index) == 'V') {
                num += 5;
                index++;
            } else if (s.charAt(index) == 'I') {
                index++;
                if (index == s.length()) {
                    num += 1;
                    return num;
                } else {
                    if (s.charAt(index) == 'X') {
                        num += 9;
                        index++;
                    } else if (s.charAt(index) == 'V') {
                        num += 4;
                        index++;
                    } else
                        num += 1;
                }
            }
        }
        return num;
    }
}


/**Attempts: 1   Runtime: 3ms   Memory: 44.73MB**/