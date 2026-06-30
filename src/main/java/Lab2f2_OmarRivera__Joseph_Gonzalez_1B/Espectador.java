package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

public class Espectador extends Persona{
    private int numeroBoleto;

    public Espectador(String nombre, int identificacion, String correoElectronico, int numeroBoleto) {
        super(nombre, identificacion, correoElectronico);
        this.numeroBoleto = numeroBoleto;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "numeroBoleto=" + numeroBoleto +
                ", nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
