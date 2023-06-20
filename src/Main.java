// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //if BASE
        boolean piove = false;

        if(piove){
            System.out.println("prendi l'ombrello");
        }

        //if/else BASE
        int numero = 10;

        if (numero > 0) {
            System.out.println("Il numero è positivo.");
        } else {
            System.out.println("Il numero è negativo o zero.");
        }

        //if/if-else/else AVANZATO
        int punteggio = 85;

        if (punteggio >= 90) {
            System.out.println("Hai ottenuto un voto eccellente!");
        } else if (punteggio >= 80) {
            System.out.println("Hai ottenuto un buon voto.");
        } else if (punteggio >= 70) {
            System.out.println("Hai ottenuto un voto sufficiente.");
        } else {
            System.out.println("Hai ottenuto un voto insufficiente.");
        }

        //if/else nested (annidato)
        int eta = 25;
        boolean haPatente = true;

        if (eta >= 18) {
            if (haPatente) {
                System.out.println("Puoi guidare!");
            } else {
                System.out.println("Devi avere la patente per poter guidare.");
            }
        } else {
            System.out.println("Sei troppo giovane per guidare.");
        }


        //ESERCIZI:
        // modificare il primo esempio (if else base) in maniera da gestire anche se lo zero sia == a 0, infatti nell'esempio nel manin
        //il caso in cui il numero sia == a 0 , è accorpato al casop (condizione) in cui il numero sia negativo (numero<0)


        //secondo esercizio
        //prova a togliere gli else e a creare tutti blocchi if separati dell'if elze avanzato, e nota la sequenzialita e differenze nell'esecuzione
        // (usa il debug)


        //terzo esercizio
        // aggiungiamo un boleano chiamato "isInNapoli"== true, e aggiungiamo 'i caso' che se anche non ha la patente e i 18 anni, puo guidare
    }
}