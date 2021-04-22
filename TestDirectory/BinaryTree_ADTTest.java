import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree_ADTTest {

    private BinaryTree_ADT tree;

    @BeforeEach
    public void BinaryTree_ADTTest() {
        tree = new BinaryTree_ADT();
    }


    @Test
    public void TestSetAndGetRoot() {
        BinaryTreeNode rootNode = new BinaryTreeNode();
        tree.setRoot(rootNode);

        BinaryTreeNode root = tree.getRoot();

        //Check om den vi har lavet, er ens med træets rod
        Assertions.assertEquals(rootNode, root);
    }


    @Test
    public void TestIsEmpty() {
        //Check if root is empty, when it has never been set
        BinaryTreeNode root = tree.getRoot();
        Assertions.assertEquals(null, root);

        //check if isEmptyMessageWorks
        boolean empty = tree.isEmpty();
        Assertions.assertEquals(true, empty);
    }


    @Test
    public void TestInOrderMethod() {
        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        ArrayList<Integer> integers = tree.inOrder();
        ArrayList<Integer> inOrderArrayList = new ArrayList<>();
        inOrderArrayList.add(6);
        inOrderArrayList.add(4);
        inOrderArrayList.add(2);
        inOrderArrayList.add(5);
        inOrderArrayList.add(1);
        inOrderArrayList.add(3);

        //we expect the 2 arraylists to be equal
        Assertions.assertEquals(inOrderArrayList, integers);


        /**
         * Checking different tree setups:
         * Big, small, heavy left, heavy right
         */

        //31 nodes balanced tree
        setUpTree31NodesBalanced();
        ArrayList<Integer> tree = this.tree.inOrder();
        List<Integer> expectedOrderArrayList = List.of( 24, 12, 25, 6, 26, 13, 27, 3, 28, 14, 29, 7, 30, 15, 31, 1, 20, 10, 21, 5, 22, 11, 23, 2, 16, 8, 17, 4, 18, 9, 19);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy right sided tree
        setUpTree20NoteRightHeavySide();
        tree = this.tree.inOrder();
        expectedOrderArrayList = List.of(6,3,7,1,16,10,17,5,18,11,19,2,14,9,15,4,20,12,8,13);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy Left
        setUpTree20NotesLeftHeavySide();
        tree = this.tree.inOrder();
        expectedOrderArrayList = List.of(12,19,8,20,13,6,14,9,15,3,16,10,17,7,18,11,1,5,2,4);
        Assertions.assertEquals(expectedOrderArrayList, tree);
    }

    @Test
    public void size() {
        //testing size after Inorder, as size uses it.
        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        //so we expect size to be equal to 6

        int size = tree.size();
        Assertions.assertEquals(6, size);
    }


    @Test
    public void testCointainsMethod() {
        //nodes elements are 1-2-3-4-5-6
        setUpTree6NotesLeftHeavySide();

        //we expect to get true, when searching for a node with element 4
        int element4 = 4;
        Assertions.assertEquals(true, tree.contains(tree.getRoot(), element4));

        //we expect to get false when searching for a node with element 7
        int element7 = 7;
        Assertions.assertEquals(false, tree.contains(tree.getRoot(), element7));

        //we expect to get false, even when the node 4 is negative
        int negative4 = -4;
        Assertions.assertEquals(false, tree.contains(tree.getRoot(), negative4));
    }

    @Test
    public void testPreOrderMethod() {
        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        ArrayList<Integer> integers = tree.preOrder();
        ArrayList<Integer> inPreOrderArrayList = new ArrayList<>();
        inPreOrderArrayList.add(1);
        inPreOrderArrayList.add(2);
        inPreOrderArrayList.add(4);
        inPreOrderArrayList.add(6);
        inPreOrderArrayList.add(5);
        inPreOrderArrayList.add(3);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inPreOrderArrayList, integers);

        /**
         * Checking different tree setups:
         * Big, small, heavy left, heavy right
         */

        //31 nodes balanced tree
        setUpTree31NodesBalanced();
        ArrayList<Integer> tree = this.tree.preOrder();
        List<Integer> expectedOrderArrayList = List.of( 1, 3, 6, 12, 24, 25, 13, 26, 27, 7, 14, 28, 29, 15, 30, 31, 2, 5, 10, 20, 21, 11, 22, 23, 4, 8, 16, 17, 9, 18, 19);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy right sided tree
        setUpTree20NoteRightHeavySide();
        tree = this.tree.preOrder();
        expectedOrderArrayList = List.of(1,3,6,7,2,5,10,16,17,11,18,19,4,9,14,15,8,12,20,13);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy Left
        setUpTree20NotesLeftHeavySide();
        tree = this.tree.preOrder();
        expectedOrderArrayList = List.of(1,3,6,8,12,19,13,20,9,14,15,7,10,16,17,11,18,2,5,4);
        Assertions.assertEquals(expectedOrderArrayList, tree);
    }

    @Test
    public void testPostOrderMethod() {
        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        ArrayList<Integer> integers = tree.postOrder();
        ArrayList<Integer> inPostOrderArrayList = new ArrayList<>();
        inPostOrderArrayList.add(6);
        inPostOrderArrayList.add(4);
        inPostOrderArrayList.add(5);
        inPostOrderArrayList.add(2);
        inPostOrderArrayList.add(3);
        inPostOrderArrayList.add(1);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inPostOrderArrayList, integers);

        /**
         * Checking different tree setups:
         * Big, small, heavy left, heavy right
         */

        //31 nodes balanced tree
        setUpTree31NodesBalanced();
        ArrayList<Integer> tree = this.tree.postOrder();
        List<Integer> expectedOrderArrayList = List.of( 24, 25, 12, 26, 27, 13, 6, 28, 29, 14, 30, 31, 15, 7, 3, 20, 21, 10, 22, 23, 11, 5, 16, 17, 8, 18, 19, 9, 4, 2, 1);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy right sided tree
        setUpTree20NoteRightHeavySide();
        tree = this.tree.postOrder();
        expectedOrderArrayList = List.of(6,7,3,16,17,10,18,19,11,5,14,15,9,20,12,13,8,4,2,1);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy Left
        setUpTree20NotesLeftHeavySide();
        tree = this.tree.postOrder();
        expectedOrderArrayList = List.of(19,12,20,13,8,14,15,9,6,16,17,10,18,11,7,3,5,4,2,1);
        Assertions.assertEquals(expectedOrderArrayList, tree);
    }

    @Test
    public void testLevelOrder() {
        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        ArrayList<Integer> integers = tree.levelOrder();
        ArrayList<Integer> inLevelOrder = new ArrayList<>();
        inLevelOrder.add(1);
        inLevelOrder.add(2);
        inLevelOrder.add(3);
        inLevelOrder.add(4);
        inLevelOrder.add(5);
        inLevelOrder.add(6);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inLevelOrder, integers);

        /**
         * Checking different tree setups:
         * Big, small, heavy left, heavy right
         */

        //31 nodes balanced tree
        setUpTree31NodesBalanced();
        ArrayList<Integer> tree = this.tree.levelOrder();
        List<Integer> expectedOrderArrayList = List.of(1, 3, 2, 6, 7, 5, 4, 12, 13, 14, 15, 10, 11, 8, 9, 24, 25, 26, 27, 28, 29, 30, 31, 20, 21, 22, 23, 16, 17, 18, 19);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy right sided tree
        setUpTree20NoteRightHeavySide();
        tree = this.tree.levelOrder();
        expectedOrderArrayList = List.of(1,3,2,6,7,5,4,10,11,9,8,16,17,18,19,14,15,12,13,20);
        Assertions.assertEquals(expectedOrderArrayList, tree);

        //Heavy Left
        setUpTree20NotesLeftHeavySide();
        tree = this.tree.levelOrder();
        expectedOrderArrayList = List.of(1,3,2,6,7,5,4,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Assertions.assertEquals(expectedOrderArrayList, tree);
    }

    @Test
    public void testHeightOfTree() {
        //hvis tree'et er tomt, skal height returne -1
        int height0 = tree.height();
        Assertions.assertEquals(-1, height0);


        setUpTree6NotesLeftHeavySide();
        //nodes elements are 1-2-3-4-5-6
        //the height of current tree is 3
        int height = tree.height();
        Assertions.assertEquals(3, height);
    }

    // Testing large BinaryTree 31 nodes ------------------------------------------------------
    @Test
    public void TestInOrderMethodTree31NodesBalanced() {
        setUpTree31NodesBalanced();
        //nodes elements are 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30-31
        ArrayList<Integer> integers = tree.inOrder();
        ArrayList<Integer> inOrderArrayList = new ArrayList<>();
        inOrderArrayList.add(24);
        inOrderArrayList.add(12);
        inOrderArrayList.add(25);
        inOrderArrayList.add(6);
        inOrderArrayList.add(26);
        inOrderArrayList.add(13);
        inOrderArrayList.add(27);
        inOrderArrayList.add(3);
        inOrderArrayList.add(28);
        inOrderArrayList.add(14);
        inOrderArrayList.add(29);
        inOrderArrayList.add(7);
        inOrderArrayList.add(30);
        inOrderArrayList.add(15);
        inOrderArrayList.add(31);
        inOrderArrayList.add(1);
        inOrderArrayList.add(20);
        inOrderArrayList.add(10);
        inOrderArrayList.add(21);
        inOrderArrayList.add(5);
        inOrderArrayList.add(22);
        inOrderArrayList.add(11);
        inOrderArrayList.add(23);
        inOrderArrayList.add(2);
        inOrderArrayList.add(16);
        inOrderArrayList.add(8);
        inOrderArrayList.add(17);
        inOrderArrayList.add(4);
        inOrderArrayList.add(18);
        inOrderArrayList.add(9);
        inOrderArrayList.add(19);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inOrderArrayList, integers);

        //InOrder:
        //[24, 12, 25, 6, 26, 13, 27, 3, 28, 14, 29, 7, 30, 15, 31, 1, 20, 10, 21, 5, 22, 11, 23, 2, 16, 8, 17, 4, 18, 9, 19]
    }

    @Test
    public void TestPreOrderMethodTree31NodesBalanced() {
        setUpTree31NodesBalanced();
        //nodes elements are 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30-31
        ArrayList<Integer> integers = tree.preOrder();
        ArrayList<Integer> inOrderArrayList = new ArrayList<>();

        inOrderArrayList.add(1);
        inOrderArrayList.add(3);
        inOrderArrayList.add(6);
        inOrderArrayList.add(12);
        inOrderArrayList.add(24);
        inOrderArrayList.add(25);
        inOrderArrayList.add(13);
        inOrderArrayList.add(26);
        inOrderArrayList.add(27);
        inOrderArrayList.add(7);
        inOrderArrayList.add(14);
        inOrderArrayList.add(28);
        inOrderArrayList.add(29);
        inOrderArrayList.add(15);
        inOrderArrayList.add(30);
        inOrderArrayList.add(31);
        inOrderArrayList.add(2);
        inOrderArrayList.add(5);
        inOrderArrayList.add(10);
        inOrderArrayList.add(20);
        inOrderArrayList.add(21);
        inOrderArrayList.add(11);
        inOrderArrayList.add(22);
        inOrderArrayList.add(23);
        inOrderArrayList.add(4);
        inOrderArrayList.add(8);
        inOrderArrayList.add(16);
        inOrderArrayList.add(17);
        inOrderArrayList.add(9);
        inOrderArrayList.add(18);
        inOrderArrayList.add(19);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inOrderArrayList, integers);

        //PreOrder:
        //[1, 3, 6, 12, 24, 25, 13, 26, 27, 7, 14, 28, 29, 15, 30, 31, 2, 5, 10, 20, 21, 11, 22, 23, 4, 8, 16, 17, 9, 18, 19]
    }

    @Test
    public void TestPostOrderMethodTree31NodesBalanced() {
        setUpTree31NodesBalanced();
        //nodes elements are 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30-31
        ArrayList<Integer> integers = tree.postOrder();
        ArrayList<Integer> inOrderArrayList = new ArrayList<>();

        inOrderArrayList.add(24);
        inOrderArrayList.add(25);
        inOrderArrayList.add(12);
        inOrderArrayList.add(26);
        inOrderArrayList.add(27);
        inOrderArrayList.add(13);
        inOrderArrayList.add(6);
        inOrderArrayList.add(28);
        inOrderArrayList.add(29);
        inOrderArrayList.add(14);
        inOrderArrayList.add(30);
        inOrderArrayList.add(31);
        inOrderArrayList.add(15);
        inOrderArrayList.add(7);
        inOrderArrayList.add(3);
        inOrderArrayList.add(20);
        inOrderArrayList.add(21);
        inOrderArrayList.add(10);
        inOrderArrayList.add(22);
        inOrderArrayList.add(23);
        inOrderArrayList.add(11);
        inOrderArrayList.add(5);
        inOrderArrayList.add(16);
        inOrderArrayList.add(17);
        inOrderArrayList.add(8);
        inOrderArrayList.add(18);
        inOrderArrayList.add(19);
        inOrderArrayList.add(9);
        inOrderArrayList.add(4);
        inOrderArrayList.add(2);
        inOrderArrayList.add(1);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inOrderArrayList, integers);

        //PostOrder:
        //[24, 25, 12, 26, 27, 13, 6, 28, 29, 14, 30, 31, 15, 7, 3, 20, 21, 10, 22, 23, 11, 5, 16, 17, 8, 18, 19, 9, 4, 2, 1]
    }

    @Test
    public void TestLevelOrderMethodTree31NodesBalanced() {
        setUpTree31NodesBalanced();
        //nodes elements are 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18-19-20-21-22-23-24-25-26-27-28-29-30-31
        ArrayList<Integer> integers = tree.levelOrder();
        ArrayList<Integer> inOrderArrayList = new ArrayList<>();

        inOrderArrayList.add(1);
        inOrderArrayList.add(3);
        inOrderArrayList.add(2);
        inOrderArrayList.add(6);
        inOrderArrayList.add(7);
        inOrderArrayList.add(5);
        inOrderArrayList.add(4);
        inOrderArrayList.add(12);
        inOrderArrayList.add(13);
        inOrderArrayList.add(14);
        inOrderArrayList.add(15);
        inOrderArrayList.add(10);
        inOrderArrayList.add(11);
        inOrderArrayList.add(8);
        inOrderArrayList.add(9);
        inOrderArrayList.add(24);
        inOrderArrayList.add(25);
        inOrderArrayList.add(26);
        inOrderArrayList.add(27);
        inOrderArrayList.add(28);
        inOrderArrayList.add(29);
        inOrderArrayList.add(30);
        inOrderArrayList.add(31);
        inOrderArrayList.add(20);
        inOrderArrayList.add(21);
        inOrderArrayList.add(22);
        inOrderArrayList.add(23);
        inOrderArrayList.add(16);
        inOrderArrayList.add(17);
        inOrderArrayList.add(18);
        inOrderArrayList.add(19);

        //we expect the 2 arraylist to be equal
        Assertions.assertEquals(inOrderArrayList, integers);

        //LevelOrder:
        //[1, 3, 2, 6, 7, 5, 4, 12, 13, 14, 15, 10, 11, 8, 9, 24, 25, 26, 27, 28, 29, 30, 31, 20, 21, 22, 23, 16, 17, 18, 19]
    }

    private void setUpTree6NotesLeftHeavySide() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();

        tree.setRoot(node1);
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


    private void setUpTree6NotesRightHeavySide() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();

        tree.setRoot(node1);
        node1.addLeftChild(node2);
        node1.addRightChild(node3);
        node3.addLeftChild(node4);
        node3.addRightChild(node5);
        node4.addLeftChild(node6);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
    }


    private void setUpTree7NotesBalanced() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();
        BinaryTreeNode node7 = new BinaryTreeNode();

        tree.setRoot(node1);
        node1.addLeftChild(node2);
        node1.addRightChild(node3);
        node2.addLeftChild(node4);
        node2.addRightChild(node5);
        node3.addLeftChild(node6);
        node3.addLeftChild(node7);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
        node7.setElement(7);
    }


    private void setUpTree20NoteRightHeavySide() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();
        BinaryTreeNode node7 = new BinaryTreeNode();
        BinaryTreeNode node8 = new BinaryTreeNode();
        BinaryTreeNode node9 = new BinaryTreeNode();
        BinaryTreeNode node10 = new BinaryTreeNode();
        BinaryTreeNode node11 = new BinaryTreeNode();
        BinaryTreeNode node12 = new BinaryTreeNode();
        BinaryTreeNode node13 = new BinaryTreeNode();
        BinaryTreeNode node14 = new BinaryTreeNode();
        BinaryTreeNode node15 = new BinaryTreeNode();
        BinaryTreeNode node16 = new BinaryTreeNode();
        BinaryTreeNode node17 = new BinaryTreeNode();
        BinaryTreeNode node18 = new BinaryTreeNode();
        BinaryTreeNode node19 = new BinaryTreeNode();
        BinaryTreeNode node20 = new BinaryTreeNode();


        tree.setRoot(node1);

        node1.addRightChild(node2);
        node1.addLeftChild(node3);
        node2.addRightChild(node4);
        node2.addLeftChild(node5);
        node3.addLeftChild(node6);
        node3.addRightChild(node7);
        node4.addRightChild(node8);
        node4.addLeftChild(node9);
        node5.addLeftChild(node10);
        node5.addRightChild(node11);
        node8.addLeftChild(node12);
        node8.addRightChild(node13);
        node9.addLeftChild(node14);
        node9.addRightChild(node15);
        node10.addLeftChild(node16);
        node10.addRightChild(node17);
        node11.addLeftChild(node18);
        node11.addRightChild(node19);
        node12.addLeftChild(node20);


        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
        node7.setElement(7);
        node8.setElement(8);
        node9.setElement(9);
        node10.setElement(10);
        node11.setElement(11);
        node12.setElement(12);
        node13.setElement(13);
        node14.setElement(14);
        node15.setElement(15);
        node16.setElement(16);
        node17.setElement(17);
        node18.setElement(18);
        node19.setElement(19);
        node20.setElement(20);
    }

    private void setUpTree20NotesLeftHeavySide() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();
        BinaryTreeNode node7 = new BinaryTreeNode();
        BinaryTreeNode node8 = new BinaryTreeNode();
        BinaryTreeNode node9 = new BinaryTreeNode();
        BinaryTreeNode node10 = new BinaryTreeNode();
        BinaryTreeNode node11 = new BinaryTreeNode();
        BinaryTreeNode node12 = new BinaryTreeNode();
        BinaryTreeNode node13 = new BinaryTreeNode();
        BinaryTreeNode node14 = new BinaryTreeNode();
        BinaryTreeNode node15 = new BinaryTreeNode();
        BinaryTreeNode node16 = new BinaryTreeNode();
        BinaryTreeNode node17 = new BinaryTreeNode();
        BinaryTreeNode node18 = new BinaryTreeNode();
        BinaryTreeNode node19 = new BinaryTreeNode();
        BinaryTreeNode node20 = new BinaryTreeNode();


        tree.setRoot(node1);

        node1.addRightChild(node2);
        node1.addLeftChild(node3);
        node2.addRightChild(node4);
        node2.addLeftChild(node5);
        node3.addLeftChild(node6);
        node3.addRightChild(node7);
        node6.addLeftChild(node8);
        node6.addRightChild(node9);
        node7.addLeftChild(node10);
        node7.addRightChild(node11);
        node8.addLeftChild(node12);
        node8.addRightChild(node13);
        node9.addLeftChild(node14);
        node9.addRightChild(node15);
        node10.addLeftChild(node16);
        node10.addRightChild(node17);
        node11.addLeftChild(node18);
        node12.addRightChild(node19);
        node13.addLeftChild(node20);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
        node7.setElement(7);
        node8.setElement(8);
        node9.setElement(9);
        node10.setElement(10);
        node11.setElement(11);
        node12.setElement(12);
        node13.setElement(13);
        node14.setElement(14);
        node15.setElement(15);
        node16.setElement(16);
        node17.setElement(17);
        node18.setElement(18);
        node19.setElement(19);
        node20.setElement(20);
    }

    private void setUpTree31NodesBalanced() {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();
        BinaryTreeNode node7 = new BinaryTreeNode();
        BinaryTreeNode node8 = new BinaryTreeNode();
        BinaryTreeNode node9 = new BinaryTreeNode();
        BinaryTreeNode node10 = new BinaryTreeNode();
        BinaryTreeNode node11 = new BinaryTreeNode();
        BinaryTreeNode node12 = new BinaryTreeNode();
        BinaryTreeNode node13 = new BinaryTreeNode();
        BinaryTreeNode node14 = new BinaryTreeNode();
        BinaryTreeNode node15 = new BinaryTreeNode();
        BinaryTreeNode node16 = new BinaryTreeNode();
        BinaryTreeNode node17 = new BinaryTreeNode();
        BinaryTreeNode node18 = new BinaryTreeNode();
        BinaryTreeNode node19 = new BinaryTreeNode();
        BinaryTreeNode node20 = new BinaryTreeNode();
        BinaryTreeNode node21 = new BinaryTreeNode();
        BinaryTreeNode node22 = new BinaryTreeNode();
        BinaryTreeNode node23 = new BinaryTreeNode();
        BinaryTreeNode node24 = new BinaryTreeNode();
        BinaryTreeNode node25 = new BinaryTreeNode();
        BinaryTreeNode node26 = new BinaryTreeNode();
        BinaryTreeNode node27 = new BinaryTreeNode();
        BinaryTreeNode node28 = new BinaryTreeNode();
        BinaryTreeNode node29 = new BinaryTreeNode();
        BinaryTreeNode node30 = new BinaryTreeNode();
        BinaryTreeNode node31 = new BinaryTreeNode();


        tree.setRoot(node1);

        node1.addRightChild(node2);
        node1.addLeftChild(node3);
        node2.addRightChild(node4);
        node2.addLeftChild(node5);
        node3.addLeftChild(node6);
        node3.addRightChild(node7);
        node4.addLeftChild(node8);
        node4.addRightChild(node9);
        node5.addLeftChild(node10);
        node5.addRightChild(node11);
        node6.addLeftChild(node12);
        node6.addRightChild(node13);
        node7.addLeftChild(node14);
        node7.addRightChild(node15);
        node8.addLeftChild(node16);
        node8.addRightChild(node17);
        node9.addLeftChild(node18);
        node9.addRightChild(node19);
        node10.addLeftChild(node20);

        node10.addRightChild(node21);
        node11.addLeftChild(node22);
        node11.addRightChild(node23);
        node12.addLeftChild(node24);
        node12.addRightChild(node25);
        node13.addLeftChild(node26);
        node13.addRightChild(node27);
        node14.addLeftChild(node28);
        node14.addRightChild(node29);
        node15.addLeftChild(node30);
        node15.addRightChild(node31);

        node1.setElement(1);
        node2.setElement(2);
        node3.setElement(3);
        node4.setElement(4);
        node5.setElement(5);
        node6.setElement(6);
        node7.setElement(7);
        node8.setElement(8);
        node9.setElement(9);
        node10.setElement(10);
        node11.setElement(11);
        node12.setElement(12);
        node13.setElement(13);
        node14.setElement(14);
        node15.setElement(15);
        node16.setElement(16);
        node17.setElement(17);
        node18.setElement(18);
        node19.setElement(19);
        node20.setElement(20);
        node21.setElement(21);
        node22.setElement(22);
        node23.setElement(23);
        node24.setElement(24);
        node25.setElement(25);
        node26.setElement(26);
        node27.setElement(27);
        node28.setElement(28);
        node29.setElement(29);
        node30.setElement(30);
        node31.setElement(31);
    }

}
