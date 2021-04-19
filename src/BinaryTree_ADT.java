import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree_ADT {
    private BinaryTreeNode node;
    private int size;
    private ArrayList<Integer> list = new ArrayList<>();


    public BinaryTreeNode getRoot()
    {
        return node;
    }

    public void setRoot(BinaryTreeNode node)
    {
        this.node = node;
    }

    public boolean isEmpty()
    {
        return node == null;
    }

    public int size()
    {
        ArrayList<Integer> tmp = inOrder();
        return tmp.size();
    }

    public boolean contains(BinaryTreeNode node, int element)
    {
        // OK if specified string equals our data
        if ((node != null) && node.getElement() == element)
            return (true);

        // OK if contained in left tree
        if ((node.getLeftChild() != null) && contains(node.getLeftChild(), element))
            return (true);

        // OK if contained in right tree
        if ((node.getRightChild() != null) && contains(node.getRightChild(), element))
            return (true);

        // Otherwise, it's not OK
        return (false);
    }


    public ArrayList<Integer> inOrder()
    {
        if(node == null)
        {
            return null;
        }

        Stack<BinaryTreeNode> stack = new Stack();
        BinaryTreeNode current = node;
        while(current != null || stack.size() > 0)
        {
           while(current != null){
               stack.push(current);
               current = current.getLeftChild();
           }
           current = stack.pop();
           list.add(current.getElement());
           current = current.getRightChild();
        }

        return list;

    }

    public ArrayList<Integer> preOrder()
    {
        if(node == null)
        {
            return null;
        }

        Stack<BinaryTreeNode> stack = new Stack();
        BinaryTreeNode current = node;
        while(current != null || stack.size() > 0)
        {

            while(current != null){
                stack.push(current);
                list.add(current.getElement());
                current = current.getLeftChild();
            }
            current = stack.pop();
            current = current.getRightChild();

        }

        return list;
    }




    public ArrayList<Integer> postOrder()
    {
        // Create two stacks
        Stack<BinaryTreeNode> s1 = new Stack<>();
        Stack<BinaryTreeNode> s2 = new Stack<>();

        if (node == null)
            return null;

        // push root to first stack
        s1.push(node);

        // Run while first stack is not empty
        while (!s1.isEmpty()) {
            // Pop an item from s1 and push it to s2
            BinaryTreeNode temp = s1.pop();
            s2.push(temp);

            // Push left and right children of
            // removed item to s1
            if (temp.getLeftChild() != null)
                s1.push(temp.getLeftChild());
            if (temp.getRightChild() != null)
                s1.push(temp.getRightChild());
        }

        // Print all elements of second stack
        while (!s2.isEmpty()) {
            BinaryTreeNode temp = s2.pop();
            list.add(temp.getElement());
        }

        return list;
    }

    public ArrayList<Integer> levelOrder()
    {
        if(node == null)
            return null;

        Queue<BinaryTreeNode> queue1 = new LinkedList<>();
        queue1.add(node);

        while(queue1.size() != 0)
        {
            BinaryTreeNode poll = queue1.poll();
            list.add(poll.getElement());

            if(poll.getLeftChild() != null)
                queue1.add(poll.getLeftChild());
            if(poll.getRightChild() != null)
                queue1.add(poll.getRightChild());
        }
        return list;
    }


    public int height()
    {
        if(node == null)
            return -1;

        Queue<BinaryTreeNode> heightQueue = new LinkedList<>();

        heightQueue.add(node);
        int height = -1;

        while(true)
        {
            int nodeCount = heightQueue.size();
            if(nodeCount == 0)
                return height;
            else
                height++;

            while (nodeCount > 0)
            {
                BinaryTreeNode poll = heightQueue.poll();
                if(poll.getLeftChild() != null)
                heightQueue.add(poll.getLeftChild());
                if(poll.getRightChild() != null)
                heightQueue.add(poll.getRightChild());
                nodeCount--;
            }
        }
    }


    public BinaryTreeNode removeElement(int element)
    {
        return deleteNode(node, element);
    }

    private BinaryTreeNode deleteNode(BinaryTreeNode root, int data) {

        if(root == null) return root;

        if(data < root.getElement()) {
            BinaryTreeNode leftChild = root.getLeftChild();
            deleteNode(root.getLeftChild(), data);

        } else if(data > root.getElement()) {
            root.addRightChild(deleteNode(root.getRightChild(), data));
        } else {
            // node with no leaf nodes
            if(root.getLeftChild() == null && root.getRightChild() == null) {

                return null;
            } else if(root.getLeftChild() == null) {
                // node with one node (no left node)

                return root.getRightChild();
            } else if(root.getRightChild() == null) {
                // node with one node (no right node)

                return root.getLeftChild();
            } else {
                // nodes with two nodes
                // search for min number in right sub tree
                Integer minValue = minValue(root.getRightChild());
                root.setElement(minValue);
                root.addRightChild(deleteNode(root.getRightChild(), minValue));

            }
        }

        return root;
    }

    private Integer minValue(BinaryTreeNode node) {

        if(node.getLeftChild() != null) {
            return minValue(node.getLeftChild());
        }
        return node.getElement();
    }

























/*

    public ArrayList<Integer> postOrder2()
    {
        if (node == null)
            return null;

        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode current = node;

        while (true)
        {
            while (current != null)
            {
                if (current.getRightChild() != null)
                    s.push(current.getRightChild());
                s.push(current);
                current = current.getLeftChild();
            }

            if (s.isEmpty())
                return list;


            current = s.pop();

            if (current.getRightChild() != null && !s.isEmpty() && current.getRightChild() == s.peek())
            {
                s.pop();
                s.push(current);
                current = current.getRightChild();
            }
            else
            {
                list.add(current.getElement());
                current = null;
            }
        }
    }


 */


}
