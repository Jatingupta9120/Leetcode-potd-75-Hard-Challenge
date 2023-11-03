/* 1441 :Build an Array With Stack Operations
Question link:-https://leetcode.com/problems/build-an-array-with-stack-operations/description/
My Solution in Java:-Day 02 of 75
 */
public class Solution {
    public List<String> buildArray(int[] target, int n) {
        HashSet<Integer> targetSet = new HashSet<>();
        for (int num : target) {
            targetSet.add(num);
        }

        List<String> result = new ArrayList<>();
        for (int i = 1; i <= target[target.length - 1]; i++) {
            if (targetSet.contains(i)) {
                result.add("Push");
            } else {
                result.add("Push");
                result.add("Pop");
            }
        }
        return result;
    }
}