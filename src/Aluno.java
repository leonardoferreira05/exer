public class Aluno {
    
    
    String cpf;
    Data dataDeNasc;
    
    
    String imprimir (){
        String dados = "CPF: " + cpf + " Data de nascimento: " + dataDeNasc.imprimir();
        return dados;
    }
}
