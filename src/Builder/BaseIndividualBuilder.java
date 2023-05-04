package Builder;

public class BaseIndividualBuilder  implements BaseBuilder {

    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMedioAsistencia;


    @Override
    public BaseIndividualBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public BaseIndividualBuilder setNumeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    @Override
    public BaseIndividualBuilder setTiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    @Override
    public BaseIndividual build() {
        return new BaseIndividual();
    }

}
