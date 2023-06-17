package com.lab;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word = null;
        int positionForInsertingLetter = 0;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите слово: ");
            word = scanner.nextLine();

            System.out.print("Введите номер буквы, после которой нужно вставить 'т': ");
            positionForInsertingLetter = scanner.nextInt();

            String newWord = word.substring(0, positionForInsertingLetter)
                    .concat("т")
                    .concat(word.substring(positionForInsertingLetter));
            System.out.println("Новое слово: " + newWord);
        }catch (InputMismatchException e){
            System.out.println("Введите значение integer. Например: 1");
        } catch (StringIndexOutOfBoundsException e){
            System.out.printf("Размер слова равен: %s, а вы ввели: %s%n",
                    Objects.requireNonNull(word).length(), positionForInsertingLetter);
        }
    }
}