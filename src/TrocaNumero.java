import java.util.Scanner;
public class TrocaNumero {
    
    public int ordem(int NumA, int NumB){
      
        int Troca;
        Troca = NumA;
        NumA = NumB;
        NumB = Troca;
        
        System.out.println("Ordem inversa: \n NumA: " + NumA +"\n NumB: " + NumB );
        return 0;
        
    }
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        TrocaNumero trocar = new TrocaNumero();
        
        System.out.println("Insira o valor de NumA");
        int NumA = read.nextInt();
        System.out.println("Insira o valor de NumB");
        int NumB = read.nextInt();
        
        trocar.ordem(NumA, NumB);
        
        
    }
}
