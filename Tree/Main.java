public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    BinaryTree tree = new BinaryTree();
    tree.populate(scanner);
    
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
    
    scanner.close();
  }
}