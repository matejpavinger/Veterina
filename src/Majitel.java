public class Majitel {

    private String jmeno;
    private String adresa;

    public Majitel(String jmeno, String adresa) {
        this.jmeno = jmeno;
        this.adresa = adresa;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Majitel{" +
                "jmeno='" + jmeno + '\'' +
                ", adresa='" + adresa + '\'' +
                '}';
    }
}
