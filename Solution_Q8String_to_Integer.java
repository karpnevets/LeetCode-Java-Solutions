public class Solution_Q8String_to_Integer {

    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int digits = 0;
        int num = 0;
        int n = s.length();

        while (index < n && s.charAt(index) == ' ')
            index++;

        if (index < n && s.charAt(index) == '+'){
            sign = 1;
            index++;
        }
        else if (index < n &&s.charAt(index) == '-') {
            sign = -1;
            index++;
        }

        while (index < n &&Character.isDigit(s.charAt(index))){
            digits++;
            index++;
        }
        index = index - digits;
        while (index < n &&Character.isDigit(s.charAt(index))){
            num += sign * Math.pow(10, digits - 1) * Integer.parseInt(String.valueOf(s.charAt(index)));
            digits--;
            index++;
        }
        return num;
    }
}

/**Attempts: 8   Runtime: 2ms   Memory: 43.08MB**/