public class LinkedList<E>{
    private int size;
    Node<E> head;

    private class Node<T>{
        T con;
        Node<T> next;

        public Node(T val, Node<T> link){
            con = val;
            next = link;
        }

        public Node(T val){
            this(val, null);
        }
    }

    public void add(E val){
        checkValNull(val);
        
        if(size == 0){
            //adding head
            head = new Node<E>(val);
        }
        else{
            //adding other
            Node<E> temp = head;
            while(temp.next != null){
                //until last node
                temp = temp.next;
            }
            temp.next = new Node<E>(val);
        }
        size++;
    }

    private void checkValNull(E val){
        if(val == null){
            throw new IllegalArgumentException("Can't store null!");
        }
    }
}