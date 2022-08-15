package com.example.signup;
import java.util.Scanner;
public class signup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cadastro();
        String yn;
        System.out.println("Is that correct? please digit y or n");
        System.out.print("[y/n]: ");
        yn = scanner.next();
        if (yn.equals("n")){
            while (yn.equals("n")) {
                cadastro();
                System.out.println("Is that correct? please digit y or n");
                System.out.print("[y/n]: ");
                yn = scanner.next();
                if (yn.equals("n")){
                    yn = "n";
                } else {
                    yn = "y";
                    System.out.println("Sign Up done!!!");
                }
            }
        } else {
            System.out.println("Sign Up done!!!");
        }

    }
    private static void cadastro () {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();

        System.out.print("Please enter your age: ");
        age = scanner.nextInt();

        System.out.println("Hello, " + name + ", check your information bellow: ");
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

}
