import java.util.Arrays;

public class Studente {
    public String nome;
    public String cognome;
    public double[] listaVoti = {10, 9.5, 10, 9.5, 10};

    public Studente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    /**
     * Calcola e restituisce la media dei voti
     * @return media dei voti
     */
    public double calcolaMediaVoti() {
        double sommaVoti = this.calcolaSommaVoti();
        int numeroVoti = this.listaVoti.length;
        return sommaVoti / numeroVoti;
    }

    /**
     * Calcola la somma dei voti
     * @return somma dei voti
     */
    public double calcolaSommaVoti() {
        int somma = 0;
        for(double voto : this.listaVoti) {
            somma += voto;
        }
        return somma;
    }

    public void stampaDettagli() {
        System.out.println("nome: " +this.nome+ " cognome: " + this.cognome);
        System.out.println(" lista voti: " + Arrays.toString(this.listaVoti));
        System.out.println(" media voti: " + this.calcolaMediaVoti());
    }
}
