
package atividadeestatico;

public class Professor {
private String nome;
private String disciplina;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public void abrirSala(){
       System.out.println("A sala esta aberta! Vamos estudar.");
   }
    
  

}
