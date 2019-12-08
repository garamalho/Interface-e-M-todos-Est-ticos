
package atividadeestatico;

public class Principal {

    
    public static void main(String[] args) {
        Coordenador c = new Coordenador();
        c.escola = "ETEC";
        c.nome = "Elisângela Xavier";
        Exibir.coordenador(c);
        ControleSala.abrirSala();
        c.abrirSala();
 
        System.out.println(" ");
        
        Coordenador c2 = new Coordenador();
        c2.nome = "Veridiane ";
        c2.escola = "ETEC";
        Exibir.coordenador(c2);
        ControleSala.abrirSala();
        c2.abrirSala();
        
        System.out.println(" ");

        Coordenador c3 = new Coordenador();
        c3.nome = "Cláudio Ferrini";
        c3.escola = "ETEC";
        Exibir.coordenador(c3);
        ControleSala.abrirSala();
        c3.abrirSala();
        
        System.out.println(" ");

        Professor p = new Professor();
        p.setNome("Julio Borges");
        p.setDisciplina("BIOLOGIA");
        Exibir.professor(p);
        p.abrirSala();
       
        System.out.println(" ");
    
        Professor p2 = new Professor();
        p2.setNome("Luiz Fernando");
        p2.setDisciplina("MATEMÁTICA");
        Exibir.professor(p2);
        p2.abrirSala();
        
        System.out.println(" ");
        
        Professor p3 = new Professor();
        p3.setNome("Alexandre Fidélis");
        p3.setDisciplina("PORTUGUÊS");
        Exibir.professor(p3);
        p3.abrirSala();
    }
    
}
