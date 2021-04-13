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
public class Node {

    // creating variables
    private String name;
    private int frequency;
    private Node left, right;

    // creating constructor that takes a name
    public Node(String name) {
        this.name = name;
        this.frequency = 1;
    }

    // incrementing the frequency
    public void incrementFrequency() {
        frequency++;
    }

    // gets the frequency by returning the frequency
    public int getFrequency() {
        return frequency;
    }

    // gets the name by returning name 
    public String getName() {
        return name;
    }

    // gets the left Node
    public Node getLeft() {
        return left;
    }

    // gets the right node
    public Node getRight() {
        return right;
    }

    // sets the name
    public void setName(String name) {
        this.name = name;
    }

    // sets the left node
    public void setLeft(Node left) {
        this.left = left;
    }

    // sets the right node
    public void setRight(Node right) {
        this.right = right;
    }

    // sets the frequency
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

}
