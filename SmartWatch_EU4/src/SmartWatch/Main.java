
package SmartWatch;

public class Main {

    
    public static void main(String[] args) {
        SmSamsung sm1= new SmSamsung("Samsung","Galaxy Watch 4", 1.5748, "Batería de 40 h de duración", "Rosa");
        
        sm1.encender();
        sm1.marcarHoraYFecha();
        sm1.contarPasos();
        sm1.contarCalorias();
        sm1.sonarAlarma();
        sm1.mostrarInf();
        sm1.contarPasos();
        sm1.contarCalorias();
        sm1.reiniciar();
        sm1.contarPasos();
        sm1.contarCalorias();
        sm1.apagar();
        
        SmXiaomi  sm2 = new SmXiaomi ("Xiomi","Smart Band 7", 1.62, "Batería de 14 días de duración", "Negro");
        sm2.encender();
        sm2.marcarHoraYFecha();
        sm2.contarPasos();
        sm2.contarCalorias();
        sm2.sonarAlarma();
        sm2.reproducir();
        sm2.pausar();
        sm1.apagar();
    }
    
}
