public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados= golesMarcados;
        this.dorsal= dorsal;
    }

    public Jugador(){
        super();
        golesMarcados= 289;
        dorsal= 7;
    }

    @Override
    public int compareTo(Jugador otroJugador){
        int diferenciaEdad= this.getEdad() - otroJugador.getEdad();
        return Math.abs(diferenciaEdad);
    }

    public String toString(){
        String texto1= super.toString();
        return String.format("%s con el dorsal %d. Ha marcado %d", texto1, dorsal, golesMarcados);
    }

    @Override
    public boolean jugarConLasManos(){
        return false;
    }
}