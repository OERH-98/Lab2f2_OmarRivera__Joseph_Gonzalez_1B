package Lab2f2_OmarRivera__Joseph_Gonzalez_1B;

import java.time.LocalDate;

//Creado por Joseph
public class Main {
    public static void main(String[] args) {
        Espectador obj1 = new Espectador("Jose",23,"2332@gmail.com",2311);
        MecanicaPits obj2 = new MecanicaPits("xd",233,"323@gflgk.com",2323,LocalDate.now(),"Llantas");
        Motor obj3 = new Motor(23);
        Chasis obj4 = new Chasis(4);
        Vehiculo obj5 = new Vehiculo(8,"KJHSDJSFDH",obj3,obj4);
        Piloto obj6 = new Piloto("Max Verstappen", 323,"vudubf@gmail.com",4343,LocalDate.now(),"434-hdjf",obj5);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj5);
        System.out.println(obj6);

        Carrera objCarrera = new Carrera("SDAJKSDA","MONACO","IDK",LocalDate.now(),)


    }
}