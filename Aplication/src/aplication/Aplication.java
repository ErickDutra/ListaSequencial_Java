
package aplication;
public class Aplication {

    public static void main(String[] args) {
      
        ListaSequencial lista = new ListaSequencial();
        
        
        Aluno aluno1, aluno2;
        
        aluno1 = new Aluno(1002, "roberto");
        aluno2 = new Aluno(1003, "maria");
        
        lista.adiciona(aluno1);
        lista.adiciona(aluno2);
        
        System.out.println(lista.retornaValor(0));
    }
    
}
