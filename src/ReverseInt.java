
public class ReverseInt {

    public static int revers(int x){
        int result = 0;
        while(x != 0){
            int temp = x % 10;
            x = x/10;
            //deal with Max and Min value
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result * 10 + temp;
        }
        return result;
    }

}
