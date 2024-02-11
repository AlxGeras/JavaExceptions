package lesson_3.homework;

// valid      Surname Name Patronymic 25.03.1995 1234567890 m
// valid      Surname Name Patronymic 22.12.1975 1234567890 f

// Проверить введенные данные по количеству
// 1) (false) Surname Name Patronymic 22.12.1975 1234567890 f test
// 2) (false) Surname Name Patronymic 22.12.1975 1234567890

// Если форматы данных не совпадают, нужно бросить исключение
// 3) (false) Surname1 Name Patronymic 22.12.1975 1234567890 m
// 4) (false) Surname Name2 Patronymic 22.12.1975 1234567890 m
// 5) (false) Surname Name Patronymic3 22.12.1975 1234567890 m
// 6) (false) Surname Name Patronymic 22/12/1975 1234567890 m
// 7) (false) Surname Name Patronymic 22.12.1975 +1234567890 m
// 8) (false) Surname Name Patronymic 22.12.1975 1234567890 male
// 9) (false) Surname Name Patronymic 22.12.1975 1234567890 ?

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        do {
            try {
                ScanInput input = new ScanInput();
                input.inputEnter();
            } catch (InputMismatchException e) {
                System.out.println("ошибка ввода данных".toUpperCase());
            }


        } while (true);

    }



}
