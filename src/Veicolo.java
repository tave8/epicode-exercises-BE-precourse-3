public class Veicolo {
//    attributi
    public String marca;
    public String modello;
    public int annoProduzione;
    public boolean inMovimento;

//    lista costruttori
    public Veicolo(String marca, String modello, int annoProduzione) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = annoProduzione;
        this.inMovimento = false;
    }

    public Veicolo(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
        this.annoProduzione = 2024;
        this.inMovimento = false;
    }

//    lista metodi
    public void print() {
        System.out.println("marca: " + this.marca);
        System.out.println("modello: " + this.modello);
    }

    public void avvia() {
        if(!this.inMovimento) {
            this.inMovimento = true;
            System.out.println("avviato il veicolo");
        }
        else {
            System.out.println("veicolo era già in movimento");
        }
    }

    public void ferma() {
        if(this.inMovimento) {
            this.inMovimento = false;
            System.out.println("veicolo fermato");
        } else {
            System.out.println("veicolo era già fermo");
        }
    }
}
