
class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            // Check if there is at least one duplicate character in the string
            Set<Character> set = new HashSet<>();
            for (char ch : s.toCharArray()) {
                if (set.contains(ch)) {
                    return true;
                }
                set.add(ch);
            }
            return false;
        } else {
            // Find the indices where characters differ
            List<Integer> diff = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    diff.add(i);
                }
            }

            // There should be exactly two differences, and swapping them should make the strings equal
            return diff.size() == 2 &&
                   s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) &&
                   s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
        }
    }
}
