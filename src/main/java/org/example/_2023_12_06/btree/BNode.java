package org.example._2023_12_06.btree;

public class BNode {
    public BNode left;   // left child
    public BNode right;  // right child
    public Integer value;  // value

    //  9  2  5  13  6  10  14  7  33  2  3  //
    public static void main(String[] args) {
        Integer[] digit = {9, 2, 5, 13, 6, 10, 14, 7, 33, 44, 3};
        BNode BNode = new BNode();
        createNode(BNode, 9);
        for (int i = 1; i < digit.length; i++) {
            insert(BNode, digit[i]);
        }
        inOrderTraversal(BNode);
        remove(BNode, 10);
        System.out.println();
        inOrderTraversal(BNode);
    }

    private static boolean isNodeExist(BNode bNode) {
        return bNode != null && bNode.value != null;
    }

    private static void createNode(BNode bNode, int value) {
        bNode.left = new BNode();
        bNode.right = new BNode();
        bNode.value = value;
    }

    private static void insert(BNode BNode, int value) {
        if (!isNodeExist(BNode)) {
            createNode(BNode, value);
        } else if (value < BNode.value) {
            insert(BNode.left, value);
        } else {
            insert(BNode.right, value);
        }
    }

    private static BNode search(BNode BNode, int value) {
        if (!isNodeExist(BNode)) {
            return null;
        }
        if (BNode.value == value) {
            return BNode;
        }
        if (value < BNode.value) {
            return search(BNode.left, value);
        }
        return search(BNode.right, value);
    }

    private static BNode getMin(BNode node) {
        if (!isNodeExist(node)) {
            return null;
        }
        if (!isNodeExist(node.left)) {
            return node;
        }
        return getMin(node.left);
    }

    private static BNode getMax(BNode node) {
        if (!isNodeExist(node)) {
            return null;
        }
        if (!isNodeExist(node.right)) {
            return node;
        }
        return getMax(node.right);
    }

    //to sorting
    private static void inOrderTraversal(BNode BNode) {
        if (!isNodeExist(BNode)) {
            return;
        }
        inOrderTraversal(BNode.left);
        System.out.print("[ " + BNode.value + " ]");
        inOrderTraversal(BNode.right);
    }

    //to delete
    private static void postOrderTraversal(BNode BNode) {
        if (!isNodeExist(BNode)) {
            return;
        }
        postOrderTraversal(BNode.left);
        postOrderTraversal(BNode.right);
        System.out.print(BNode.value);
    }

    //to copy a tree
    private static void directOrderTraversal(BNode BNode) {
        if (!isNodeExist(BNode)) {
            return;
        }
        System.out.print(BNode.value);
        directOrderTraversal(BNode.left);
        directOrderTraversal(BNode.right);
    }

    private static void moveNode(BNode toBNode, BNode fromBNode) {
        toBNode.value = fromBNode.value;
        toBNode.left = fromBNode.left;
        toBNode.right = fromBNode.right;
    }

    private static int getChildrenCount(BNode BNode) {
        int count = 0;
        if (isNodeExist(BNode.left)) {
            count += 1;
        }
        if (isNodeExist(BNode.right)) {
            count += 1;
        }
        return count;
    }

    private static BNode getChildOrNull(BNode BNode) {
        return isNodeExist(BNode.left) ? BNode.left : BNode.right;
    }

    private static void removeNodeWithOneOrZeroChild(BNode BNodeToDelete) {
        BNode childOrNull = getChildOrNull(BNodeToDelete);
        moveNode(BNodeToDelete, childOrNull);
    }

    private static boolean remove(BNode root, int value) {
        BNode BNodeToDelete = search(root, value);
        if (!isNodeExist(BNodeToDelete)) {
            return false;
        }
        int childrenCount = getChildrenCount(BNodeToDelete);
        if (childrenCount < 2) {
            removeNodeWithOneOrZeroChild(BNodeToDelete);
        } else {
            BNode minBNode = getMin(BNodeToDelete.right);
            BNodeToDelete.value = minBNode.value;
            removeNodeWithOneOrZeroChild(minBNode);
        }
        return true;
    }
}