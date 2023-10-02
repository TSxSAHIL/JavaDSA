import java.util.Scanner;

class BinarySearchTree {

  private static class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
      this.value = value;
    }
  }

  private Node root;

  public BinarySearchTree() {
    root = null;
  }

  // Insert elements
  public void insert(int value) {
    root = insert(root, value);
  }

  private Node insert(Node node, int value) {
    if (node == null) {
      return new Node(value);
    }

    if (value < node.value) {
      node.left = insert(node.left, value);
    } else if (value > node.value) {
      node.right = insert(node.right, value);
    }

    return node;
  }

  public void display() {
    display(root, "");
  }

  private void display(Node node, String indent) {
    if (node == null) {
      return;
    }
    System.out.println(indent + node.value);
    display(node.left, indent + "\t");
    display(node.right, indent + "\t");
  }

  public void prettyDisplay() {
    prettyDisplay(root, 0);
  }

  private void prettyDisplay(Node node, int level) {
    if (node == null) {
      return;
    }

    prettyDisplay(node.right, level + 1);

    if (level != 0) {
      for (int i = 0; i < level - 1; i++) {
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.value);
    } else {
      System.out.println(node.value);
    }
    prettyDisplay(node.left, level + 1);
  }

  public void preOrder() {
    preOrder(root);
  }

  private void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public void inOrder() {
    inOrder(root);
  }

  private void inOrder(Node node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);
  }

  public void postOrder() {
    postOrder(root);
  }

  private void postOrder(Node node) {
    if (node == null) {
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value + " ");
  }
  public static void main(String[] args) {
    BinarySearchTree tree = new BinarySearchTree();
    int[] nums = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };

    for (int num : nums) {
      tree.insert(num);
    }

    System.out.println("Displaying the tree:");
    tree.display();

    System.out.println("Pretty Display:");
    tree.prettyDisplay();

    System.out.println("Pre-order Traversal:");
    tree.preOrder();

    System.out.println("\nIn-order Traversal:");
    tree.inOrder();

    System.out.println("\nPost-order Traversal:");
    tree.postOrder();
  }
}
