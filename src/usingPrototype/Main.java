package usingPrototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /* Создать класс Address со свойствами String city, String street, int house. Создать
         * класс User, добавить в него свойсва String name, String lastName, double age,
         * Address address; реализовать в классе User методы swallowCopy, deepCopy через
         * конструкторы и интерфейс Cloneable. */


        System.out.println(" * * * DEEP COPY * * *\n");
        Address address = new Address("Dnipro", "Kirova", 46);
        User user_d1 = new User("Ivan", "Sidorov", 22, address);
        User user_d2 = user_d1.swallowCopy();

        user_d1.setAddress(new Address("Donetsk", "Bagrationa", 19));
        showUsers(user_d1, user_d2);


        System.out.println("\n\n * * * SWALLOW COPY * * *");
        User user_sw1 = new User("Ivan", "Sidorov", 22, address);
        User user_sw2 = user_sw1.deepCopy();

        user_sw1.setAge(11);
        user_sw1.setAddress(new Address("Donetsk", "Bagrationa", 19));
        showUsers(user_sw1, user_sw2);


    }

    private static void showUsers(User user1, User user2) {

        System.out.println("\nUSER 1:\n" + user1);
        System.out.println("\nUSER 2:\n" + user2);
    }
}
