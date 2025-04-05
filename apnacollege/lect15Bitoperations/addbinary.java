class Solution {
    public String addBinary(String a, String b) {
        // Get the lengths of both binary strings
        int alen = a.length();
        int blen = b.length();
        
        // Initialize variables:
        // i - to traverse both strings starting from the least significant bit (rightmost bit)
        // carry - to store the carry-over during binary addition
        int i = 0, carry = 0;
        
        // Use StringBuilder to store the result (in reverse order initially)
        StringBuilder ans = new StringBuilder();
        
        // Loop until all bits are processed from both strings or carry remains
        while (i < alen || i < blen || carry != 0) {
            // Get the current bit from string `a` (right to left)
            int x = 0; // Default value if there are no more bits in `a`
            if (i < alen && a.charAt(alen - i - 1) == '1') {
                x = 1; // Set x to 1 if the current bit in `a` is '1'
            }
            
            // Get the current bit from string `b` (right to left)
            int y = 0; // Default value if there are no more bits in `b`
            if (i < blen && b.charAt(blen - i - 1) == '1') {
                y = 1; // Set y to 1 if the current bit in `b` is '1'
            }
            
            // Calculate the sum of x, y, and carry (mod 2 gives the current bit of the result)
            ans.append((x + y + carry) % 2);
            
            // Update carry (integer division by 2)
            carry = (x + y + carry) / 2;
            
            // Move to the next bit
            i = i + 1;
        }
        
        // Reverse the result since we constructed it in reverse order
        return ans.reverse().toString();
    }
}
