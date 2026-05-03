class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
        return false;

        String doubled = s+s;

        if(doubled.contains(goal))
        return true;

        return false;
    }
}