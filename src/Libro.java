public class Libro {
    public String titolo;
    public String autore;
    public int numPagine;

    public Libro(String titolo, String autore, int numPagine) {
        this.titolo = titolo;
        this.autore = autore;
        this.numPagine = numPagine;
    }

    public void stampaDettagli() {
        String msg = "titolo: " + this.titolo;
        msg += " autore: " + this.autore;
        msg += " numPagine: " + this.numPagine;
        System.out.println(msg);
    }

}
