package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private Node left, right;
    private static List<String> listOfNames = new LinkedList<>();

    public Node(String name) {

        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        if (name.compareTo(nameOfNewNode) >= 0){
            if (left == null)
                left = new Node(nameOfNewNode);
            else
                left.add(nameOfNewNode);
        } else {
            if (right == null)
                right = new Node(nameOfNewNode);
            else
                right.add(nameOfNewNode);
        }
    }

    public List<String> names() {
        if (left == null){
            listOfNames.add(name);
            if (right != null)
                right.names();
        } else {
            try {
                left.names();
                listOfNames.add(name);
                right.names();
            } catch (NullPointerException e){
                return listOfNames;
            }
        }
        return listOfNames;
    }
}
