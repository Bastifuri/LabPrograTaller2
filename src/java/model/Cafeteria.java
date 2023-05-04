
package Model;

/**
 *
 * @author Basti
 */
class Cafeteria {
    private String nombreCafeteria;
    private String dirección;
    private String redessociales;

    public String getNombreCafeteria() {
        return nombreCafeteria;
    }

    public void setNombreCafeteria(String nombreCafeteria) {
        this.nombreCafeteria = nombreCafeteria;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getRedessociales() {
        return redessociales;
    }

    public void setRedessociales(String redessociales) {
        this.redessociales = redessociales;
    }

    public Cafeteria(String nombreCafeteria, String dirección, String redessociales) {
        this.nombreCafeteria = nombreCafeteria;
        this.dirección = dirección;
        this.redessociales = redessociales;
    }
    
}
