package org.example._2023_12_06;

public class NodeN {
    NodeN next;
    int value;

    public NodeN(int value) {
        this.value = value;
    }

    public boolean isLoop(NodeN root) {
        int slow;
        int fast;

        return false;
    }

    public static void main(String[] args) {
        NodeN n1 = new NodeN(1);
        NodeN n2 = new NodeN(2);
        NodeN n3 = new NodeN(3);
        NodeN n4 = new NodeN(4);
        NodeN n5 = new NodeN(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n2;
    }
}
