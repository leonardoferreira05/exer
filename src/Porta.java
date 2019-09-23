public class Porta {
    
    
   private boolean aberta;
   private String cor;
    
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta(boolean aberta, String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
        this.setAberta (aberta);
        this.setCor (cor);
        this.setDimensaoX (dimensaoX);
        this.setDimensaoY (dimensaoY);
        this.setDimensaoZ (dimensaoZ);
    }

    Porta(String amarelo, double d, double d0, double d1) {
        
    }

    Porta() {
       
    }
    
    

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean a) {
        this.aberta = a;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dX) {
        this.dimensaoX = dX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dY) {
        this.dimensaoY = dY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dZ) {
        this.dimensaoZ = dZ;
    }
    
    
    
    public void setAbre(){
        this.aberta = true;
    }
    
    public void setFecha(){
        this.aberta = false;
    }
    
   // public void setCor(String cor) {
     //   this.cor = cor;
   // }
    
   public  boolean estaAberta(){
        return aberta;
    }


    }

