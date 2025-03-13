import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        for (int i: nums) {
            if (newSet.contains(i)){
                return true;
            }
            newSet.add(i);
        }
        return false;
    }
}
