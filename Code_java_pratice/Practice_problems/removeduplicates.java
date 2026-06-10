package Practice_problems;
import java.util.HashMap;
import java.util.Map;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        Map<Integer,Boolean> map=new HashMap<>();;
        for (int num : arr) {

            map.put(num, true);

        }
        for (int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}

