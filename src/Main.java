import com.guhpires.datastructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);

        list.print();

        list.remove();
        list.remove();

        list.print();

        System.out.println(list.getHead().next().peek());
    }
}
