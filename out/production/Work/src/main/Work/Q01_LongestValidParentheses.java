import java.util.Scanner;
import java.util.Stack;


// 括号字符串的最长有效长度
// 难度：中等
// 关联题：Q10_ValidParentheses

/**
 * 1. 标题：括号字符串的最长有效长度 | 时间限制：2秒 | 内存限制：262144K
 * 给定一个括号字符串str(就不用我们自己限定了，题目明确要求只能给包括括号的字符串)，返回最长的能够完全正确匹配括号字符子串的长度。
 * 输入描述:
 * 输出一行字符串，代表str。
 * 输出描述:
 * 输出一个整数，代表括号字符串的最长有效长度。
 *
 *
 * 要解决这个问题，我们可以使用动态规划（Dynamic Programming）或栈（Stack）的方法。
 * 这里我们采用栈的方法来找到最长的有效括号匹配子串的长度。
 * 栈的方法具有较好的时间复杂度和空间复杂度，比较容易理解和实现。
 *
 * 基本思路如下：
 * 使用一个栈来存储括号的索引。
 * 初始化一个变量 maxLength 来记录最长的有效括号长度。
 * 遍历字符串 str：
 * 如果当前字符是左括号 '('，则将它的索引压入栈。
 * 如果当前字符是右括号 ')'：
 * 如果栈不为空，弹出栈顶元素，并计算当前有效括号的长度，如果长度比 maxLength 大则更新 maxLength。
 * 如果栈为空，说明当前的右括号没有匹配的左括号，更新最后一个未匹配的位置。
 * 遍历结束后，maxLength 就是最长的有效括号长度。
 *
 * 这个程序的核心在于利用栈来记录每个左括号的索引以及未匹配的右括号索引，从而计算有效括号子串的长度。
 * 初始化栈时先放入 -1 作为基础参照，这有助于处理最开始的有效括号匹配子串。
 * 通过更新 maxLength，最终得到最长有效括号子串的长度。
 *
 * 测试效果
 * (() 2。这个是2而不是0，说明，不是说子串一定要从左开始。它其实是整个字符串中的任何一段截取的有效的括号子串。
 * ())( 2 这种也是2，而不是4。有个好理解的方式，就是，求出来的最长子串，放入idea，它是不报错，是符合我们直观理解的对的那种。
 * ()(() 2
 * (()())) 6
 * */
public class Q01_LongestValidParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();

        System.out.println(longestValidParentheses(str));
    }

    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        // 为什么在遍历还没开始前就放一个-1呢？
        // 放一个数是为了防止有时候栈中没有元素，调用i - stack.peek()的时候报错。
        // 而放入-1这个数字并不是随便放的。i - stack.peek()中，某些情况下，如果stack.peek()取出的是-1这个元素，那么i-(-1)变成i+1
        // 之所以是i+1是因为，下面的for循环时候，i是从0开始的。所以实际长度要是i+1
        stack.push(-1);
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }
}

