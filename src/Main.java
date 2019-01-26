import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //two sum

        int[] two_sum = new int[]{2, 7, 11, 15};
        Twosum twosum = new Twosum();
        System.out.println(Arrays.toString(twosum.twoSum(two_sum,9)));

    }
}
