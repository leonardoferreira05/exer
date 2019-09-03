public class TestaAluno {
    
    public static void main(String[] args) {
        
        
        Aluno a1 = new Aluno();
        a1.cpf = "12345678913";
        
        
        Data d1 = new Data();
        d1.dia = 20;
        d1.mes = 1;
        d1.ano = 1991;
        
        
        a1.dataDeNasc = d1;
        
        
        System.out.println(a1.imprimir());
        
        
    }
    
}
