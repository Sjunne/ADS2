public class BinaryTree_ADT {
    private BinaryTreeNode node;
    private int size;


    public BinaryTreeNode getRoot()
    {
        return node;
    }

    public void setRoot(BinaryTreeNode node)
    {
        size++;
        this.node = node;
    }

    public boolean isEmpty()
    {
        return node == null;
    }

    public int size()
    {
        return size;
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
}
