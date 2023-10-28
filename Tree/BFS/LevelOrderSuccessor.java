import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import javax.swing.tree.TreeNode;

import TreeTraversal.Node;

class LevelOrderSuccessor {
    public TreeNode findSuccessor(TreeNode root , int key){
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!q.isEmpty()){
            int levelSize = queue.size();
            TreeNode currentNode = q.poll();
            if(currentNode.left !=null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val == key){
                break;
            }
        }
        return queue.peek();
    }    
}

//Normal order 
/*
    -> remove from front 
    -> add in back

    //Reverse Order 
    -> remove back 
    -> add in front
 */
public List<List<Integer>> zigzaglevelOrder(TreeNode root){
    List<List<Integer>> result = new ArrayList<>();

    if(root == null){
        return result;
    }

    Deque<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    boolean rev = false;
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Integer> currentLevel = new ArrayList<>(levelSize);
        for(int i = 0 ; i<levelSize ; i++){
            if (!rev) {
                TreeNode currentNode = queue.pollFirst();
                currentLevel.add(currentNode.val);
                if(currentNode.left!=null){
                    queue.addLast(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.addLast(currentNode.right);
                }
            }
            else{
                TreeNode currentNode = queue.pollLast();
                currentLevel.add(currentNode.val);
                if(currentNode.right != null){
                    queue.addFirst(currentNode.right);
                }
                if(currentNode.left!=null){
                    queue.addFirst(currentNode.left);
                }
            }

            rev = !rev;
        }
        result.add(currentLevel);
    }
    return res;
}




public Node connect (Node root){
    if(root  == null){
        return null;
    }

    Node leftMost = root;

    while(leftMost.left != null){
        Node curr = leftMost;
        while(curr != null){
            curr.left.next = curr.right;
            if(curr.next != null){
                curr.right.next = curr.next.left;

            }
            curr = curr.next;
        }
        leftMost = leftMost.left;
    }
    return root;
}

public List<Integer> rightSideView(TreeNode root){
    List<Integer> result = new ArrayList<>();
    if(root == null){
        return result;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while(!q.isEmpty()){
        int levelSize = queue.size();
        for(int i = 0 ; i<levelSize ; i++){
            TreeNode curr = queue.poll();
            if(i==levelSize-1){
                result.add(curr.val);
            }
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }
    return result;
}