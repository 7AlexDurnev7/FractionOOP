package com.company;

import java.beans.FeatureDescriptor;
import java.util.Scanner;

public class Fraction {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FractionsMethods f = new FractionsMethods(); //создаем дробь
        FractionsMethods f1 = new FractionsMethods();
        //вводим дроби

        f.input(in); // вводим данные дроб
        f1.input(in); // вводим еще одни данные дроби
        f.printFractions(); // выводим первые введеные данные в виде дроби
        f1.printFractions(); // выводим вторые введеные данные в виде дроби
        System.out.println('\n'); // вводим пробел между строк для лучей читабельности

        //Производим математические операции с дробями
        //1. Сложение дробей
        System.out.println("Складываем дроби: ");
        f.printFractions();
        System.out.print(" + ");
        f1.printFractions();
        System.out.print(" = ");
        FractionsMethods f3 = f.sum(f1); // обращаемся к методу сложения
        f3.printFractions(); // выводим итог сложения дробей
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Выделение целой части: ");
        f3.wholeFractions(); // вывод целой части дроби
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Сокращение дроби: ");
        f3.reduction();
        System.out.println('\n'); // вводим пробел между строк для лучей читабельности

        //2. Вычитание дробей
        System.out.println("Вычитаем дроби: ");
        f.printFractions();
        System.out.print(" - ");
        f1.printFractions();
        System.out.print(" = ");
        FractionsMethods f4 = f.min(f1); // обращаемся к методу сложения
        f4.printFractions(); // выводим итог вычитания дробей
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Выделение целой части: ");
        f4.wholeFractions(); // вывод целой части дроби
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Сокращение дробей: ");
        f4.reduction();
        System.out.println('\n'); // вводим пробел между строк для лучей читабельности

        //3. Умножение дробей
        System.out.println("Умножение дробей: ");
        f.printFractions();
        System.out.print(" * ");
        f1.printFractions();
        System.out.print(" = ");
        FractionsMethods f5 = f.multiply(f1);
        f5.printFractions();
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Выделение целой части: ");
        f5.wholeFractions(); // вывод целой части дроби
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Сокращение дробей: ");
        f5.reduction();
        System.out.println('\n'); // вводим пробел между строк для лучей читабельности

        //4. Деление дробей
        System.out.println("Деление дробей: ");
        f.printFractions();
        System.out.print(" / ");
        f1.printFractions();
        System.out.print(" = ");
        FractionsMethods f6 =f.division(f1);
        f6.printFractions();
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Выделение целой части: ");
        f6.wholeFractions(); // вывод целой части дроби
        System.out.println(); //ставим пробел для лучшей читаемости
        System.out.print("Сокращение дробей: ");
        f6.reduction();
        System.out.println('\n'); // вводим пробел между строк для лучей читабельности
        in.close(); //закрыли сканер
        System.out.println(); //ставим пробел для лучшей читаемости

        //Вызов конструктора с параметрами по умолчанию
        System.out.print("Вызываем конструктор с параметрами по умолчанию: ");
        FractionsMethods f7 = new FractionsMethods();
        f7.printFractions();
        System.out.println(); //ставим пробел для лучшей читаемости

        //Setters
        f7.setA(8);//Задаём новое значение числителя через setters
        f7.setB(12);//Задаём новое значение знаменателя через setters

        //Getters
        System.out.println("Выводим новое значение числителя на экран с помощью getters: " + f7.getA());
        System.out.println("Выводим новое значение знаменателя на экран с помощью getters: " + f7.getB());


    }
}
