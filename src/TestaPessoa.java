public class TestaPessoa {
    
    public static void main(String[] args) {
        
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Leonardo Ferreira";
        p1.idade = 28;
        
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
        
        p1.idade = 30;
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
        
        p1.idade = 42;
        p1.fazAniversario();
        
        System.out.println("Nome: " + p1.nome + " Você fará: " + p1.idade + " anos");
   
    }
    
}
