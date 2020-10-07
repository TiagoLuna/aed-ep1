package ep1.sLinkedList;

/**Fonte: aulas de AED 1 - EACH USP - Professor Marcio Moretto
 * Link: https://github.com/marciomr/AED1/blob/master/Capitulo%203.2/SLinkedList.java
 * Obs.: com alterações apenas no método toString()
 */

public class ListaSimplesmenteLigada {
  protected Node head, tail;
  protected long size;

  public ListaSimplesmenteLigada(){
    head = tail = null;
    size = 0;
  }

  public long size(){ return size; }

  public boolean isEmpty(){ return(size == 0); }

  public void addFirst(Node n){
    n.setNext(head);
    head = n;
    if(isEmpty()){ tail = n; }
    size++;
  }

  public void addLast(Node n){
    n.setNext(null);
    tail.setNext(n);
    tail = n;
    if(isEmpty()){ head = n; }
    size++;
  }

  public Node removeFirst() throws IllegalStateException{
    if(isEmpty()){ throw new IllegalStateException("Lista vazia"); }
    Node tmp = head;
    head = head.getNext();
    tmp.setNext(null);
    size--;
    if(isEmpty()){ tail = null; }

    return tmp;
  }

  public String toString(){
    String s = "";
    for(Node n = head; n != null; n = n.getNext()){
      s += n.getElement();
      if(n != tail){ s += "\n"; }
    }
    return s + "";
  }
}