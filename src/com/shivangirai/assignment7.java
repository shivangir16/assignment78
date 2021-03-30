package com.shivangirai;

import java.util.Scanner;

public class assignment7 {

    public static void main(String[] args){
        String user[] = {"shivangi", "shivali", "shivansh", "rohan"};
        String usercredentials[] = {"SR", "SL", "SS", "RK"};
        Scanner scanner = new Scanner(System.in);
        Account obj1 = new Account();
        String password;
        int option;

        for (int i=0; i<user.length; i++){
            System.out.println("please enter your credentials" + user[i]);
            password = scanner.next();
            if(password.equals(usercredentials[i])) {
                boolean customer = true;
                while(customer != false)
                {
                    System.out.println("enter 1 for withdraw");
                    System.out.println("enter 2 for deposit");
                    System.out.println("enter 3 for viewing balance");
                    option = scanner.nextInt();
                    double amount;
                    switch (option){
                        case 1:
                            System.out.println("enter the amount to withdawal:");
                            amount = scanner.nextDouble();
                            obj1.withdrawal(amount);
                            break;
                        case 2:
                            System.out.println("enter the amount to deposit:");
                            amount = scanner.nextDouble();
                            obj1.deposit(amount);
                            break;
                        case 3:
                            double balance;
                            balance = obj1.getBalance();
                            System.out.println("Balance is: " +balance);
                            break;
                        default:
                            System.out.println("choose one option");
                            break;
                    }
                    System.out.println("do you want to continue this transaction " + user[i]+ "? yes or no");
                    String result = scanner.next();
                    if (result.equals("yes")){
                        customer = true;
                    } else {
                        customer = false;
                    }
                }
            } else {
                System.out.println("oops! sorry try again");
            }
        }
    }
}

