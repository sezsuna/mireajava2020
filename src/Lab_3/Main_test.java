package Lab_3;

import java.util.Scanner;

public class Main_test {
    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите номер задания от 1 до 3");
        choice = scan.nextInt();
        switch (choice){
            case (1):
                Circle circle_one = new Circle();
                Circle circle_two = new Circle(14.6);
                Circle circle_three = new Circle(2, "red",true);
                System.out.println(circle_three.toString());
                break;
            case (2):
                Head head_one = new Head();
                head_one.namePart();
                Leg leg_one = new Leg();
                leg_one.namePart();
                Hand hand_one = new Hand();
                hand_one.namePart();
                break;
            case (3):
                Book book_one = new Book("Поющие в терновнике", "Колин Маккалоу", "Роман", 1977);
                System.out.println(book_one.toString());
                break;
            default:
                break;
        }
    }
}
