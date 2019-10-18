package Bt2TrienKhaiLinkList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public void add(int index, E element){
        if ((index>=0) && (index<=numNodes)){
            int count = 0;
            Node get = head;
            while (count < index){
                count++;
                get = get.getNext();
            }
            Node newNode = new Node(element);
            newNode.setNext(get.getNext());
            get.setNext(newNode);
            ensureCapacity(1);
        }
    }

    public void addFirst(E element){
        Node newNode = new Node(element);
        newNode.setNext(this.head);
        this.head = newNode;
        ensureCapacity(1);
    }
    public void addLast(E element){
        Node newNode = new Node(element);
        Node get = this.head;
        while (get.getNext()!= null){
            get = get.getNext();
        }
        get.setNext(newNode);
        ensureCapacity(1);
    }
    public E remove(int index){
        if ((index>=0) && (index<numNodes)){
            int count = 0;
            Node get = this.head;
            while (count<index){
                count ++;
                get = get.getNext();
            }
            Node nodeRemove = get.getNext();
            get.setNext(nodeRemove.getNext());
            ensureCapacity(-1);
            return (E)nodeRemove.getData();
        }
        return null;
    }
    public boolean remove(Object e){
        Node get = this.head;
        while ((get.getNext()!= null) && (get.getNext().getData().equals(e))){
            get = get.getNext();
        }
        if (get.getNext()!=null){
            get.setNext(get.getNext().getNext());
            ensureCapacity(-1);
            return true;
        }
        return false;
    }
    public int size(){
        return this.numNodes;
    }
    //public E clone()

    public boolean contains(E o){
        return indexOf(o)!=-1;
    }
    public int indexOf(E o){
        Node get = this.head;
        int count = 0;
        while (get!=null){
            if (get.getData().equals(o))
                return count;
            get = get.getNext();
            count++;
        }
        return -1;
    }

    private void ensureCapacity(int minCapacity){
        this.numNodes += minCapacity;
    }

    public E get(int i){
        if ((i>=0) && (i<this.numNodes)){
            Node get = this.head;
            int count = 0;
            while (get!=null){
                if (count == i){
                    return (E)get.getData();
                }
                count++;
                get = get.getNext();
            }
        }
        return null;
    }
    public E getFirst(){
        return (E)this.head.getData();
    }
    public E getLast(){
        Node get = this.head;
        int count = 0;
        while (get.getNext()!=null){
            get = get.getNext();
        }
        return (E)get.getData();
    }
    public void clear(){
        this.head.setNext(null);
        this.numNodes = 0;
    }
}
