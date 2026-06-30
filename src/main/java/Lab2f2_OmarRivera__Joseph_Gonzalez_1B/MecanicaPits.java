package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

import java.time.LocalDate;

public class MecanicaPits extends MiembroEscuderia{
    private String especialidad;

    public MecanicaPits(String nombre, int identificacion, String correoElectronico, int numeroEmpleado, LocalDate fechaIngreso, String especialidad) {
        super(nombre, identificacion, correoElectronico, numeroEmpleado, fechaIngreso);
        this.especialidad = especialidad;
    }
}
