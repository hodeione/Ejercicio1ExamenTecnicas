package Builder;

public class MainBack {
    public static void main(String[] args) {
        Director director = new Director();
        BaseEmergencia baseEmergencia = new BaseEmergencia("Base 1") {
            @Override
            public int obtenerNumeroAmbulancias() {
                return 0;
            }

            @Override
            public double obtenerTiempoMedioAsistencia() {
                return 0;
            }
        };
       director.construirUnidadAdministrativa(new BaseIndividualBuilder(), new BaseIndividual(), new UnidadAdministrativaBuilder());
    }
}