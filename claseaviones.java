import java.util.ArrayList;
class Avion {

    private String modelo;
    private String aerolinea;
    int capacidadPasajeros;
    double velocidadMaxima; //en km/h
    double autonomiaVuelo; //en horas
    boolean enVuelo; //true si esta volando, false en tierra

//constructor
    public Avion(String modelo, String aerolinea, int capacidadPasajeros, double velocidadMaxima, double autonomiaVuelo, boolean enVuelo){
        this.modelo = modelo;
        this.aerolinea = aerolinea;
        this.capacidadPasajeros = capacidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.autonomiaVuelo = autonomiaVuelo;
        this.enVuelo = enVuelo;
    }

    //acciones 
    public void despegar(){
        this.enVuelo = true;
        System.out.println("El avion " + this.modelo + " de " + this.aerolinea + " ha despegado exitosamente.");
    }
    public void aterrizar(){
        this.enVuelo = false;
        System.out.println("El avion " + this.modelo + " de" + this.aerolinea + "ha aterrizado exitosamente.");
}

    public void encenderMotores(){
        System.out.println("Los motores del avion " + this.modelo + " de " + this.aerolinea + " han sido encendidos.");
    }

    public void activarPilotoAutomatico(){
        System.out.println("Piloto automatico para el modelo" + this.modelo + ".");
    }
    public void mostrarInformacion(){
        System.out.println("Modelo: " + modelo + " Aereolinea: " + aerolinea +" Pasajeros: " + capacidadPasajeros + " Velocidad Max: " + velocidadMaxima + " km/h Autonomia: " + autonomiaVuelo + " hrs En vuelo: " + enVuelo); 

    }


}

class GestorAviones {
    public ArrayList<Avion> almacenarAviones(Avion a1, Avion a2, Avion a3, Avion a4, Avion a5, Avion a6, Avion a7, Avion a8, Avion a9, Avion a10) {
        ArrayList<Avion> tablaAviones = new ArrayList<>();
        tablaAviones.add(a1);
        tablaAviones.add(a2);
        tablaAviones.add(a3);
        tablaAviones.add(a4);
        tablaAviones.add(a5);
        tablaAviones.add(a6);
        tablaAviones.add(a7);
        tablaAviones.add(a8);
        tablaAviones.add(a9);
        tablaAviones.add(a10);
        
        return tablaAviones;
    }
}

public class claseaviones {
        public static void main(String[] args) {
        Avion a1 = new Avion("Boeing 747", "Aerican Airlines", 416, 988.0, 14.8, false);
        Avion a2 = new Avion( "Airbus A380", "eMIRATES", 853, 1020.0, 15.0, false);
        Avion a3 = new Avion("Boeing 737", "Aereomexico", 160, 828.0, 6.0, false);
        Avion a4 = new Avion("Airbus A320", "Volaris", 180, 828.0, 6.0, false);
        Avion a5 = new Avion("Cessna 172", "Private", 4, 226.0, 5.5, false);
        Avion a6 = new Avion("Embraer E190", "Conncet", 100, 871.0, 4.5, false);
        Avion a7 = new Avion("Boeing 787", "Southwest Airlines", 242, 900.0, 12.0, false);
        Avion a8 = new Avion("Airbus A350", "Lufthansa", 366, 950.0, 14.0, false);
        Avion a9 = new Avion("Cessna Citation", "Corporate Jets", 8, 650.0, 8.0, false);
        Avion a10 = new Avion("Gulfstream G650", "Private", 19, 850.0, 16.0, false);

        GestorAviones gestor = new GestorAviones();
        ArrayList<Avion> tablaDeAviones = gestor.almacenarAviones(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
        
        System.out.println("tabla de inventario de aviones: ");
        for (int i = 0; i < tablaDeAviones.size(); i++){
            Avion a = tablaDeAviones.get(i);
            System.out.print("Avion " + (i + 1) + " -> ");
            a.mostrarInformacion();
        }
    }
}