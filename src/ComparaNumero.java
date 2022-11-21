import java.util.Scanner;
public class ComparaNumero {
    
    public int numero(int n1, int n2) {
        
        if (n1 == n2) {
            
            System.out.println("Os numeros sao iguais");
            
        } else {
            
            System.out.println("Os numeros sao diferentes");
            
            if (n1 > n2) {
                
                System.out.println("Maior numero: "+ n1);
                System.out.println("Menor numero: "+ n2);
                
            } else {
                System.out.println("Maior numero: "+ n2);
                System.out.println("Menor numero: "+ n1);       
                
            }
            
        }
        return 0;
     
    }
    
    public static void main (String[] args) {
        
        Scanner read = new Scanner(System.in);
        ComparaNumero comparar = new ComparaNumero();
        System.out.println("Insira o primeiro numero");
        int n1 = read.nextInt();
        System.out.println("Insira o segundo numero");
        int n2 = read.nextInt();
        
        comparar.numero(n1, n2);
        
        
    }
    
}
