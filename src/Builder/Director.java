package Builder;

public class Director {
   public void construirUnidadAdministrativa(BaseBuilder baseBuilder, BaseBuilder baseBuilder2, UnidadAdministrativaBuilder unidadBuilder) {
      baseBuilder.setNombre("Base 1");
        baseBuilder.setNumeroAmbulancias(2);
        baseBuilder.setTiempoMedioAsistencia(10.0);
        baseBuilder2.setNombre("Base 2");
        baseBuilder2.setNumeroAmbulancias(3);
        baseBuilder2.setTiempoMedioAsistencia(15.0);

   }


}
