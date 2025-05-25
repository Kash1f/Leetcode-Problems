package Easy.BasicProblems;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {1,2,9 })));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

// int[] digits = {1, 2, 9};

// | Iteration | Index `i` | `digits[i]` Before | Condition (`== 9`)  | Action Taken              | `digits` After | Returned?  |
// | --------- | --------- | ------------------ | ------------------  | ------------------------- | -------------  | ---------  |
// | 1         | 2         | 9                  | ✅ True             | Set `digits[2] = 0`       | `{1, 2, 0}`    | ❌ No      |
// | 2         | 1         | 2                  | ❌ False            | `digits[1]++ → 3`, return | `{1, 3, 0}`    | ✅ Yes     |

// Final Output: [1, 3, 0]


// | Iteration | Index `i` | `digits[i]` Before | Condition (`== 9`) | Action Taken               | `digits` After | Returned? |
// | --------- | --------- | ------------------ | ------------------ | -------------------------- | -------------- | --------- |
// | 1         | 2         | 9                  | ✅ True             | Set `digits[2] = 0`        | `{9, 9, 0}`    | ❌ No      |
// | 2         | 1         | 9                  | ✅ True             | Set `digits[1] = 0`        | `{9, 0, 0}`    | ❌ No      |
// | 3         | 0         | 9                  | ✅ True             | Set `digits[0] = 0`        | `{0, 0, 0}`    | ❌ No      |
// | -         | -         | -                  | -                  | Create new array of size+1 | `{1, 0, 0, 0}` | ✅ Yes     |
