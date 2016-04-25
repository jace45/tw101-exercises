package com.thoughtworks.tw101.exercises.exercise9;

import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private Node next;
    private static List<String> listOfNames = new LinkedList<>();

    public Node(String name) {

        this.name = name;
        this.next = null;
    }

    public void add(String nameOfNewNode) {
        if (next == null)
            ifNextIsNull(nameOfNewNode);
        else
            ifNextIsNotNull(nameOfNewNode);
    }

    public void ifNextIsNotNull(String nameOfNewNode){
        if (name.compareTo(nameOfNewNode) >= 0) {
            Node nextNode = new Node(name);
            nextNode.next = next;
            name = nameOfNewNode;
            next = nextNode;
        } else
            next.add(nameOfNewNode);
    }

    public void ifNextIsNull(String nameOfNewNode){
        if (name.compareTo(nameOfNewNode) <= 0)
            next = new Node(nameOfNewNode);
         else {
            Node nextNode = new Node(name);
            name = nameOfNewNode;
            next = nextNode;
        }
    }

    public List<String> names() {
        if (next == null){
            listOfNames.add(name);
            return listOfNames;
        } else {
            listOfNames.add(name);
            next.names();
        }
        return listOfNames;
    }
}
