public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados= golesMarcados;
        this.dorsal= dorsal;
    }

    public Jugador(){
        golesMarcados= 289;
        dorsal= 7;
    }

    public String toString(){
        String texto1= super.toString();
        return String.format("%s con el dorsal %d. Ha marcado %d", texto1, dorsal, golesMarcados);
    }

    @Override
    public int compareTo(Jugador otroJugador){
        
    }


}