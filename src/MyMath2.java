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
            return  n * fatorial(n -1);
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
            return k + somatorioIntervalo(k + 1, j);
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
     * Implemente um método recursivo que recebe um inteiro
     * e retorna uma String com o número em binário.
     * @param n número inteiro
     * @return número convertido em base binária
     */
    public static String convBase2(int n){
        return convBase2("", n);
    }

    public static String convBase2(String binario, int n){
        if(n == 0){
            return binario;
        }
        int res = n/2;
        if(n % 2 == 0){
            binario = 0 + binario;
        } else {
            binario = 1 + binario;
        }
        return convBase2(binario, res);
    }

    /**
     * Implemente um método recursivo que calcule o somatório
     * dos números contidos em um ArrayList de inteiros passado como parâmetro.
     * @param list ArrayList de inteiros
     * @return soma dos inteiros do ArrayList
     */
    public static int somatorioArrayList(ArrayList<Integer> list){
        return somatorioArrayList(list, 0);
    }

    public static int somatorioArrayList(ArrayList<Integer> list, int pos) {
        if (pos + 1 > list.size()) {
            return 0;
        } else {
            return list.get(pos) + somatorioArrayList(list, pos + 1);
        }
    }

    /**
     * Implemente um método recursivo para encontrar o maior elemento de um ArrayList.
     * @param list ArrayList de inteiros
     * @return maior elemento do ArrayList
     */
    public static int findBiggest(ArrayList<Integer> list){
        if(list == null) throw new NullPointerException("O ArrayList está null");
        return findBiggest(list, list.get(0), 0);
    }

    public static int findBiggest(ArrayList<Integer> list, int n, int pos){
        if(pos == list.size()){
            return n;
        }
        if(list.get(pos) > n){
            n = list.get(pos);
        }
        return findBiggest(list, n, pos + 1);
    }

    /**
     * Implemente um método recursivo para determinar
     * se um string ocorre dentro de outro.
     * @param str
     * @param match
     * @return
     */
    public boolean findSubStr(String match, String str){
        if(match.length() < str.length()){
            return false;
        }
        String aux = match.substring(0, str.length());
        if(aux.equals(str)){
            return true;
        }
        return findSubStr(match.substring(1, match.length()), str);
    }

    /**
     * Faça um método recursivo que determina
     * o número de dígitos de um inteiro.
     * @param n
     * @return
     */
    public static int nroDigit(int n) {
        if(n<0){
            n = n*-1;
        }
        if(n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        } else {
            return 1 + nroDigit(n/10);
        }
    }

    /**
     * Implemente um métodos que recebe um String e retorna
     * um ArrayList com todas as permutações deste String.
     * Ex.: cão -> [cão, coã, ãoc, ãco, oãc, oãc]
     * @return
     */
    public static void permutacao(ArrayList<String>palavras, String str, int i){
        int j, comprimento;
        comprimento = str.length();
        if (i == comprimento) {
            palavras.add(str);		}
        else {
            for (j = i; j < comprimento; j++) {
                char tmp;
                int p1=i, p2=j;
                tmp = str.charAt(p1);
                StringBuffer sb = new StringBuffer(str);
                sb.setCharAt(p1, str.charAt(p2));
                sb.setCharAt(p2, tmp);
                str = sb.toString();
                permutacao(palavras, str, i+1);
            }
        }
    }

    public static ArrayList<String> permutacao(String str){
        ArrayList<String> palavras = new ArrayList<String>();
        permutacao(palavras, str, 0);
        return palavras;
    }

    public static String espelhaPalavra(String palavra, int i, int j){
        if(i==j || j<i)return palavra;
        String palavraAUX;
        char tmp = palavra.charAt(i);
        StringBuffer sb = new StringBuffer(palavra);
        sb.setCharAt(i, palavra.charAt(j));
        sb.setCharAt(j, tmp);
        palavraAUX = sb.toString();
        return espelhaPalavra(palavraAUX, i+1, j-1);
    }

    public static String espelhaPalavra(String palavra){
        return espelhaPalavra(palavra, 0, palavra.length()-1);
    }

    public static String espelha(String palavra) {
        if ((palavra == null) || (palavra.length() <= 1)) {
            return palavra;
        }
        return espelha(palavra.substring(1)) + palavra.charAt(0);
    }

    public static ArrayList<String> substringGenerator(String palavra) {
        if(palavra.length()==0 || palavra==null)throw new NullPointerException();
        ArrayList<String> lista = new ArrayList<String>();
        if(palavra.length()==1){
            lista.add(palavra);
            return lista;
        }
        for (int i = 1; i <= palavra.length(); i++) {
            lista.add(palavra.substring(0,i));
        }
        lista.addAll(substringGenerator(palavra.substring(1,palavra.length())));
        return lista;
    }
}