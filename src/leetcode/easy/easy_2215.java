import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        return List.of(
                s1.stream().filter(e->!s2.contains(e)).collect(Collectors.toList()),
                s2.stream().filter(e->!s1.contains(e)).collect(Collectors.toList())
        );
    }
}