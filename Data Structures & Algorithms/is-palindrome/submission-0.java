class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < filtered.length(); i++) {
            stack.push(filtered.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return filtered.toString().equals(reversed.toString());
    }
}