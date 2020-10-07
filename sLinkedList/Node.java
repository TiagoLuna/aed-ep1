package ep1.sLinkedList;

/**Fonte: aulas de AED 1 - EACH USP - Professor Marcio Moretto
 * Link: https://github.com/marciomr/AED1/blob/master/Capitulo%203.2/Node.java
 * Obs.: sem alterações na estrutura
 */

public class Node {
    private String element;
    private Node next;
  
    public Node(String s, Node n){
      element = s;
      next = n;
    }
  
    public String getElement(){ return element; }
    public Node getNext(){ return next; }
    public void setElement(String newElement){ element = newElement; }
    public void setNext(Node newNext){ next = newNext; }
  }
