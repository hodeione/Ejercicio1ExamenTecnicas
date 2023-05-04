package Builder;

public class UnidadAdministrativaBuilder implements BaseBuilder {

    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMedioAsistencia;


    @Override
    public BaseBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public BaseBuilder setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    @Override
    public BaseBuilder setTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    @Override
    public BaseIndividual build() {
        return new BaseIndividual();
    }
}
