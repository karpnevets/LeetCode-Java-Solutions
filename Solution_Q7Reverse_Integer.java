import java.util.Enumeration;

public class Solution_Q7Reverse_Integer {
    public static int reverse(int x) {
        if (x == 0)
            return 0;

        boolean is_minus = x < 0 ? true : false;
        int index = 0;
        int num = Math.abs(x);
        int res = 0;
        while (num > 0){
            index++;
            num /= 10;
        }
        num = Math.abs(x);
        for (int i = index; i > 0; i--) {
            res += (num % 10) * (int)Math.pow(10, i - 1);
            if (res / (int)Math.pow(10, i - 1) % 10 != num % 10)
                return 0;
            num /= 10;
        }
        if (is_minus)
            return -res;
        return res;

    }

    public static void main(String[] args) {
         System.out.println(reverse(1534236469));
    }
}

/**Attempts: 7   Runtime: 1ms   Memory: 40.89MB**/
