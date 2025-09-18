import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);

        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeLast());
        System.out.println(myLinkedList.removeLast());

        myLinkedList.prepend(5);
        myLinkedList.prepend(6);
        myLinkedList.append(2);
        myLinkedList.printList();

        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        myLinkedList.printList();

    }
}
