import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        //Задание3
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ", "; "));

        //Задание 4
        String fullNameCyrillic = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullNameCyrillic.replace("ё", "е"));

        ///Задание 5 (не учитывается при решении домашних заданий)
        String[] split = fullName.split(" ");
        System.out.println("Имя сотрудника - " + split[1] + "\nФамилия сторудника - " + split[0] +
                "\nОтчество сотрудника - " + split[2]);

        //Задание 5 (с подстрокой)
        System.out.println();
        System.out.println("Имя сотрудника - " + fullName.substring(fullName.indexOf(" "), fullName.lastIndexOf(" ")) +
                "\nФамилия сторудника - " + fullName.substring(fullName.lastIndexOf(" ")) +
                "\nОтчество сотрудника - " + fullName.substring(fullName.lastIndexOf(" ")));

        //Задание 6
        fullName = "ivanov ivan ivanovich";
        String[] splitFullName = fullName.split(" ");
        for (int i = 0; i < splitFullName.length; i++) {
            char[] charArray = splitFullName[i].toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            splitFullName[i] = new String (charArray);
        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + String.join(" ", splitFullName));

        //Задание 7
        String firstString = "135";
        String secondString = "246";
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < firstString.length(); i++) {
            resultString.append(firstString.charAt(i)).append(secondString.charAt(i));
        }
        System.out.println("Данные строки — " + resultString);

        ///Задание 8
        System.out.println();
        String stringWithRepeats = "aabccddefgghiijjkk";
        char[] charArray = stringWithRepeats.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length-1; i++) {
            if (charArray[i] == charArray[i+1]){
                System.out.print(charArray[i]);
            }
        }
    }
}