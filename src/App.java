import uniderp.poo.escola.dominio.Aviao;
import uniderp.poo.escola.dominio.Caminhao;
import uniderp.poo.escola.dominio.Carro;
import uniderp.poo.escola.dominio.Motocicleta;
import uniderp.poo.escola.dominio.Onibus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Caminhao c1 = new Caminhao();
        Carro c2 = new Carro();
        Motocicleta m1 = new Motocicleta();
        Aviao a1 = new Aviao();
        Onibus o1 = new Onibus();

        c1.setModelo("Mercedez");
        c2.setModelo("Porsche");
        m1.setModelo("Kawasaki Ninja");
        a1.setModelo("Airbus a320");
        o1.setModelo("Volvo");

        System.out.println("\n====Modelo dos veiculos====\n");
        System.out.printf("Caminhao: %s\n", c1.getModelo());
        System.out.printf("Carro: %s\n", c2.getModelo());
        System.out.printf("Motocicleta: %s\n", m1.getModelo());
        System.out.printf("Aviao: %s\n", a1.getModelo());
        System.out.printf("Onibus: %s\n", o1.getModelo());

    }
}
