import java.util.Scanner;
        
public class MediaAluno {
    public void notasalunos(int[] notas){
        
        int tamanho = 4;
        Scanner read = new Scanner(System.in);
        
        for (int i= 0; i < tamanho; i++) {
            
            System.out.println("Insira " + (i+1) +"a nota");
            notas[i] = read.nextInt();
            if (notas[i] < 0 || notas[i] > 100) {
                
                System.out.println("Erro. Apenas numeros entre 0 e 100");
                i--;
            }
                    
        }
        for (int i= 0; i < tamanho; i++) {
            
            System.out.println(""+ (i+1)+"a "+ "nota:"+ notas[i]);
        }
    }
    
    public void calcularmedia(int[] notas) {
        
        int media = 0;
        int tamanho = 4;
        for (int i = 0; i < tamanho; i++) {
            
            media = media + notas[i];
        }
        media = media/tamanho;
        System.out.println("A media do aluno e: "+ media);
        
    }
    
    public static void main(String[] args) {
        
        MediaAluno imprimirnotas = new MediaAluno();
        int[] notas = new int[4];
        imprimirnotas.notasalunos(notas);
        imprimirnotas.calcularmedia(notas);

        
    }
}
   