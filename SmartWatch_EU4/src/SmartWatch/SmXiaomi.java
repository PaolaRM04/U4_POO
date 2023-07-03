package SmartWatch;

import java.time.Instant;

public class SmXiaomi extends SmartWatch {

    public SmXiaomi(String marca, String modelo, double tamanioPulgadas, String bateria, String color) {
        super(marca, modelo, tamanioPulgadas, bateria, color);
    }

    @Override
    public void marcarHoraYFecha() {
        Instant instant = Instant.now();

        System.out.println(instant);
    }

    @Override
    public void sonarAlarma() {
        System.out.println(this.marca+ ": ¡Ring! ¡Ring!");
    }

    @Override
    public int contarPasos() {
        System.out.println("Pasos dados: " + pasos);
        return pasos+=50;
    }

    @Override
    public int contarCalorias() {
        System.out.println("Calorias quemadas: " + (cal = pasos / 100));
        return cal;
    }

    @Override
    public void reproducir() {
        System.out.println(this.marca + ": Reproduciendo musica...");
    }

    @Override
    public void pausar() {
        System.out.println(this.marca + ": Se ha pausado la musica...");
    }

    @Override
    public void transferir() {
        System.out.println(this.marca + ": Transfiriendo cantidad...");
    }

    @Override
    public void mostrarInf() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamaño: " + this.tamanioPulgadas);
        System.out.println("Bateria: " + this.bateria);
        System.out.println("Color: " + this.color);

    }
}
