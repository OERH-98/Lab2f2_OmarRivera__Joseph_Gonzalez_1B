package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;


import java.time.LocalDate;

public abstract class MiembroEscuderia extends Persona {
    public MiembroEscuderia(String nombre, int identificacion, String correoElectronico, int numeroEmpleado, LocalDate fechaIngreso) {
        super(nombre, identificacion, correoElectronico);
        this.numeroEmpleado = numeroEmpleado;
        this.fechaIngreso = fechaIngreso;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    protected int numeroEmpleado;
    protected LocalDate fechaIngreso;
}
