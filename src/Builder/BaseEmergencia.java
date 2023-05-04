package Builder;

public abstract class BaseEmergencia {
    protected String nombre;

    public BaseEmergencia(String nombre) {
        this.nombre = nombre;
    }

    public abstract int obtenerNumeroAmbulancias();
    public abstract double obtenerTiempoMedioAsistencia();
}
