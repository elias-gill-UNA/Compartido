/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/*
    Grupo g10
    Leguizamon Adorno, Esteban Manuel   CI: 7.752.586    Seccion TQ
    Dueck Sawatzky, Julian Rafael       CI: 4.944.934    Seccion TQ

    Tarea 5-U4 - Ejercicio 1
*/





/******************************************************************************
 *  Compilation:  javac EJ1.java
 *  Execution:    java EJ1
 *  Dependencies: StdOut.java
 *
 *  B-tree.
 *
 *  Limitations
 *  -----------
 *   -  Assumes M is even and M >= 4
 *   -  should b be an array of children or list (it would help with
 *      casting to make it a list)
 *
 ******************************************************************************/
import java.lang.Exception;

public class BTree<Key extends Comparable<Key>, Value extends Comparable<Value>>  {
    // max children per B-tree node = M-1
    // (must be even and greater than 2)
    private static final int M = 4;

    private Node root;       // root of the B-tree
    private int height;      // height of the B-tree
    private int n;           // number of key-value pairs in the B-tree

    // helper B-tree node data type
    private static final class Node {
        private int m;                             // number of children
        private Entry[] children = new Entry[M];   // the array of children

        // create a node with k children
        private Node(int k) {
            m = k;
        }
    }

    // internal nodes: only use key and next
    // external nodes: only use key and value
    private static class Entry {
        private Comparable key;
        private Object val;
        private Node next;     // helper field to iterate over array entries
        //Por cada hijo hay un puntero. M=L=4 
        public Entry(Comparable key, Object val, Node next) {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }

    /**
     * Initializes an empty B-tree.
     */
    public BTree() {
        root = new Node(0);
    }
 
    /**
     * Returns true if this symbol table is empty.
     * @return {@code true} if this symbol table is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns the number of key-value pairs in this symbol table.
     * @return the number of key-value pairs in this symbol table
     */
    public int size() {
        return n;
    }

    /**
     * Returns the height of this B-tree (for debugging).
     *
     * @return the height of this B-tree
     */
    public int height() {
        return height;
    }























    /**
     * Returns the value associated with the given key.
     *
     * @param  key the key
     * @return the value associated with the given key if the key is in the symbol table
     *         and {@code null} if the key is not in the symbol table
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        return search(root, key, height);
    }

    private Value search(Node x, Key key, int ht) {
        Entry[] children = x.children;

        // external node
        if (ht == 0) {
            for (int j = 0; j < x.m; j++) {
                if (eq(key, children[j].key)) return (Value) children[j].val;
            }
        }

        // internal node
        else {
            for (int j = 0; j < x.m; j++) {
                if (j+1 == x.m || less(key, children[j+1].key))
                    return search(children[j].next, key, ht-1);
            }
        }
        return null;
    }




















    /*___________________________________________________
     |                                                   |
     |                METODOS DE                         |
     |                 INSERCION                         |
     |___________________________________________________|*/

    /**
     * Inserts the key-value pair into the symbol table, overwriting the old value
     * with the new value if the key is already in the symbol table.
     * If the value is {@code null}, this effectively deletes the key from the symbol table.
     *
     * @param  key the key
     * @param  val the value
     * @throws IllegalArgumentException if {@code key} is {@code null}
     */
    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("argument key to put() is null");
        Node u = insert(root, key, val, height); 
        n++;
        if (u == null) return;

        // need to split root
        Node t = new Node(2);
        t.children[0] = new Entry(root.children[0].key, null, root);
        t.children[1] = new Entry(u.children[0].key, null, u);
        root = t;
        height++;
    }







    private Node insert(Node h, Key key, Value val, int ht) {
        int j;
        Entry t = new Entry(key, val, null);

        // external node
        if (ht == 0) {// cuenta los elementos mayores
            for (j = 0; j < h.m; j++) {
                if (less(key, h.children[j].key)) break;
            }
        }

        // internal node
        else {
            for (j = 0; j < h.m; j++) {
                if ((j+1 == h.m) || less(key, h.children[j+1].key)) {
                    Node u = insert(h.children[j++].next, key, val, ht-1);
                    if (u == null) return null;
                    t.key = u.children[0].key;
                    t.val = null;                        /* QUE HACE ESTA ASIGNACION??? */
                    t.next = u;
                    break;
                }
            }
        }
        // desplaza todos los elementos mayores a la derecha para insertar el dato
        for (int i = h.m; i > j; i--)
            h.children[i] = h.children[i-1];
        h.children[j] = t;
        h.m++;
        if (h.m < M) // verifica si el nodo estÃ¡ lleno 
            return null;
        else
            return split(h);// parte a la mitad el nodo
    }

    // split node in half
    private Node split(Node h) {
        Node t = new Node(M/2);//creamos un nodo t
        h.m = M/2;
        for (int j = 0; j < M/2; j++)               //asignamos a t la mitad de los datos del nodo original
            t.children[j] = h.children[M/2+j]; 
        return t;    // retornamos t 
    }













    /*___________________________________________________
     |                                                   |
     |                       TO                          |
     |                       STRING                      |
     |___________________________________________________|*/
    

    /**
     * Returns a string representation of this B-tree (for debugging).
     *
     * @return a string representation of this B-tree.
     */
    public String toString() {
        return toString(root, height, "") + "\n";
    }

    private String toString(Node h, int ht, String indent) {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                s.append(indent + children[j].key + " " + children[j].val + "\n");
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0) s.append(indent + "(" + children[j].key + ")\n");
                s.append(toString(children[j].next, ht-1, indent + "     "));
            }
        }
        return s.toString();
    }


    // comparison functions - make Comparable instead of Key to avoid casts
    private boolean less(Comparable k1, Comparable k2) {
        if( k2!=null && k1!=null){
            return k1.compareTo(k2) < 0;
        }
        return false;
    }

    private boolean eq(Comparable k1, Comparable k2) {
        if( k2!=null && k1!=null){
            return k1.compareTo(k2) == 0;
        }
        return false;
    }











    /*___________________________________________________
     |                                                   |
     |                       RANGE                       |
     |                       PRINT                       |
     |___________________________________________________|*/

    public void rangePrint( Value value1, Value value2 )throws IllegalArgumentException{
        StringBuilder cad = new StringBuilder();
        if( !less(value1, value2 ) ){
            throw new IllegalArgumentException(" Value1 no es menor que Value2 ");
        }
        if(  !searchValue( value2 ) || !searchValue( value1 ) ){// si alguno no existe en el arbol
            throw new IllegalArgumentException(" Uno o ambos datos no existen en el arbol ");
        }  
        cad.append(value1 + " , "   );
        cad.append( printRange( root, this.height , value1 , value2 ) );
        System.out.print(value2 + " , "   );
        System.out.println(cad);
    }
    // recorremos como lo hace toString 
    private String printRange(Node h, int ht, Value value1, Value value2) {
        StringBuilder s = new StringBuilder();
        Entry[] children = h.children;

        if (ht == 0) {
            for (int j = 0; j < h.m; j++) {
                if( !less((Value)children[j].val, value1) && less( (Value)children[j].val, value2))    
                    s.append(" , " + children[j].val + " ");// agregamos si esta en el rango 
            }
        }
        else {
            for (int j = 0; j < h.m; j++) {
                if (j > 0){ //
                    if( !less((Value)children[j].val, value1) && less( (Value)children[j].val, value2)){
                        s.append( "  ," + children[j].val + " ");
                    }
                }
                s.append(printRange(children[j].next, ht-1, value1, value2));// buscamos en la rama izquierda 
                
            }
        }
        return s.toString();// retornamos lo que juntamos 
    }












    /*___________________________________________________
     |                                                   |
     |                      SEARCH                       |
     |                       VALUE                       |
     |___________________________________________________|*/



    public boolean searchValue(Object val){
        boolean[] encontrado = {false};
        searchValue2(this.root, (Value)val, this.height , encontrado);
        return encontrado[0];
    }
    private boolean searchValue2(Node x, Value val, int ht,boolean[] encontrado){
        int j;
        if( ht == 0 ){
            for( j=0; j<x.m; j++){
                if( x.children[j].val!=null && eq(val, (Value)x.children[j].val)){
                    encontrado[0] = true;
                }
            }
        }else{
            for( j=0; j<x.m; j++){
                if(  x.children[j].val != null ){
                    if( less(val, (Value)x.children[j].val)){
                        encontrado[0] = searchValue2(x.children[j].next , val, ht-1, encontrado);
                    }else if( eq(val, (Value)x.children[j].val) ){
                        encontrado[0] = true;
                    }
                }else{
                    encontrado[0] = searchValue2(x.children[j].next , val, ht-1, encontrado);
                }
                
            }
        }

        return encontrado[0];
    }



    /**
     * Unit tests the {@code EJ1} data type.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        BTree<Integer, String> st = new BTree<Integer, String>();

        st.put(1, "128.112.136.12");
        st.put(2, "128.112.136.11");
        st.put(3,    "128.112.128.15");
        st.put(4,         "130.132.143.21");
        st.put(5,     "209.052.165.60");
        st.put(6,        "17.112.152.32");
        st.put(7,       "207.171.182.16");
        st.put(8,         "66.135.192.87");
        st.put(9,          "64.236.16.20");
        st.put(10,       "216.239.41.99");
        st.put(11,      "199.239.136.200");
        st.put(12,    "207.126.99.140");
        st.put(13,         "143.166.224.230");
        st.put(14,     "66.35.250.151");
        st.put(15,         "199.181.135.201");
        st.put(16,      "63.111.66.11");
        st.put(17,        "216.109.118.65");
       


        System.out.println("cs.princeton.edu:  " + st.get(1));
        System.out.println("hardvardsucks.com: " + st.get(20));
        System.out.println("simpsons.com:      " + st.get(5));
        System.out.println("apple.com:         " + st.get(6));
        System.out.println("ebay.com:          " + st.get(8));
        System.out.println("dell.com:          " + st.get(13));
        System.out.println();

        System.out.println("size:    " + st.size());
        System.out.println("height:  " + st.height());
        System.out.println(st);
        System.out.println();
        System.out.println("De 128.112.128.15 a 216.239.41.99");
        try{
            st.rangePrint("128.112.128.15", "216.239.41.99");
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
       // System.out.print("  Search Value root ");
       // System.out.print( st.searchValue( "128.112.136.12" ));
        System.out.println();
    }

}

/******************************************************************************
 *  Copyright 2002-2020, Robert Sedgewick and Kevin Wayne.
 *
 *  This file is part of algs4.jar, which accompanies the textbook
 *
 *      Algorithms, 4th edition by Robert Sedgewick and Kevin Wayne,
 *      Addison-Wesley Professional, 2011, ISBN 0-321-57351-X.
 *      http://algs4.cs.princeton.edu
 *
 *
 *  algs4.jar is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  algs4.jar is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with algs4.jar.  If not, see http://www.gnu.org/licenses.
 ******************************************************************************/
