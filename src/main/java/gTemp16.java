import java.util.ArrayList;

public class gTemp16 {
    public static void main(String[] args) {

        // Создать объект ArrayList (Список).
        // Чтобы содержать имена пользователей.
        ArrayList userNames = new ArrayList();

        // Добавить String в список.
        userNames.add("tom");
        userNames.add("jerry");

        // Вы случайно добавляете элемент не String вида в список.
        // (Это вполне позволено).
        userNames.add(new Integer(100));

        // И получить первый элемент
        // Он является Object (Но вы знаете, что он является String)
        // ==> tom
        Object obj1 = userNames.get(0);

        // Сделать cast в String.
        String userName1 = (String) obj1;

        System.out.println("userName1 = " + userName1);

        // Получить элемент 2.
        // (Вы знаете, что он является String)
        // ==> jerry
        String userName2 = (String) userNames.get(1);

        System.out.println("userName2 = " + userName2);

        // Получить 3-ий элемент и сделать cast чтобы он стал String.
        // (На самом деле он является Integer).
        // (Ошибка cast происходит здесь).
        String userName3 = (String) userNames.get(2);

        System.out.println("userName3 = " + userName3);
    }
}