package usingPrototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /* Создать класс Address со свойствами String city, String street, int house. Создать
         * класс User, добавить в него свойсва String name, String lastName, double age,
         * Address address; реализовать в классе User методы swallowCopy, deepCopy через
         * конструкторы и интерфейс Cloneable. */


        System.out.println(" * * * DEEP COPY * * *\n");
        Address address = new Address("Dnipro", "Kirova", 46);
        User ivan = new User("Ivan", "Sidorov", 22, address);
        User ivanSwallowCopy = ivan.swallowCopy();
        User ivanDeepCopy = ivan.deepCopy();

        ivan.getAddress().setCity("Donetsk");
        ivanSwallowCopy.getAddress().setStreet("Karla Marksa");
        showUsers(ivan, ivanSwallowCopy, ivanDeepCopy);

    }

    private static void showUsers(User... users) {

        for (User user : users) {
            System.out.println(user + "\n");
        }
    }
}
