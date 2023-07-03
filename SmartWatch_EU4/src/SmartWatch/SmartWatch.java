package SmartWatch;

public abstract class SmartWatch implements IContadorPasos, IPagos, IReloj, IReproductorMusica, Iinformacion{

    public String marca;
    public String modelo;
    public double tamanioPulgadas;
    public String bateria;
    public String color;
    
    int pasos=0;
    int cal=0;
    
    public SmartWatch(String marca, String modelo, double tamanioPulgadas, String bateria, String color){
        this.marca=marca;
        this.modelo=modelo;
        this.tamanioPulgadas=tamanioPulgadas;
        this.bateria=bateria;
        this.color=color;
    }

    public void encender() {
        System.out.println("El dispositivo ha encendido.");
    }

    public void apagar() {
        System.out.println("Apagando dispositivo...");
    }

    public void reiniciar() {
        pasos=0;
        cal=0;
        System.out.println("El dispositivo se ha reiniciado.");
    }
        

}
