package taller3.televisores;

public class TV {
    private int canal = 1;
    private int precio = 500;
    private int volumen = 1;
    private Control control;
    private Marca marca;
    private boolean estaEncendido;

    private final int maxVolumen = 7;
    private final int maxCanal = 120;

    private static int numTV;

    public TV(Marca marca, boolean estaEncendido){
        this.marca = marca;
        this.estaEncendido = estaEncendido;
        numTV++;
    }

    /*public void setEstaEncendido(boolean estaEncendido){
        this.estaEncendido = estaEncendido;
    }*/

    public void canalUp(){
        if(!estaEncendido) return;
        if(!esNuevoCanalValido(canal + 1)) return;

        canal++;
        /*if(estaEncendido && canal < 120) {
            canal++;
        }*/
    }

    private boolean esNuevoCanalValido(int nuevoCanal){
        if(nuevoCanal < 0) return false;
        if(nuevoCanal > maxCanal) return false;

        return true;
    }

    public void canalDown(){
        if(!estaEncendido) return;
        if(!esNuevoCanalValido(canal - 1)) return;

        canal--;
    }

    public void volumenUp(){
        if(!estaEncendido) return;

        if(volumen >= maxVolumen) return;

        volumen++;
    }

    public void columenDown(){
        volumen--;
    }
    //Query
    public boolean getEstado(){
        return estaEncendido;
    }

    public void turnOn(){
        estaEncendido = true;
    }

    public void turnOff(){
        estaEncendido = false;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if(!estaEncendido) return;
        if(!esNuevoCanalValido(canal)) return;

        this.canal = canal;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getNumTV(){
        return numTV;
    }

}
