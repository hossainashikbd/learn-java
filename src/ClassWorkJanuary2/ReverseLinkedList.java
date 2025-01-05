package ClassWorkJanuary2;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Original List: " + list);

        System.out.print("Reverse order: ");
        ListIterator<String> iterator = list.listIterator(list.size());

        StringBuilder reversedList = new StringBuilder();
        while (iterator.hasPrevious()) {
            reversedList.append(iterator.previous()).append(", ");
        }
        System.out.println(reversedList.toString());
    }
}
