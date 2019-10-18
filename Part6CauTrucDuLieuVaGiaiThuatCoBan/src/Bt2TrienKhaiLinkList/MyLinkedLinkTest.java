package Bt2TrienKhaiLinkList;

public class MyLinkedLinkTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> listInteger = new MyLinkedList<Integer>();
        listInteger.addFirst(1);
        listInteger.addFirst(2);
        listInteger.addFirst(3);
        listInteger.addFirst(3);
        listInteger.addFirst(4);

        System.out.println("element first: "+listInteger.getFirst());
        System.out.println("element last: "+listInteger.getLast());

        for (int i=0; i<listInteger.size(); i++){
            System.out.print(listInteger.get(i) + "  ");
        }
        listInteger.add(4, 12);
        listInteger.add(5, 12);
        System.out.println();
        for (int i=0; i<listInteger.size(); i++){
            System.out.print(listInteger.get(i) + "  ");
        }
        System.out.println();
        listInteger.remove(4);
        for (int i=0; i<listInteger.size(); i++){
            System.out.print(listInteger.get(i) + "  ");
        }
        System.out.println();
        Object rm = (Integer) 12;
        listInteger.remove(rm);
        for (int i=0; i<listInteger.size(); i++){
            System.out.print(listInteger.get(i) + "  ");
        }
        listInteger.clear();
        System.out.println();
        for (int i=0; i<listInteger.size(); i++){
            System.out.print(listInteger.get(i) + "  ");
        }
    }
}
