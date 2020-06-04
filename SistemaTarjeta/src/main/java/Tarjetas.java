
public class Tarjetas {

    int noCuenta;
    String nombre;
    int dia;
    int mes;
    int anio;
    int cv;
    double monto;
    double apartado;
    int deposito;

    public Tarjetas() {

    }

    public Tarjetas(int noCuenta, String nombre, int dia, int mes, int anio, int cv, double monto, double apartado) {
        this.noCuenta = noCuenta;
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.cv = cv;
        this.monto = monto;
        this.apartado = apartado;

    }

    public void depositar(double depositar) {

        this.monto += depositar;

    }

    public void retirar(double retirar) {

        this.monto -= retirar;

    }

    public void eliminarApartado() {

        this.monto += this.apartado;
        this.apartado -= this.apartado;

    }

    public Tarjetas verificarCuenta(int nCuenta, int nip) {

        if (nCuenta == 123123 && nip == 1133) {
            return new Tarjetas(123123, "Eduardo Diaz Flores", 31, 12, 2032, 543, 45987.22, 550);
        } else if (nCuenta == 456789 && nip == 3367) {
            return new Tarjetas(456789, "Kevin Meza Gonzáles", 31, 12, 2032, 544, 360, 5322.23);
        } else {
            return new Tarjetas();
        }
    }

    @Override
    public String toString() {
        return "" + "\n Numero de Cuenta: " + noCuenta
                + "\n Nombre: " + nombre
                + "\n Fecha: " + dia + "/" + mes + "/" + anio + "/" + anio
                + "\n Cv: " + cv
                + "\n Monto: " + monto
                + "\n Apartado: " + apartado;
    }
}
