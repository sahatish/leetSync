class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(st.peek() * 2);
            } else if (op.equals("+")) {
                int last = st.pop();
                int secondLast = st.peek();
                st.push(last);               
                st.push(last + secondLast);
            } else {
                st.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int n : st) sum += n;
        return sum;
    }
}
