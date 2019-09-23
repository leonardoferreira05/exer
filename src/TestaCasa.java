public class TestaCasa {
    public static void main(String[] args) {
        
        
        Casa casa1 = new Casa("Branco");
        //casa1.setCor("Branco");
        
        
        Porta p1 = new Porta("amarelo",0.5,1.5,0.75);
        
        //p1.setCor ("Amarelo");
        //p1.setDimensaoX (0.5);
       // p1.setDimensaoY (1.5);
       // p1.setDimensaoZ (0.75);
        casa1.setPorta1(p1);
        casa1.setAbrePorta1();
       
        Porta p2 = new Porta("vermelho",1.0,2.0,0.30);
        
        //p2.setCor ("Vermelho");
       // p2.setDimensaoX  (1.0);
        //p2.setDimensaoY (2.0);
        //p2.setDimensaoZ (0.30);
        casa1.setPorta2  (p2);
        casa1.setAbrePorta2();
        
        Porta p3 = new Porta("azul",1.0,2.5,1.5);
        
        //p3.setCor ("Azul");
       // p3.setDimensaoX (1.0);
       // p3.setDimensaoY (2.5);
        //p3.setDimensaoZ (1.5);
        casa1.setPorta3 (p3);
        casa1.setAbrePorta3();
        
        
        casa1.setCor ("Verde");
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.setCor ( "Rosa");
        casa1.setAbrePorta1();
        casa1.setAbrePorta2();
        casa1.setAbrePorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
        casa1.setCor  ("Lilas");
        casa1.setFechaPorta1();
        casa1.setFechaPorta2();
        casa1.setFechaPorta3();
        
        System.out.println("Cor da casa: " + casa1.getCor() + 
                "\nPortas abertas: " + casa1.quantasPortasEstaoAbertas() + "\n");
        
    }
}
