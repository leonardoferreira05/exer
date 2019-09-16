public class TestaAluno {
    
    public static void main(String[] args) {
        
        
        Aluno a1 = new Aluno();
        a1.setCpf("12345678913");
        
        
        Data d1 = new Data();
        d1.setDia(20);
        d1.setMes(1);
        d1.setAno(1991);
        
        
       a1.setData(d1);
        
        
        System.out.println(a1.imprimir());
        
        
    }

    }
    
    

