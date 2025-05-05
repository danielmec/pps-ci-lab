/**
 * Una semplice classe Java di esempio.
 * Ricordati di rinominare la classe con un nome che non entri in conflitto
 * con i nomi scelti dai tuoi compagni di gruppo.
 */
public class meco {
    
    private final String name;
    
    /**
     * Costruttore della classe.
     * @param name un nome da memorizzare
     */
    public meco(String name) {
        this.name = name;
    }
    
    /**
     * Metodo che restituisce un messaggio di saluto.
     * @return una stringa contenente un saluto
     */
    public String sayHello() {
        return "Ciao, sono " + this.name + "!";
    }
    
    /**
     * Metodo main per test rapido della classe.
     * @param args argomenti da linea di comando (non utilizzati)
     */
    public static void main(String[] args) {
        meco example = new meco("Studente");
        System.out.println(example.sayHello());
    }
}
