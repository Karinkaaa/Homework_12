package usingObserver;

public class Main {
    public static void main(String[] args) {

        /* Реализовать демо-пример использования паттерна Observer на примере классов:
         * - MailType;
         * - MailListener - "слушатель" события по определенному MailType;
         * - MailPublisher - может добавлять-удалять слушателей, нотифицировать определенных
         * слушателей по определенному MailType. */

        MailPublisher publisher = new MailPublisher();

        MailListener vasya = new MailListener("Vasya");
        MailListener dasha = new MailListener("Dasha");
        MailListener anna = new MailListener("Anna");

        MailType weather = new MailType("weather");
        MailType viber = new MailType("Viber");
        MailType sales = new MailType("sales");

        publisher.addListener(weather, vasya);
        publisher.addListener(weather, anna);
        publisher.addListener(viber, dasha);
        publisher.addListener(sales, dasha);
        publisher.addListener(sales, anna);

        publisher.notifyMail(weather, "+23 °С");
        publisher.notifyMail(viber, "Hello, how are you?");
        publisher.notifyMail(sales, "Today sales are 50%");

        publisher.removeListener(sales, anna);
        System.out.println("-------------------------\n");
        publisher.notifyMail(sales, "25%");
    }
}
