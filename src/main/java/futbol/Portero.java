package futbol;

public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal){
        super(nombre, edad, "Portero");
        this.golesRecibidos= golesRecibidos;
        this.dorsal= dorsal;
    }

    @Override
    public boolean jugarConLasManos(){
        return true;
    }

    public String toString(){
        String texto1= super.toString();
        return String.format("%s con el dorsal %d. Le han marcado %d", texto1, dorsal, golesRecibidos);
    }

    @Override
    public int compareTo(Portero otroPortero){
        int diferenciaGoles= this.golesRecibidos - otroPortero.golesRecibidos;
        return Math.abs(diferenciaGoles);
    }
}