import java.util.ArrayList;

public class MyMath2 {

    /**
     * Implemente um método recursivo que calcule
     * o fatorial de um número n passado como parâmetro.
     * @param n Número a ser calculado
     * @return Fatorial do número
     */
    public static int fatorial(int n){
        if(n <= 1){
            return 1;
        } else {
            return  n * fatorial(n -1 );
        }
    }

    /**
     * Implemente um método recursivo que calcule
     * o somatório de um número n (passado como parâmetro) até 0.
     * @param n Número a ser calculado
     * @return Somatório do número
     */
    public static int somatorio(int n){
        if(n == 0){
            return 0;
        } else if(n > 0){
            return n + somatorio(n - 1);
        } else {
            return n + somatorio(n + 1);
        }
    }

    /**
     * Implemente um método recursivo que calcule
     * o n-ésimo número da sequência de Fibonacci.
     * @param n Índice da sequência
     * @return N-ésimo número da seqûencia
     */
    public static int fibonacci(int n){
        if (n <= 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Implemente um método recursivo que calcule
     * o somatório dos números entre os números k e j.
     * @param k primeiro número do intervalo
     * @param j segundo número do intervalo
     * @return somatório do intervalo entre k e j
     */
    public static int somatorioIntervalo(int k, int j){
        if (k >= j) {
            return 0;
        } else if (k == j-1){
            return k + j;
        } else {
            return k + somatorioIntervalo(k+1, j);
        }
    }

    /**
     * Implemente um método recursivo que recebe um String
     * e retorna true se for um palíndromo e false caso contrário.
     * @param s String a ser verificada
     * @return true se for palíndromo, false se não for palíndromo
     */
    public static boolean isPal(String s){
        s = s.replaceAll("\\s","");
        if(s.length() == 0 || (s.length() == 1)){
            return true;
        } else {
            if (s.charAt(0) == s.charAt(s.length()-1)){
                return isPal(s.substring(1,s.length()-1));
            }
        }
        return false;
    }

    /**
     * Implemente um método recursivo querecebe um inteiro
     * e retorna uma String com o número em binário.
     * @param n número inteiro
     * @return número convertido em base binária
     */
    public static String convBase2(int n){
    return "0";
    }

    /**
     * Implemente um método recursivo que calcule o somatório
     * dos números contidos em um ArrayList de inteiros passado como parâmetro.
     * @param list ArrayList de inteiros
     * @return soma dos inteiros do ArrayList
     */
    public static int sumArrayList(ArrayList<Integer> list){
        if (list.size() == 0){
            return 0;
        }
    return 0;
    }

    /**
     * Implemente um método recursivo para encontrar o maior elemento de um ArrayList.
     * @param list ArrayList de inteiros
     * @return maior elemento do ArrayList
     */
    public static int findBiggest(ArrayList<Integer> list){
    return 0;
    }

}
