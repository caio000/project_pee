public class Project{
 
    public static void main (String[] args){
 	
		if (args.length == 3) {
		
			System.out.println(args[0]);		
			System.out.println(args[1]);
			System.out.println(args[2]);
		
			int vet[] = new int[Integer.parseInt(args[0])];
			
			
			int vet1[] = cria(Integer.parseInt(args[0]), 0);
			int vet2[] = cria(Integer.parseInt(args[0]), 1);
			int vet3[] = cria(Integer.parseInt(args[0]), 2);
			
			int vet4[] = cria(Integer.parseInt(args[1]), 0);
			int vet5[] = cria(Integer.parseInt(args[1]), 1);
			int vet6[] = cria(Integer.parseInt(args[1]), 2);
			
			int vet7[] = cria(Integer.parseInt(args[2]), 0);
			int vet8[] = cria(Integer.parseInt(args[2]), 1);
			int vet9[] = cria(Integer.parseInt(args[2]), 2);
	 
			//modo ordenado
			System.out.println("Metodo Aleatorio");
			System.out.println("O Tempo de shell foi: " + shell(vet1));
			//============================================================================
			//modo ordenado
			System.out.println("Metodo Inverso");
			System.out.println("O Tempo de shell foi: " + shell(vet2));
			//=============================================================================
			System.out.println("Metodo Ordenado");
			System.out.println("O Tempo de shell foi: " + shell(vet3));
			
			
			//modo ordenado
			System.out.println("Metodo Aleatorio");
			System.out.println("O Tempo de shell foi: " + shell(vet4));
			//============================================================================
			//modo ordenado
			System.out.println("Metodo Inverso");
			System.out.println("O Tempo de shell foi: " + shell(vet5));
			//=============================================================================
			System.out.println("Metodo Ordenado");
			System.out.println("O Tempo de shell foi: " + shell(vet6));
			
			
			//modo ordenado
			System.out.println("Metodo Aleatorio");
			System.out.println("O Tempo de shell foi: " + shell(vet7));
			//============================================================================
			//modo ordenado
			System.out.println("Metodo Inverso");
			System.out.println("O Tempo de shell foi: " + shell(vet8));
			//=============================================================================
			System.out.println("Metodo Ordenado");
			System.out.println("O Tempo de shell foi: " + shell(vet9));
			
			
			
		}else {
			System.out.println("Informe todos os parametros");
		}
		
    }
 
 
     public static int[] cria(int N, int tipo) {
        
		int vet[] = new int[N];
		
		// tipo: 
        //      0 para numeros aleat??s
        //      1 para vetor ordenado
        //      2 para vetor em ordem inversa
  
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
     
//===============================================================================================================
      public static double shell(int[] vet) {
        double start = System.currentTimeMillis();
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
        double finish = System.currentTimeMillis();
        double total = finish - start;
        return total;
    }
}