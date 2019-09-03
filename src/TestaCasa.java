public class TestaCasa {
    public static void main(String[] args) {
        
        
        Casa casa1 = new Casa();
        casa1.cor = "Branco";
        
        
        Porta p1 = new Porta();
        
        p1.cor = "Amarelo";
        p1.dimensaoX = 0.5;
        p1.dimensaoY = 1.5;
        p1.dimensaoZ = 0.75;
        casa1.porta1 = p1;
        casa1.porta1.abre();
       
        Porta p2 = new Porta();
        
        p2.cor = "Vermelho";
        p2.dimensaoX = 1.0;
        p2.dimensaoY = 2.0;
        p2.dimensaoZ = 0.30;
        casa1.porta2 = p2;
        casa1.porta2.abre();
        
        Porta p3 = new Porta();
        
        p3.cor = "Azul";
        p3.dimensaoX = 1.0;
        p3.dimensaoY = 2.5;
        p3.dimensaoZ = 1.5;
        casa1.porta3 = p3;
        casa1.porta3.abre();
        
        
        casa1.cor = "Verde";
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.cor = "Rosa";
        casa1.porta1.abre();
        casa1.porta2.abre();
        casa1.porta3.fecha();
        
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.cor = "Lilas";
        casa1.porta1.fecha();
        casa1.porta2.fecha();
        casa1.porta3.abre();
        
        System.out.println("Cor da casa: " + casa1.cor + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
    }
}
