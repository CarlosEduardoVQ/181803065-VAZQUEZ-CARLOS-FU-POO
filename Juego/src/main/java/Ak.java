//CLASE LA PLANTILLA PA PODER CREAR OBJETOS

public class Ak {

    //ATRIBUTOS DATOS O CARACTERISTICAS DEL OBJETIVO DE MANERA GENERAL
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int dano;
    double velocidadDisparo;

//METODOS SON LAS ACCIONES / ITERACIONES DEL OBJETO.
    public void disparar() {
    }

    public void cargar() {
    }

    public void apuntar() {
    }

    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidad_carga=" + velocidadCarga + ", precio=" + precio + ", dano=" + dano + '}';
    }
}
