package basicsOfJava;

public class SimpleInterest {
    public static void main(String[] args) {
        double principle,rate,time,si;
        principle = 100;
        rate = 20;
        time = 3;
        si = (principle*rate*time)/100;
        System.out.println("The interest is " + si);
    }
}
