import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveDuplicate {
public static List<Integer> removeDuplicates(List<Integer> input1) {
ArrayList<Integer> ar = new ArrayList<Integer>();
for (Integer i : input1) {
if (!ar.contains(i)) {
ar.add(i);
}
}
return ar;
}
}