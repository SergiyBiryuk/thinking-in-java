package task_15;

public class StackComputing {
    public static void main(String[] args) {
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] array = str.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < array.length; i++)
            if (array[i] == '+') stack.push(array[++i]);
            else if (array[i] == '-') System.out.print(stack.pop());
        System.out.println();
    }
}
