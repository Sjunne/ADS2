import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeADT extends BinaryTree_ADT
{

    public void insert(int element)
    {
        if (super.getRoot() == null)
        {
            BinaryTreeNode node = new BinaryTreeNode();
            node.setElement(element);
            super.setRoot(node);
            return;
        }

        boolean contains = contains(super.getRoot(), element);

        if (contains)
        {
            return;
        }
        else
        {
            BinaryTreeNode node = getRoot();

            while (node.getLeftChild() != null || node.getRightChild() != null)
            {

            }
        }
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
