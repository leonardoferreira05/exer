public class Data {

    
   private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        this.dia = d;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        this.mes = m;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int a) {
        this.ano = a;
    }
    
    
    String imprimir (){
        String data = dia + "/" + mes + "/" + ano;
        return data;
    }
}