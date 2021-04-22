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



}
