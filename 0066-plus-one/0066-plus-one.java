import java.util.Vector;
import java.util.Collections;
class Solution {
    public int[] plusOne(int[] digits) {
        Vector<Integer> ans = new Vector<>();
		int carry = 1;
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			int ele = digits[i]+carry;
			if (ele>9) {
				ans.add(ele%10);
			} else {
				carry = 0;
				ans.add(ele);
			}
		}
		if (carry == 1)
			ans.add(carry);
		Collections.reverse(ans);

         // Convert Vector<Integer> to int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}