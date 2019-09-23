public class TestaPessoa {
    
    public static void main(String[] args) {
        
        
        Pessoa p1 = new Pessoa("Leonardo Ferreira",28);
        //p1.setNome ("Leonardo Ferreira");
        //p1.setIdade (28);
        
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
        
        p1.setIdade (30);
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
        
        p1.setIdade (42);
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.getNome() + " Você fará: " + p1.getIdade() + " anos");
   
    }
    
}
