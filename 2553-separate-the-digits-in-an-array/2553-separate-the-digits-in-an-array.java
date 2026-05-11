class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : nums) {
            // Convert to string to easily get digits in the correct order
            String s = Integer.toString(num);
            for (char c : s.toCharArray()) {
                list.add(c - '0'); // Convert char back to int
            }
        }
        
        // Convert ArrayList<Integer> to primitive int[]
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}