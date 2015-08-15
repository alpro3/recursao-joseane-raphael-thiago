public class MyMath {

    public static int fatorial(int n) {
        int fat = -1; // -1 indica erro
        if (n == 0 || n == 1)
            fat = 1;
        else if (n >= 2)
            fat = n * fatorial(n - 1);
        return fat;
    }

    public static int somatorio(int n) {
        int som;
        if (n == 0) {
            som = 0;
        } else if (n > 0) {
            som = n + somatorio(n - 1);
        } else {
            som = n + somatorio(n + 1);
        }
        return som;
    }

    public static int fibonacci(int n) {
        int som = 0;
        int cont = 0;
        if (n == 0 || n == 1){
            som = 1;
        } else if(cont == n) {
            return som;
        } else {
            som = fibonacci(n-1) + fibonacci(n-2);
            cont++;
        }
        return som;
    }

	public static int somatorioIntervalo(int k, int j){
		int soma = 0;
		int count = k;

		if((k > j) || (k == j) || (k == j-1)){
			soma = 0;
		} else if (k == j - 2){
			soma = k+1;
		} else if (k < j-2) {
			soma = somatorioIntervalo(k,j);
			count--;
		}
		return soma;
	}

    public static int somatorioIntervalo2(int k, int j) {
        int som;
        if(k > j) {
            som = j;
        } else {
            som = k;
        }

        if (n > 0) {
            som = n + somatorio(n - 1);
        } else {
            som = n + somatorio(n + 1);
        }
        return som;
    }
}