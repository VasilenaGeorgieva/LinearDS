import implementations.ArrayList;
import interfaces.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("one");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("five");

        list.add(2, "almost two");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            strings.add(String.valueOf(i));
        }

        System.out.println(strings.remove(strings.size()));
    }
}
