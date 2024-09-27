class Node {

  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class GfG {

  Node reversell(Node res) {
    Node prev = null, curr = res, next = null;
    while (curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;
  }

  Node mergeResult(Node l1, Node l2) {
    // Your code here
    if (l1 == null && l2 == null) return null;
    if (l1 == null) return reversell(l2);
    if (l2 == null) return reversell(l1);

    if (l1.data > l2.data) {
      Node temp = l1;
      l1 = l2;
      l2 = temp;
    }

    Node res = l1;
    while (l1 != null && l2 != null) {
      Node temp = null;
      while (l1 != null && l1.data <= l2.data) {
        temp = l1;
        l1 = l1.next;
      }
      temp.next = l2;

      Node tmp = l1;
      l1 = l2;
      l2 = tmp;
    }

    Node ans = reversell(res);
    return ans;
  }
}
