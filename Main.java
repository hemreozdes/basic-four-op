import java.util.*;
public class Main {
    enum op 
    {
        sum,
        sub,
        multiply,
        divide
    }
    public static void main(String[] args) {
        int a = 10, b = 20;
        op select = op.values()[new Random().nextInt(4)];
        switch (select) {
            case sum:
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case sub:
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case multiply:
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case divide:
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            default:
                break;
        }
    }
}

