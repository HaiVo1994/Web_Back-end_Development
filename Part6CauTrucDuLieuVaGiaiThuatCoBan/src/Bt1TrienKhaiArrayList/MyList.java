package Bt1TrienKhaiArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        this.size = size;
        elements = new Object[size];
    }

    private boolean checkIndex(int index) {
        return ((index >= 0) && (index <= this.size));
    }

    public void add(int index, E element) {
        if (this.checkIndex(index)) {
            if (this.size == this.elements.length) {
                ensureCapacity(1);
            }
            for (int i = this.size; i > index; i--) {
                this.elements[i] = this.elements[i - 1];
            }
            elements[index] = element;
            this.size++;
        }

    }

    public E remove(int index) {
        E result = null;
        if (this.checkIndex(index)) {
            result = (E) this.elements[index];
            for (int i = index; i < this.size; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.size--;
            this.elements[this.size] = null;
        }
        return result;
    }

    public int size(){
        return this.size;
    }

    public E clone() throws CloneNotSupportedException{
        return (E)super.clone();
    }

    public boolean contains(E o){
        return (indexOf(o)>=0);
    }

    public int indexOf(E o){
        for (int i=0; i<this.size; i++){
            if (o.equals(elements[i]))
                return i;
        }
        return -1;
    }

    public boolean add(E e){
        if (this.size == this.elements.length) {
            elements = Arrays.copyOf(elements, this.size + 1);
        }
        elements[this.size] = e;
        this.size ++;
        return true;
    }
    public E get(int i){
        if ((i>=0) && (i<this.size)){
            return (E)this.elements[i];
        }
        return null;
    }
    public void ensureCapacity(int minCapacity){
        elements = Arrays.copyOf(elements, this.size + minCapacity);
    }
    public void clear(){
        elements = null;
        size = 0;
    }
    public String toString(){
        String result = "My list size = " + this.size + "\n";
        for (int i=0; i<this.size; i++){
            result += this.elements[i] + "  ";
        }
        return result;
    }
}
