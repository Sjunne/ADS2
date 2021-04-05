import java.util.ArrayList;

public class mainmethod {
    public static void main(String[] args) {
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();

        BinaryTree_ADT tree = new BinaryTree_ADT();

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


        System.out.println(tree.contains(node1, 7));
        //System.out.println(tree.contains(node1, 7));


        BinaryTreePrint print = new BinaryTreePrint();

        print.printTree(node1);
        System.out.println("\n");

        ArrayList<Integer> integers = tree.postOrder2();


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
