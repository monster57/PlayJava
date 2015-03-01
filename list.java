import java.util.*;

class CollectionDemo{
  public static void main(String[] args) {
    List arr  = new ArrayList();
    arr.add("a");
    arr.add("b");
    arr.add("c");
    arr.add("d");
    System.out.println("ArrayList element");
    System.out.print("\t"+arr);


    List link  = new LinkedList();
    link.add(1);
    link.add(2);
    link.add(3);
    link.add(4);
    System.out.println();
    System.out.println("linklist  element");
    System.out.print("\t"+link);
  }
}
