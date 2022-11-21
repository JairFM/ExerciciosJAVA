
import java.util.Scanner;
 
public class Estudos{
  public static void main(String args[]){
    Scanner read = new Scanner(System.in);
    String nome, email, numero; 
    Contato c;
     
    
    Agenda agenda = new Agenda();
     
    
    while(true){
        
      System.out.println("1- Adicionar novo contacto");
      System.out.println("2- Pesquisar contacto");
      System.out.println("3- Eliminar contacto");
      System.out.println("4- Sair");
      System.out.print("Escolha a sua opcao ");
      
      int  opcao = Integer.parseInt(read.nextLine());
       
      switch(opcao){
          
        case 1 -> {
            
            System.out.println("Informe o nome: ");
            nome = read.nextLine();
            System.out.print("Informe o E-mail: ");
            email = read.nextLine();
            System.out.print("Informe o numero de telefone: ");
            numero = read.nextLine();
            
            c = new Contato();
            c.nome = nome;
            c.email = email;
            c.numero = numero;
            
            agenda.adicionarNovoContato(c);
            }
           
        case 2 -> {
            
            System.out.println("Escreva o nome da pessoa: ");
            nome = read.nextLine();
            
            c = agenda.pesquisarContato(nome);
            if(c == null){
                System.out.println("Contacto não encontrado.\n");
            }
            else{
                System.out.println("Contacto encontrado com sucesso !");
                System.out.println("Nome: " + c.nome );
                System.out.println("E-mail: " + c.email);
                System.out.println("Numero: " + c.numero);
            } }
           
        case 3 -> {
            
            System.out.println("Informe o nome do contacto que deseja excluir: ");
            nome = read.nextLine();
            agenda.eliminarContato(nome);
            }
           
        case 4 -> System.exit(0);
      }
    }
  }
}