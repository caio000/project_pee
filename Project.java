public class Project{
 
    public static void main (String[] args){
 	
		if (args.length == 3) {
			
			int carga[] = new int[3];
			carga[0] = Integer.parseInt(args[0]);
			carga[1] = Integer.parseInt(args[1]);
			carga[2] = Integer.parseInt(args[2]);
			
			
			for (int i = 0; i < carga.length; i++) {
				for (int j = 0; j < carga.length; j++) {
					String[][] resultadoParcial = resultado(carga[i], j);
					exibeMatriz(resultadoParcial);
				}
			}
			
		} else {
			System.out.println("Informe todos os parametros");
			System.out.println("\t" + "-h exibe ajuda.");
		}
		
    }
 
  //===================================================================================================
    /**
     * Essa função recebe a carga de trabalho e retorna uma matriz com os resultados dos testes.
     * 
     * @param int carga: carga de tabalho.
     * @return String[][]: matriz com os resultados dos testes.
     */
    public static String[][] resultado (int carga, int tipo) {
    	
    	String resultado[][] = new String[30][2];
    	
    	for (int i = 0; i < resultado.length ; i++) {
    		for (int j = 0; j < resultado[0].length; j++) {
    			resultado[i][0] = Integer.toString(carga);
    			resultado[i][1] = Double.toString(shell(cria(carga, tipo)));
    		}
    	}
    	
    	return resultado;
    	
    }
    /**
     * Esse métodos cria um vetor de inteiros com tamanho e tipo informados como parametro.
     * 
     * Tipo = 0 para numeros aleatórios
     * 1 para vetor ordenado
     * 2 para vetor em ordem inversa
     * 
     * @param int tipo: tipo de vetor que sera criado
     * @return int vet[]: vetor de inteiros com o tamanho e tipo informados.
     */
    public static int[] cria(int N, int tipo) {
        
		int vet[] = new int[N];
		
        switch (tipo) {
            case 0:
                for (int i = 0; i < N; i++) {
                    vet[i] = (int) (Math.random() * N) + 1;
                }
                break;
            case 1:
                for (int i = 0; i < N; i++) {
                    vet[i] = i + 1;
                }
                break;
            case 2:
                for (int i = 0; i < N; i++) {
                    vet[i] = N - i;
                }
                break;
        }
        return vet;
    }
     /**
      * Esse método recebe um vetor e ordena utilizando o algoritmo shell sort e
      * retorna o seu tempo de execução.
      * 
      * @param Int vet: vetor com os dados a serem ordenados.
      * 
      * @return double: retorna o tempo de execução em millisegundos
      * 
      */
    public static long shell(int[] vet) {
        long start = System.currentTimeMillis();
        int h = 1;
        int n = vet.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = h / 3;
        int c, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                c = vet[i];
                j = i;
                while (j >= h && vet[j - h] > c) {
                    vet[j] = vet[j - h];
                    j = j - h;
                }
                vet[j] = c;
            }
            h = h / 2;
        }
        long finish = System.currentTimeMillis();
        long total = finish - start;
        return total;
    }

    public static void exibeMatriz(String[][] matriz) {
    	
    	for (int i = 0; i < matriz.length; i++) {
    		for (int j = 0; j < matriz[0].length; j++) {
    			
    			if (j != (matriz[0].length - 1)) {
    				System.out.print(matriz[i][j] + " , ");
    			} else {
    				System.out.print(matriz[i][j]);
    			}
    		}
    		System.out.println();
    	}
    }

}