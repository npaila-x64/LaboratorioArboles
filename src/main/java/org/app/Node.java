package org.app;

class Node
{
    public int iData;              // data item (key)
    public double dData;           // data item
    public Node leftChild;         // this node's left child
    public Node rightChild;        // this node's right child

    public void displayNode(){
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }

    // Booleano que indica si el nodo es hoja o no
    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

}  // end class Node