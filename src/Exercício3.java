public class Exercício3 {

    public static void main(String[] args) {

        int plus = 0;
        long multiplication = 1;
        
        for (int count = 1; count <= 30; count++) {
            
            if (count % 2 != 0) {
                
                plus = plus + count;
                
            } else {
                
                 multiplication = multiplication * count;
            }
        }
        

        System.out.println("Soma dos numeros impares: "+ plus);
        System.out.println("Multiplicação dos numeros pares: "+ multiplication);
        
    }
}