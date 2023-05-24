package org.app;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50, 1.5);
        tree.insert(25, 1.2);
        tree.insert(75, 1.7);
        tree.insert(12, 1.5);
        tree.insert(37, 1.2);
        tree.insert(43, 1.7);
        tree.insert(30, 1.5);
        tree.insert(33, 1.2);
        tree.insert(87, 1.7);
        tree.insert(93, 1.5);
        tree.insert(97, 1.5);

        // Se imprime la cantidad de nodos en el árbol
        System.out.println(tree.getNodesQty());

        // En primera instancia, se imprime el árbol original.
        tree.displayTree();

        // Se imprime un subárbol de un nodo existente.
        tree.displayTree(tree.find(25));

        // Otro de un nodo igualmente existente.
        tree.displayTree(tree.find(30));

        // Y por último, uno de un nodo que no existe.
        tree.displayTree(tree.find(333));

        // Imprime las hojas del árbol
        tree.printLeafs();

        // Imprime la cantidad de niveles del árbol
        tree.printLevels();

        // Se crea un arbol sin hojas, para evidenciar qué pasa en ese caso.
        Tree leafless = new Tree();

        // Se prueba getNodesQty
        System.out.println(leafless.getNodesQty());

        // Se prueba el printLeafs.
        leafless.printLeafs();

        // Y el printLevels();
        leafless.printLevels();

    }
}