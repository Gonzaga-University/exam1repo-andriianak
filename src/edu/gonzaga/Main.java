package edu.gonzaga;

class Adder {
    int val1;
    int val2;

    //defautl constructor
    public Adder()
    {
        val1 = 0;
        val2 = 0;
    }

    public Adder(int new_val1, int new_val2) {
        val1 = new_val1;
        val2 = new_val2;
    }

    //setter
    public void setFirstVal(int newVal)
    {
        val1 = newVal;
    }

    //getter
    public int getFirstVal()
    {
        return val1;
    }

    //setter
    public vod setSecondVal(int newVal)
    {
        val2 = newVal;
    }

    //getter
    public int getSecondVal()
    {
        return val2;
    }

    //add function
    public int add()
    {
        return val1 + val2;
    }
    //prints sum
    public void printSum()
    {
        int sum = add();
        return System.out.println(val1 + " + " + val2 + " = " + sum);
    }
}



public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        Adder adder1 = new Adder(325, 2346);
        Adder adder2 = new Adder(90, 72);
        Adder adder3 = new Adder();
        adder.printSum();
        adder1.printSum();
        adder2.printSum();
        adder3.printSum();

        System.out.println("App finished.");
    }
}