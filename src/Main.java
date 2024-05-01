public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        String phone = "7-в968-415-75-37";
//        if (phone.length()==10) {
//            phone='7'+phone;
//        } else if (phone.length() > 11) {
//            throw new RuntimeException("Телефон слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Среди нас посторонний!");
//        }
//        System.out.println("phone = " + phone);

        System.out.println("Задача №1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.print("Ф. И. О. сотрудника — " + fullName);

        System.out.println();

        System.out.println("Задача №2");
        String upperCase = fullName.toUpperCase();
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета — " + upperCase);

        System.out.println();

        System.out.println("Задача №3");
        fullName = "Иванов Семён Семёнович";
        String newFullName = fullName.replace('ё', 'е');
        System.out.print("Данные Ф. И. О. сотрудника — " + newFullName);
    }
}
