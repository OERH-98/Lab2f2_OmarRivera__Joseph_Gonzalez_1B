package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

public class Vehiculo{
    private int cantidadCilindros;
    private String matricula;
    private Motor motor;
    private Chasis chasis;

    public Vehiculo(int cantidadCilindros, String matricula, Motor motor, Chasis chasis) {
        this.cantidadCilindros = cantidadCilindros;
        this.matricula = matricula;
        this.motor = motor;
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "cantidadCilindros=" + cantidadCilindros +
                ", matricula='" + matricula + '\'' +
                ", motor=" + motor +
                ", chasis=" + chasis +
                '}';
    }
}
