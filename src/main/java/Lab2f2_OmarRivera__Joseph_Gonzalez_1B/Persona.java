package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

public abstract class Persona {

    protected String nombre;
    protected int identificacion;
    protected String correoElectronico;

    public boolean mostrarIdentificacion(){
        return true;
    }

    public Persona(String nombre, int identificacion, String correoElectronico) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "correoElectronico='" + correoElectronico + '\'' +
                ", identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
