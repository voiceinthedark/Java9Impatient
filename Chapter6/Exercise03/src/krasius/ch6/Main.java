package krasius.ch6;

public class Main {
    public static void main(String[] args) {
        Table<Integer, String> table = new Table<>();

        table.setValue(1, "bro");
        table.setValue(2, "fro");
        table.setValue(3, "gg");
        table.setValue(2, "mro");

        System.out.println(table.getValue(2));

        table.removeKey(3);
        System.out.println(table.getValue(3));

    }
}
