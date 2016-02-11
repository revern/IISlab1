/**
 * Created by almaz on 09.02.2016.
 */
//  Task 1
public class Sreda {
    private Razmer razmer;
    private Forma forma;
    private RazmesheniyeMusora razmesheniyeMusora;

    public Razmer getRazmer() {
        return razmer;
    }

    public void setRazmer(Razmer razmer) {
        this.razmer = razmer;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public RazmesheniyeMusora getRazmesheniyeMusora() {
        return razmesheniyeMusora;
    }

    public void setRazmesheniyeMusora(RazmesheniyeMusora razmesheniyeMusora) {
        this.razmesheniyeMusora = razmesheniyeMusora;
    }

    public Sreda (Razmer r, Forma f, RazmesheniyeMusora rm){
        setRazmer(r);
        setForma(f);
        setRazmesheniyeMusora(rm);
    }

}
