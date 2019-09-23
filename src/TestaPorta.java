public class TestaPorta {
    
    public static void main(String[] args) {
        
        
        Porta porta1 = new Porta("Preto",2.6,3.7,0.6);
        //porta1.setCor ("Preto");
       // porta1.setDimensaoX (2.6);
        //porta1.setDimensaoY (3.7);
       // porta1.setDimensaoZ (0.6);
        
        String estado;
        if (porta1.estaAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        
        String dados = "Cor: " + porta1.getCor() + "\nDimensões: " + porta1.getDimensaoX()
                + "m x " + porta1.getDimensaoY() + "m x " + porta1.getDimensaoZ() + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
        
        porta1.setAbre();
        
        if (porta1.estaAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        porta1.setCor("Vermelha");
        porta1.setDimensaoX (1.0);
        porta1.setDimensaoY (2.1);
        porta1.setDimensaoZ (0.14);
        
        dados = "Cor: " + porta1.getCor() + "\nDimensões: " + porta1.getDimensaoX()
                + "m x " + porta1.getDimensaoY() + "m x " + porta1.getDimensaoZ() + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
    }
}
