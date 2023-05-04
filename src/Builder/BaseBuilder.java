package Builder;

public interface BaseBuilder {
    public BaseBuilder setNombre(String nombre);
    public BaseBuilder setNumeroAmbulancias(int numeroAmbulancias);
    public BaseBuilder setTiempoMedioAsistencia(double tiempoMedioAsistencia);
    public BaseIndividual build();

}
