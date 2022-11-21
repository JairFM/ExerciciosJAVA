
import java.util.Scanner;


public class MaiorNumero {
    
    public int maior(int n1, int n2){
        
        if (n1 > n2){
            
            return n1;
        } else{
            
            return n2;
        }
        
    }
    
    public static void main (String[] args){
        
        Scanner read = new Scanner (System.in);
        MaiorNumero maiornum = new MaiorNumero();
        System.out.println("Insira o primeiro numero");
        int n1 = read.nextInt();
        System.out.println("Insira o segundo  numero");
        int n2 = read.nextInt();
        
        System.out.println("Maior numero: "+ maiornum.maior(n1, n2));
        
        
    }
}
