package Trees;

class Node {

  int data;
  Node left;
  Node right;
  Node(int data) {
    this.data = data;
  }
}

public class IdenticalTrees {

  public static boolean isIdentical(Node x, Node y) {

    if (x == null && y == null) {
      return true;
    }
    return (x != null && y != null) && (x.data == y.data) && isIdentical(x.left, y.left)
        && isIdentical(x.right, y.right);
  }

  public static void main(String[] args) {
    Node x = new Node(10);
    x.left = new Node(5);
    x.right = new Node(6);
    x.left.left = new Node(8);
    x.left.right = new Node(9);
    x.right.left = new Node(16);
    x.right.right = new Node(1);

    Node y = new Node(10);
    y.left = new Node(5);
    y.right = new Node(6);
    y.left.left = new Node(8);
    y.left.right = new Node(9);
    y.right.left = new Node(16);
    y.right.right = new Node(1);
    System.out.println(isIdentical(x, y));
  }

}
