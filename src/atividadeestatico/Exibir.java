
package atividadeestatico;

public class Exibir {
    
public static void professor(Professor p){
    System.out.println("Professor: " + p.getNome());
    System.out.println("Disciplina: "+ p.getDisciplina());
}
public static void coordenador(Coordenador c){
    System.out.println("Coordenador: " + c.nome);
    System.out.println("Escola: "+ c.escola);
}
}
