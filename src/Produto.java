public class Produto {
    
    
    private double preco;
    private String nome;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double p) {
        this.preco = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    
    
    
    void diminuir10 () {
        preco = preco - (preco * 10 / 100);
    }
    
    void aumenta25 () {
        preco = preco + (preco * 25 / 100);
    }
}
