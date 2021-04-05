public class BinaryTreeNode {

    private int element;
    private BinaryTreeNode leftChild;
    private BinaryTreeNode rightChild;

    public void setElement(int element)
    {
        this.element = element;
    }

    public int getElement()
    {
        return element;
    }

    public void addLeftChild(BinaryTreeNode leftChild)
    {
        this.leftChild = leftChild;
    }

    public void addRightChild(BinaryTreeNode rightChild)
    {
        this.rightChild = rightChild;
    }

    public BinaryTreeNode getLeftChild()
    {
        return leftChild;
    }

    public BinaryTreeNode getRightChild()
    {
        return rightChild;
    }
}
