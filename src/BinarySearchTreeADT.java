import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeADT extends BinaryTree_ADT
{

    public void insert(int element)
    {
        insert_Recursive(getRoot(), element);
    }

    BinaryTreeNode insert_Recursive(BinaryTreeNode root, int element) {

        if (root == null) {
            root = new BinaryTreeNode();
            root.setElement(element);
            return root;
        }

        if (element < root.getElement())     //insert in the left subtree
            root.addLeftChild(insert_Recursive(root.getRightChild(), element));
        else if (element > root.getElement())    //insert in the right subtree
            root.addRightChild(insert_Recursive(root.getRightChild(), element));

        return root;
    }


    public void StoreNodes(BinaryTreeNode root, ArrayList<BinaryTreeNode> nodes)
{
    if(root == null)
    {
        return;
    }

    StoreNodes(root.getLeftChild(), nodes);
    nodes.add(root);
    StoreNodes(root.getRightChild(), nodes);
}

    public BinaryTreeNode BuildBinaryTree(ArrayList<BinaryTreeNode> nodes, int start, int end)
    {
        if(start > end)
        {
            return null;
        }

        int mid = (start + end) / 2;
        BinaryTreeNode node = nodes.get(mid);
        BinaryTreeNode nodeLeft = BuildBinaryTree(nodes, start, mid -1);
        node.addLeftChild(nodeLeft);
        BinaryTreeNode nodeRight = BuildBinaryTree(nodes, mid +1, end);
        node.addRightChild(nodeRight);

        return node;
    }

    private BinaryTreeNode Rebalance(BinaryTreeNode root)
    {
        ArrayList<BinaryTreeNode> nodes = new ArrayList<>();
        StoreNodes(root, nodes);

        int n = nodes.size();
        return BuildBinaryTree(nodes, 0, n-1);
    }

    public void rebalance()
    {
        Rebalance(getRoot());
    }


}
