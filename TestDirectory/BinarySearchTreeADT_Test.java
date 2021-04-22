
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class BinarySearchTreeADT_Test {

    private BinarySearchTreeADT searchTree;
    private BinarySearchTreeADT searchTree2;

    /*

    @BeforeEach
    public void BinarySearchTreeADT_Test()
    {
        searchTree = new BinarySearchTreeADT();
    }

    @Test
    public void testInsert()
    {
        setupSearchTree6Notes(searchTree);
        int size = searchTree.size();

        BinaryTreeNode node1 = new BinaryTreeNode();
        node1.setElement(2);
        searchTree.insert(node1);
        int size2 = searchTree.size();

        // We expect the result to be equal
        Assertions.assertEquals(size, size2);

        BinaryTreeNode node7 = new BinaryTreeNode();
        node7.setElement(7);
        searchTree.insert(node7);
        int size3 = searchTree.size();

        // We expect the result to not be equal
        Assertions.assertEquals(size2++,size3);
    }

    @Test
    public void testRemoveElement()
    {
        setupSearchTree6Notes(searchTree);
        int size = searchTree.size();

        searchTree.removeElement(2);
        int size2 = searchTree.size();

        // We expect the result to be true
        Assertions.assertEquals(size--,size2);

        searchTree.removeElement(7);
        int size3 = searchTree.size();

        // We expect the result to be true
        Assertions.assertEquals(size2, size3);
    }

    @Test
    public void testFindMin()
    {
        setupSearchTree6Notes(searchTree);
        // I dette tilfælde er minimum node 1

        int minimum = searchTree.findMin();

        // We expect the result to be true
        Assertions.assertEquals(1, minimum);
    }

    @Test
    public void testFindMax()
    {
        setupSearchTree6Notes(searchTree);
        // I dette tilfælde er maximum node 6

        int maximum = searchTree.findMax();

        // We expect the result to be true
        Assertions.assertEquals(6, maximum);
    }

    @Test
    public void testRebalance()
    {
        setupSearchTree6Notes(searchTree);
        setupBBSTWith6Notes(searchTree2);

        searchTree.rebalance();

        // We expect the result to be true
        Assertions.assertEquals(searchTree, searchTree2);
    }

    private void setupBBSTWith6Notes(BinarySearchTreeADT searchTree)
    {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();

        searchTree.setRoot(node4);
        node4.addLeftChild(node2);
        node4.addRightChild(node5);
        node2.addLeftChild(node1);
        node2.addRightChild(node3);
        node5.addLeftChild(node6);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
    }

    private void setupSearchTree6Notes(BinarySearchTreeADT searchTree)
    {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();

        searchTree.setRoot(node1);
        node1.addLeftChild(node2);
        node1.addRightChild(node3);
        node2.addLeftChild(node4);
        node2.addRightChild(node5);
        node4.addLeftChild(node6);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);

    }

*/


}
