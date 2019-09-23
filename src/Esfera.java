public class Esfera   {
    private double raio;

    public Esfera(double raio) {
        this.setRaio (raio);
    }
    
    
    
    double calcVolume () {
        return (4.0/3.0) * 3.14 * (raio * raio * raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double r) {
        this.raio = r;
    }
    
}
