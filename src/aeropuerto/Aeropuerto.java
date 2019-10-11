package aeropuerto;

public class Aeropuerto {
    
    private int pistasDeRodaje;
    private boolean todoDestino;
    private boolean tiquetes;
    private int auxiliaresDeVuelo;
    private int restaurantes;
    private int salasDeEspera;
    
    public void cantidadDePistasDeRodaje(){
        pistasDeRodaje = 3;
        
    }
    public void aeropuestoDestinosNacionales (){
        todoDestino = false;
    }
    
    public void tiquetesDisponibles (){
        tiquetes =  true;
    }
    public void cantidadDeAuxiliares (){
        auxiliaresDeVuelo = 30;
    }
    
    public void cantidadDeRestaurantes (){
        restaurantes = 4;
    }
    public void salasDeEsperaDisponibles(){
        salasDeEspera = 2;
        
    }

    public int getPistasDeRodaje() {
        return pistasDeRodaje;
    }

    public void setPistasDeRodaje(int pistasDeRodaje) {
        this.pistasDeRodaje = pistasDeRodaje;
    }

    public boolean isTodoDestino() {
        return todoDestino;
    }

    public void setTodoDestino(boolean todoDestino) {
        this.todoDestino = todoDestino;
    }

    public boolean isTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(boolean tiquetes) {
        this.tiquetes = tiquetes;
    }

    public int getAuxiliaresDeVuelo() {
        return auxiliaresDeVuelo;
    }

    public void setAuxiliaresDeVuelo(int auxiliaresDeVuelo) {
        this.auxiliaresDeVuelo = auxiliaresDeVuelo;
    }

    public int getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(int restaurantes) {
        this.restaurantes = restaurantes;
    }

    public int getSalasDeEspera() {
        return salasDeEspera;
    }

    public void setSalasDeEspera(int salasDeEspera) {
        this.salasDeEspera = salasDeEspera;
    }
    
    public void cantidadDePistasDeRodaje(int nuevasPistasDeRodaje){
        if(nuevasPistasDeRodaje<=this.pistasDeRodaje){
            System.out.println("No hay nuevas pistas: ");
        }else{
         this.pistasDeRodaje = nuevasPistasDeRodaje;
         System.out.println("La nueva cantidad de pistas es: ");
        }
        
    }


}