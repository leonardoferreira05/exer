public class TestaPorta {
    
    public static void main(String[] args) {
        
        
        Porta porta1 = new Porta();
        porta1.cor = "Preto";
        porta1.dimensaoX = 2.6;
        porta1.dimensaoY = 3.7;
        porta1.dimensaoZ = 0.6;
        
        String estado;
        if (porta1.estaAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        
        String dados = "Cor: " + porta1.cor + "\nDimensões: " + porta1.dimensaoX
                + "m x " + porta1.dimensaoY + "m x " + porta1.dimensaoZ + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
        
        porta1.abre();
        
        if (porta1.estaAberta()) {
           estado = "Aberta";
        }else {
           estado = "Fechada";
        }
        
        porta1.pinta("Vermelha");
        porta1.dimensaoX = 2.0;
        porta1.dimensaoY = 3.0;
        porta1.dimensaoZ = 0.15;
        
        dados = "Cor: " + porta1.cor + "\nDimensões: " + porta1.dimensaoX
                + "m x " + porta1.dimensaoY + "m x " + porta1.dimensaoZ + "m" + "\nEstado: "
                + estado;
        System.out.println(dados);
        
    }
}
