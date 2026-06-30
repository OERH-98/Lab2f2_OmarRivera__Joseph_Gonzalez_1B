package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

public class Espectador extends Persona{
    public Espectador(String nombre, int identificacion, String correoElectronico, int numeroBoleto) {
        super(nombre, identificacion, correoElectronico);
        this.numeroBoleto = numeroBoleto;
    }

    private int numeroBoleto;
}
