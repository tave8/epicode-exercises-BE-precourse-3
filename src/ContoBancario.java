import java.util.Random;

public class ContoBancario {
    public long numeroConto;
    public double saldo;

    /**
     * Il numero conto viene generato internamente.
     */
    public ContoBancario() {
        this.numeroConto = this.generaNumeroConto();
        this.saldo = 0;
    }

    /**
     * @param numeroConto numero del conto
     */
    public ContoBancario(long numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = 0;
    }

    public void deposita(double denaroDaDepositare) {
        this.saldo += denaroDaDepositare;
    }

    public void preleva(double denaroDaPrelevare) {
//        se il conto + già in rosso, non prelevare
        if(this.saldo <= 0) {
            System.out.println("il saldo è già negativo o zero.");
            return;
        }

        double saldoDopoPrelievo = this.saldo - denaroDaPrelevare;


//        se il saldo attuale meno denaro da prelevare
//        da un numero negativo, non puoi prelevare
        if(saldoDopoPrelievo < 0) {
            System.out.println("il tuo saldo non è abbastanza per prelevare questa quantità.");
            return;
        }

//        nessun problema: preleva
        this.saldo -= denaroDaPrelevare;
    }


    public void stampaSaldo() {
        String msg = "il tuo saldo attuale è " + this.saldo;
        System.out.println(msg);
    }

    /**
     *
     * @return un numero unico di un conto bancario
     */
    public long generaNumeroConto() {
        Random rand = new Random();
        return rand.nextInt(1000000);
    }

}
