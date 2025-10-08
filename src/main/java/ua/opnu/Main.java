package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // --- Тестування TimeSpan ---
        TimeSpan t1 = new TimeSpan();
        TimeSpan t2 = new TimeSpan(90);
        TimeSpan t3 = new TimeSpan(1, 45);
        TimeSpan t4 = new TimeSpan(t3);

        t1.add(1, 30);
        t2.add(15);
        t3.add(t2);

        t4.subtract(1, 15);
        t4.subtract(30);
        t4.subtract(t1);

        System.out.println("Результати:");
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t3 = " + t3);
        System.out.println("t4 = " + t4);

        Person[] people = {
                new Person("Іванов", "Роман", 29),
                new Student("Петренко", "Артеми", 18, "АІ-23", "101749"),
                new Student("Сидоренко", "Кіра", 21, "АТ-23", "748165"),
                new Lecturer("Коваленко", "Ольга", 41, "Матамитики", 28000.0)
        };

        System.out.println("\nІнформація про людей:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}