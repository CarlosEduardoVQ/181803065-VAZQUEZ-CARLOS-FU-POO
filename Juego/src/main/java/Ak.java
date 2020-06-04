//CLASE LA PLANTILLA PA PODER CREAR OBJETOS

//SI TIENE CONSTRCUTOR VACIO.
public class Ak {

    //ATRIBUTOS DATOS O CARACTERISTICAS DEL OBJETIVO DE MANERA GENERAL
    String tipo;
    int cargador;
    int precision;
    double velocidadCarga;
    double precio;
    int dano;
    double velocidadDisparo;
    
    //CONSTRUCTOR CON UN PARAMETRO
    public Ak(String tipoMandado){
        tipo = tipoMandado;
    }
    
    //CONTSTRUCTOR VACIO
    public Ak(){
        
    }

//METODOS SON LAS ACCIONES / ITERACIONES DEL OBJETO./ MANDA A LLAMAR. 
    public String disparar() {
        return "Te estoy disparando con un daño de " + dano + "pts"; 
//NO ES RECOMENDABLE IMPRIMIR DIRECTAMENTE, 
//POR QUE NO ES NECESARIO YA QUE LO TENEMOS EN NUESTRO PRINCIPAL Y SOLO ESTAMOS MANDANDO A LLAMAR 
// NO ES UNA BUENA PRACTICA, CUANDO QUIERAS MANDAR A LLAMAR DESDE OTRO METODO NO SE VA A PODER 
// ES MEJOR LLAMAR UN VALOR QUE USARLO DIRECTAMENTE, POR QUE UN  METODO NO PUEDE LLAMAR A OTRO METODO.
// TIENE QUE VER CON LA HERENCIA.
    }

    public void cargar() {
    }

    public void apuntar() {
    }

    
    //METODO PREDEFINIDO POR ORACLE, EL VALOR LO RETORNA.
    @Override
    public String toString() {
        return "Ak{" + "tipo=" + tipo + ", cargador=" + cargador + ", precision=" + precision + ", velocidad_carga=" + velocidadCarga + ", precio=" + precio + ", dano=" + dano + '}';
    }
}
