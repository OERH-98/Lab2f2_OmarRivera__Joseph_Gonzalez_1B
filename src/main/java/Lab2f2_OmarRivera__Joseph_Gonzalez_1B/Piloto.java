package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Piloto extends MiembroEscuderia{
    private String numeroLicencia;
    private List<Vehiculo> vehiculo = new ArrayList<>();

    public Piloto(String nombre, int identificacion, String correoElectronico, int numeroEmpleado, LocalDate fechaIngreso, String numeroLicencia, List<Vehiculo> vehiculo) {
        super(nombre, identificacion, correoElectronico, numeroEmpleado, fechaIngreso);
        this.numeroLicencia = numeroLicencia;
        this.vehiculo = vehiculo;
    }
}
