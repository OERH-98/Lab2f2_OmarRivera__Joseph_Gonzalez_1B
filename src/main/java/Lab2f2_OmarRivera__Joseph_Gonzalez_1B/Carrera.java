package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Creado por Joseph
public class Carrera {

    private String codigoCarrera;
    private String circuito;
    private String ciudad;
    private Date fechaCarrera;
    private List<MecanicaPits> listaMecanicos;
    private List<Espectador> listaEspectadores = new ArrayList<>();
    private List<Piloto> listaPiloto;
    private String estado;

    public Carrera(String codigoCarrera, String circuito, String ciudad, Date fechaCarrera, List<MecanicaPits> listaMecanicos, List<Espectador> listaEspectadores, String estado) {
        this.codigoCarrera = codigoCarrera;
        this.circuito = circuito;
        this.ciudad = ciudad;
        this.fechaCarrera = fechaCarrera;
        this.listaMecanicos = listaMecanicos;
        this.listaEspectadores = listaEspectadores;
        this.estado = estado;
    }

    public void mostrarInformacionCarrera(){

        System.out.println("El circuito de la carrera es: " +circuito);
        System.out.println("La ciudad donde se realizara la carrera es: " +ciudad);
        System.out.println("La fecha de la carrera es: " +fechaCarrera);
        System.out.println("El codigo de la carrera es: " +codigoCarrera);

    }

    public void agregarEspectador (Espectador e){
        listaEspectadores.add(e);

    }

    public void agregarMecanicos(MecanicaPits m){
        listaMecanicos.add(m);
    }

    public void agregarPiloto(Piloto p){
        listaPiloto.add(p);
    }
}
