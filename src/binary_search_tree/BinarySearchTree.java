/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Alexander Tekleab
 */
public class BinarySearchTree {

    private Node root;

    // creating constructor
    public BinarySearchTree() {

    }

    /**
     * this method inserts string name
     *
     * @param name takes a string parameter name to insert
     */
    public void insert(String name) {
        if (root == null) {
            root = new Node(name);
        } else {
            Node n = root;
            while (n != null) {
                if (n.getName().equals(name)) {
                    n.incrementFrequency();
                    break;
                } else if (n.getName().compareTo(name) > 0) {
                    // if the there no left child, add new name
                    if (n.getLeft() == null) {
                        n.setLeft(new Node(name));
                        break;
                    } else {
                        n = n.getLeft();
                    }
                } else {
                    // if there is no right child, add new name
                    if (n.getRight() == null) {
                        n.setRight(new Node(name));
                        break;
                    } else {
                        n = n.getRight();
                    }
                }

            }
        }

    }

    /**
     * This method searches for string name
     *
     * @param name uses the parameter name to search
     */
    public void search(String name) {
        System.out.println("\n Searching... " + "〈" + name + "〉");

        Node n = root;
        while (n != null) {
            if (n.getName().equals(name)) {
                break;
            } else if (n.getName().compareTo(name) > 0) {
                n = n.getLeft();
            } else {
                n = n.getRight();
            }
        }

        if (n == null) {
            System.out.println("Error! " + name + " not found!\n");
        } else {
            System.out.println("Found " + name + ", number of times = 《" + n.getFrequency() + "》\n");
        }

    }

    /**
     * gets the inorder
     *
     * @param n takes a parameter node for inorder
     */
    private void inorder(Node n) {
        if (n == null) {
            return;
        }

        inorder(n.getLeft());
        System.out.println(n.getName() + "《" + n.getFrequency() + "》");
        inorder(n.getRight());
    }

    /**
     * This methods prints the Inorder
     */
    public void printInOrder() {
        System.out.println("\n**********************************************"
                + "\n             *Inorder Traversal*"
                + "\n**********************************************\n");
        inorder(root);
    }

    /**
     * gets the preorders
     *
     * @param n takes a parameter node for preorder
     */
    private void preorder(Node n) {
        if (n == null) {
            return;
        }
        System.out.println(n.getName() + "《" + n.getFrequency() + "》");
        preorder(n.getLeft());
        preorder(n.getRight());
    }

    /**
     * This methods prints the preorder
     */
    public void printPreOrder() {
        System.out.println("\n**********************************************"
                + "\n             *Preorder Traversal*"
                + "\n**********************************************\n");
        preorder(root);
    }

    /**
     * gets the post orders
     *
     * @param n takes a parameter node for postorder
     */
    private void postorder(Node n) {
        if (n == null) {
            return;
        }

        postorder(n.getLeft());
        postorder(n.getRight());
        System.out.println(n.getName() + "《" + n.getFrequency() + "》");
    }

    /**
     * This method prints the post order
     */
    public void printPostOrder() {
        System.out.println("\n**********************************************"
                + "\n             *Postorder Traversal*"
                + "\n**********************************************\n");
        postorder(root);
    }
}
