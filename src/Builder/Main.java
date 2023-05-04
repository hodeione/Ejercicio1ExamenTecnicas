package Builder;

public class Main {

    public static void main(String[] args) {
        BaseIndividualBuilder baseBuilder = new BaseIndividualBuilder();
        UnidadAdministrativaBuilder unidadBuilder = new UnidadAdministrativaBuilder();
        Director director = new Director();

        director.construirUnidadAdministrativa(baseBuilder, baseBuilder, unidadBuilder);
    }

}
