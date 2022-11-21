
import java.util.Scanner;

public class NumeroDecrescente {
    
    public int inteiro(int num) {
        
        int decrescente = num;
        for (int count = 1; count <= decrescente; count++ ){
            
            System.out.println("" +num);
            num = num - 1;
            

        }
        return 0;
    }
    
    public static void main (String[] args) {
        
        Scanner read = new Scanner (System.in);
        NumeroDecrescente imprimir = new NumeroDecrescente();

        System.out.println("Insira um numero");
        int num = read.nextInt();
        
        imprimir.inteiro(num);
        
    }
}
