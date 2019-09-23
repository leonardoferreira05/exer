public class Aluno {
    
    
   // String cpf;
   // Data dataDeNasc;
    private String cpf;
    private Data dataDeNasc;

    public Aluno(String c, Data d) {
        this.setCpf (c);
        this.setDataDeNasc(d);
    }

    Aluno(String s) {
       
    }

    

    
    
    
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String c){
       this.cpf=c; 
    }
    
    public Data getDataDeNasc(){
    return this.dataDeNasc;
    }
    public void setDataDeNasc(Data d){
    this.dataDeNasc=d;
    }
    
    
    
   public String imprimir (){
        String dado = "CPF: " + cpf + " Data de nascimento: " + dataDeNasc.imprimir();
        return dado;
    }

    public void setData(Data d1) {
        this.dataDeNasc=d1;
        
    }

    }

