package Bt1TrienKhaiArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(12);
        myList.add(44);
        myList.add(16);
        myList.add(51);
        myList.add(22);
        myList.add(33);
        System.out.println(myList.toString());
        myList.add(5,42);
        myList.add(5,3);
        System.out.println("My list [5] = " + myList.get(5));
        myList.add(5,11);
        System.out.println("My list [5] = " + myList.get(5));
        myList.add(5,56);
        System.out.println(myList.toString());
        int check = 12;
        String alert = check + (myList.contains(check)? " is": " isn't") + " contains in list";
        System.out.println(alert);
        myList.clear();
        System.out.println(myList.toString());
        alert = check + (myList.contains(check)? " is": " isn't") + " contains in list";
        System.out.println(alert);
    }
}
