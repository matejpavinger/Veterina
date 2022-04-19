public class Zvire {

    private int invCislo;
    private String druh;
    private String jmeno;
    private Majitel majitel;

    public Zvire(int invCislo,String druh, String jmeno){
        this.invCislo = invCislo;
        this.druh = druh;
        this.jmeno = jmeno;
    }

    public Zvire(int invCislo, String druh, String jmeno, Majitel majitel) {
        this.invCislo = invCislo;
        this.druh = druh;
        this.jmeno = jmeno;
        this.majitel = majitel;
    }

    public int getInvCislo() {
        return invCislo;
    }

    public String getDruh() {
        return druh;
    }

    public String getJmeno() {
        return jmeno;
    }

    public Majitel getMajitel() {
        return majitel;
    }

    public void setMajitel(Majitel majitel) {
        this.majitel = majitel;
    }

    @Override
    public String toString() {
        return "Zvire{" +
                "invCislo=" + invCislo +
                ", druh='" + druh + '\'' +
                ", jmeno='" + jmeno + '\'' +
                ", majitel=" + majitel +
                '}';
    }
}
