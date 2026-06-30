package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Piloto extends MiembroEscuderia{
    private String numeroLicencia;
    private Vehiculo vehiculo;

    public Piloto(String nombre, int identificacion, String correoElectronico, int numeroEmpleado, LocalDate fechaIngreso, String numeroLicencia, Vehiculo vehiculo) {
        super(nombre, identificacion, correoElectronico, numeroEmpleado, fechaIngreso);
        this.numeroLicencia = numeroLicencia;
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "numeroLicencia='" + numeroLicencia + '\'' +
                ", vehiculo=" + vehiculo +
                ", numeroEmpleado=" + numeroEmpleado +
                ", fechaIngreso=" + fechaIngreso +
                ", nombre='" + nombre + '\'' +
                ", identificacion=" + identificacion +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }
}
