class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new LinkedList<>();

        for(String op : operations){
            switch(op){
                case "C" :
                    stack.pop();
                    break;

                case "D" :
                    stack.push(stack.peek()*2);
                    break;
                
                case "+" :
                    int last = stack.pop();
                    int newScore = last + stack.peek();
                    stack.push(last);
                    stack.push(newScore);
                    break;

                default :
                    stack.push(Integer.parseInt(op));

            }
        }
        int sum = 0;
        for(int num : stack){
            sum = sum + num;
        }
        return sum;
    }
}