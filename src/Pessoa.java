public class Pessoa {
    
    
   private String nome;
   private int idade;

    public Pessoa(String nome, int idade) {
        this.setNome (nome);
        this.setIdade (idade);
    }
   
   

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }
    
    
    
    void fazAniversario() {
        this.idade += 1;
    }
}
