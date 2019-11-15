package com.kamaldwip.coding.stacks.arrayImpl;

public class Main {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        stack.push(new Employee("Kamaldwip","Choudhury"));
        stack.push(new Employee("Abhinav","Borgohain"));
        stack.push(new Employee("Prateek","Sahu"));
        stack.push(new Employee("Parag","Roy"));

        stack.printStack();

        System.out.println("Peek : "+stack.peep());

        System.out.println("Pop : "+stack.pop());

        stack.printStack();

    }
}
