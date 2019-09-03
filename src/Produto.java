public class Produto {
    
    
    double preco;
    String nome;
    
    
    void diminuir10 () {
        preco = preco - (preco * 10 / 100);
    }
    
    void aumenta25 () {
        preco = preco + (preco * 25 / 100);
    }
}
