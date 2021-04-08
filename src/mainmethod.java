import java.util.ArrayList;

public class mainmethod {
    public static void main(String[] args) {
        BinaryTree_ADT tree = new BinaryTree_ADT();
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


        System.out.println(tree.contains(node1, 7));
        //System.out.println(tree.contains(node1, 7));


        BinaryTreePrint print = new BinaryTreePrint();

        print.printTree(node1);
        System.out.println("\n");

        ArrayList<Integer> integers = tree.levelOrder();
        System.out.println(tree.height() + "height");


        for (int i = 0; i < integers.size(); i++)
        {
            System.out.println(integers.get(i));
        }

        /*
        System.out.println("\n");

        ArrayList<Integer> integers2 = tree.inOrder(tree.getRoot());

        for (int i = 0; i < integers2.size(); i++)
        {
            System.out.println(integers2.get(i));
        }

         */
    }



}
