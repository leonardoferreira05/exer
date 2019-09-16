public class Casa {
    
    
   private String cor;
   private Porta porta1;
   private Porta porta2;
   private Porta porta3;

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public Porta getPorta1() {
        return porta1;
    }

    public void setPorta1(Porta p1) {
        this.porta1 = p1;
    }

    public Porta getPorta2() {
        return porta2;
    }

    public void setPorta2(Porta p2) {
        this.porta2 = p2;
    }

    public Porta getPorta3() {
        return porta3;
    }

    public void setPorta3(Porta p3) {
        this.porta3 = p3;
    }
    
    
    void pinta(String cor){
        this.cor = cor;
    }
    
    int quantasPortasEstaoAbertas(){
        int qtd = 0;
        if(porta1.estaAberta() || porta2.estaAberta() || porta3.estaAberta()){
            qtd = 1;
        }
        if(porta1.estaAberta() && porta2.estaAberta()){
            qtd = 2;
        }
        if(porta1.estaAberta() && porta3.estaAberta()){
            qtd = 2;
        }
        if(porta2.estaAberta() && porta3.estaAberta()){
            qtd = 2;
        }
        if(porta1.estaAberta() && porta2.estaAberta() && porta3.estaAberta()) {
            qtd = 3;
        }
        return qtd;
    }

   
        public void setAbrePorta1(){
            this.porta1.setAbre();
        }
            
      public void setAbrePorta2(){
            this.porta2.setAbre();
            
        }
      public void setAbrePorta3(){
            this.porta3.setAbre();
      }
           
            public void setFechaPorta1(){
            this.porta1.setFecha();
            
        }
            public void setFechaPorta2(){
            this.porta2.setFecha();
    }
            public void setFechaPorta3(){
            this.porta3.setFecha();
            }
    
}
