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



}



public class Main {
    public static void main(String args[]) {
        System.out.println("Starting app");
        Adder adder = new Adder(10, 20);
        

        System.out.println("App finished.");
    }
}