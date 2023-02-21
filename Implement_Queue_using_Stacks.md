

**Problem Statement:**
Implement a queue using two stacks and operations enqueue() and dequeue().

**Sample Input**: 
enqueue(2); enqueue(3); enqueue(4);

**Sample Output**: 
2, 3, 4

**Solution**

Class Solution {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
   
    Solution() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    //Push element x to the back of queue
    public void enqueue(int x) {
        stack1.push(x);
    }
    
    //Removes the element from in front of queue
    public int dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}