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

    /*
    public void removeElement(int element)
    {
        boolean contains = contains(super.getRoot(), element);

        if (!contains)
        {

        }
        else
        {
            return;
        }
    }
*/
}
