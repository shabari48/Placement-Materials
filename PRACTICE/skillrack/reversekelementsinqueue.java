import java.util.*;

class reversekelementsinqueue {

  // Function to reverse first k elements of a queue.
  public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
    // add code here.
    int n = q.size();
    Stack<Integer> stk = new Stack<Integer>();

    for (int i = 0; i < k; i++) {
      stk.push(q.peek());
      q.remove();
    }

    Queue<Integer> queue = new LinkedList<Integer>();

    for (int i = 0; i < k; i++) {
      queue.add(stk.peek());
      stk.pop();
    }

    for (int i = 0; i < (n - k); i++) {
      queue.add(q.peek());
      q.remove();
    }
    return queue;
  }
}
