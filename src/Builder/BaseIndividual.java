package Builder;

public class BaseIndividual  implements BaseBuilder {

        private String nombre;
        private int numeroAmbulancias;
        private double tiempoMedioAsistencia;


        @Override
        public BaseBuilder setNombre(String nombre) {
            return null;
        }

        @Override
        public BaseBuilder setNumeroAmbulancias(int numeroAmbulancias) {
            return null;
        }

        @Override
        public BaseBuilder setTiempoMedioAsistencia(double tiempoMedioAsistencia) {
            return null;
        }

        @Override
    public BaseIndividual build() {
            return null;
        }
    }
