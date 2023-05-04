package Builder;

import java.util.ArrayList;
import java.util.List;

public class UnidadAdministrativa extends BaseEmergencia{
    private List<BaseEmergencia> bases;

    public UnidadAdministrativa(String nombre) {
        super(nombre);
        this.bases = new ArrayList<>();
    }

    public void agregarBase(BaseEmergencia base) {
        bases.add(base);
    }

    @Override
    public int obtenerNumeroAmbulancias() {
        int totalAmbulancias = 0;
        for (BaseEmergencia base : bases) {
            totalAmbulancias += base.obtenerNumeroAmbulancias();
        }
        return totalAmbulancias;
    }

    @Override
    public double obtenerTiempoMedioAsistencia() {
        double tiempoTotal = 0;
        for (BaseEmergencia base : bases) {
            tiempoTotal += base.obtenerTiempoMedioAsistencia();
        }
        return tiempoTotal / bases.size();
    }
}
