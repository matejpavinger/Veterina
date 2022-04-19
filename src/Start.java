public class Start {

    public static void main(String[] args) {
        Majitel pepa = new Majitel("Pepa","Bořivojova 7");
        Zvire alik = new Zvire(1,"pes","Alik",pepa);
        Zvire rek = null;
        System.out.println(alik);
        System.out.println(rek);
    }
}
