class Calculator {
    public int addnumber(int num1, int num2) {
        int r = num1 + num2;
        return r;
    }

}

public class prac2 {
    public static void main(Str[] args) {
        int n1 = 23;
        int n2 = 34;
        Calculator calc = new Calculator();
        int result = calc.addnumber(n1, n2);
        System.out.println(result);
    }
}