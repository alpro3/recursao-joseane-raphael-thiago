import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {

        System.out.println(MyMath.fatorial(3));
        System.out.println(MyMath2.fatorial(3));
        System.out.println(MyMath.somatorio(-4));
        System.out.println(MyMath2.somatorio(-4));
        System.out.println(MyMath.fibonacci(17));
        System.out.println(MyMath2.fibonacci(17));
        System.out.println(MyMath2.somatorioIntervalo(0, 10));
        System.out.println(MyMath2.isPal("am ao"));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

    }

}
