
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Project{
 
    public static void main (String[] args){
 	
		if (args.length == 3) {
			
			Path caminho = Paths.get(System.getProperty("user.home") + "/ProjetoPEE/resultados.csv");
			
			ArrayList<String> list = new ArrayList<>();
			list.add("carga, tipo.vetor, tempo");
			
			int carga[] = new int[3];
			carga[0] = Integer.parseInt(args[0]);
			carga[1] = Integer.parseInt(args[1]);
			carga[2] = Integer.parseInt(args[2]);
			
			
			for (int i = 0; i < carga.length; i++) {
				for (int j = 0; j < carga.length; j++) {
					resultado(list,carga[i], j);
				}
			}
			
			String listString = listToString(list);
			
			try {
				
				if (Files.exists(caminho.getParent()))
					System.out.println("Pasta existe");
				else
					Files.createDirectory(caminho.getParent());
				
				Files.write(caminho, listString.getBytes());
				
				System.out.println("Arquivo gerado com sucesso!");
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		} else if (args.length == 1 && args[0].equals("-h")){
			System.out.println("Esse comando recebe como parametro três inteiros, cada um representando sua carga de trabalho. Por exemplo:");
			System.out.println("\t>java Project 5000 10000 20000");
			System.out.println("Nesse exmplo o programa vai rodar com uma carga de trabalho de 5000, 10000, 20000 elementos.");
			
		}else {
			System.out.println("Informe todos os parametros");
			System.out.println("\t" + "-h exibe ajuda.");
		}
		
    }
 
  //===================================================================================================
    /**
     * Essa função recebe a carga de trabalho e retorna uma matriz com os resultados dos testes.
     * @author Caio de Freitas Adriano
	 *
	 * @param ArrayList list: Lista onde sera armazenado os resultados.
     * @param int carga: carga de tabalho.
	 * @param int tipo : Tipo de vetor que sera criado
     */
    public static void resultado (ArrayList<String> list, int carga, int tipo) {
    	
		String vetorTipo;
		
		switch(tipo) {
			case 1:
				vetorTipo = "ordenado";
				break;
			case 2:
				vetorTipo = "inverso";
				break;
			default :
				vetorTipo = "aleatório";
				break;
		}
    	
    	for (int i = 0; i < 30; i++) {
			list.add(carga + ", " + vetorTipo + ", " + shell(cria(carga, tipo)));
		}
    	
    	
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
      * Esse método recebe um vetor de inteiros como parametro e o ordena utilizando o algoritmo shell sort
      * retornando o seu tempo de execução.
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
	/**
	 * Essa função recebe uma lista do tipo String e a transforma em uma String
	 *
	 * @author Caio de Freitas Adriano
	 *
	 * @param ArrayList<String> list: lista com todos os resultados do teste.
	 
	 * @return String listString: lista convertida em uma unica String.
	 */
    public static String listToString(ArrayList<String> list) {
    	
		String listString = "";
		
    	for (String l : list) {
			listString += l + "\n";
		}
		
		return listString;
    }

}