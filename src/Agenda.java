public class Agenda {
  
  int qntdd = 5;
  Contato contatos[] = new Contato[qntdd];
 
  public void adicionarNovoContato(Contato c){
    boolean sucesso = false;
     
 
    for(int i = 0; i < qntdd; i++){
      if(contatos[i] == null){
        
        contatos[i] = c;
        sucesso = true;
        break;
        
      }
    }
     
    if(sucesso){
      System.out.println("nContato adicionado com sucesso !");
    }
    else{
      System.out.println("Erro! Não há espaços vazios");
    }
  } 
   

  public Contato pesquisarContato(String nome){
      
    Contato contato = null;
     
      for (Contato contato1 : contatos) {

          if ((contato1 != null) && (contato1.nome.equals(nome))) {
              contato = contato1;
              break;
          }
      }
     
    return contato;
  }
   
  
  public void eliminarContato(String nome){
    boolean excluido = false;
     
   
    for(int i = 0; i < contatos.length; i++){
    
      if((contatos[i] != null) && (contatos[i].nome.equals(nome))){
        contatos[i] = null; 
        System.out.println("Contato eliminado com sucesso!");
        excluido = true;
        break;
      }
    }
     
    if(!excluido){
      System.out.println("Erro ! Contato não encontrado.");
    }
  }
}
