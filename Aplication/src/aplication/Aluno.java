
package aplication;

import java.util.Objects;

public class Aluno {
    private int matricula;
    private String nome;
    
    public Aluno(int matricula, String nome){
        this.matricula  = matricula;
        this.nome = nome;
    }
    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    public int getMatricula(int matricula){
        return matricula;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(String nome){
        return nome;
    }
    
    @Override
    public String toString(){
        return "Aluno [matricula = "+matricula+", nome = "+nome+"]";
    }
    @Override
    public int hashCode(){
        return Objects.hash(matricula, nome);
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno)obj;
        return matricula == other.matricula && Objects.equals(nome, other.nome);
    }
    
}
