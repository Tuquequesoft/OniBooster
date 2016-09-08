/**
 * Created by BrlessKoin on 08/09/2016.
 * Definicion de Onibus como objeto
 */

public class Onibus { //Atributos logicos de un Onibus
    private String Id = "309";
    private String placa;
    private String nombre = "Mariana";
    private int seats = 45;
    private String workingHours = "Manhã";
    private String route = "64";

    public Onibus (String Id, String placa, String nombre, int seats, String workingHours, String route) {
        this.Id = Id;
        this.nombre = nombre;
        this.placa = placa;
        this.seats = seats;
        this.workingHours = workingHours;
        this.route = route;
    }

    public String getId() {
        return Id;
    }
    public String getplaca() {
        return placa;
    }
    public String getnombre() {
        return nombre;
    }
    public int getseats() {
        return seats;
    }
    public String getworkingHours() {
        return workingHours;
    }
    public String getroute() {
        return route;
    }

    public void printOnibusChart() {
        System.out.println(Id+" "+nombre);
        System.out.println("Vagas: 35/"+seats);
        System.out.print("Horario: "+workingHours);
        System.out.print(" Rota: "+route);
    }


}