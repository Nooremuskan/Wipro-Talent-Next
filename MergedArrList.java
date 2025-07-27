import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MergedArrList {
     public static void main(String[] args) {
        Integer[] arr1 = {2, 5, 6};
        Integer[] arr2 = {10, 1, 4};
        List<Integer> mergedList = new ArrayList<>();
        mergedList.addAll(Arrays.asList(arr1));
        mergedList.addAll(Arrays.asList(arr2));
        mergedList.sort(Collections.reverseOrder());
        System.out.println(mergedList);
    }
    
}
