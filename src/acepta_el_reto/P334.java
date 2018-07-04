/*
 En los cómics de cierto galo irreductible, es posible averiguar la procedencia de un personaje a partir de su nombre. Por ejemplo, Astérix, Caius Bonus, Teóric o Plexiglás tienen las terminaciones específicas de galos, romanos, godos y griegos respectivamente.

Los nombres elegidos buscan ser humorísticos, apoyándose a menudo en pronunciaciones parecidas para crear juegos de palabras. Por desgracia, no son siempre fáciles de traducir, y en ocasiones se pierde el sentido. Por ejemplo, el perro de Obelix, Idéfix (o Ideafix, según el cómic) en francés coincide fonéticamente con idée fixe que significa "idea fija". Por su parte, Asurancetúrix, el bardo, en el original es Assurancetourix que suena como assurance tous risques, que significa "seguro a todo riesgo".

Ejemplos de nombres de los diferentes pueblos que aparecen en los cómics son:

    Galos: terminan en -ix: Astérix, Obélix, Panoramix, Idéfix, Asurancetúrix, Abraracúrcix, Caligulaminix.
    Romanos: terminan en -us o -um: Caius Bonus, Gracolinus, Belicus, Nihablarum, Caius Rodrigus, Julius Pompilious, Caligula Minus.
    Godos: terminan en -ic: Teóric, Histéric, Periféric, Clorhídric, Teleféric, Quiméric.
    Griegos: terminan en -as: Plexiglás, Sopaconondas, Fuldeas.
    Normandos: terminan en -af: Olaf Grosenbaf, Soldaf, Paf, Cinematograf, Pataf, Batiscaf, Epitaf, Complementaf, Mataf, Soldaf, Castaniaf.
    Bretones: terminan en -is, -os o -ax: Espikininglis, Cassivellaumos, Bigbos, Buentórax, Relax, Furax, Ántrax, Danlax, Mustax.
    Hispanos: terminan en -ez: Sopalajo de Arrierez, Sueltalamosca y Acelerez, Porrompompero y Fandanguez.
    Indios: terminan en -a: Ahivá, Passayá, Dhalekanya, Fahazada, Majarahatha, Ermahana.
    Pictos: empiezan por Mac: Mac Loch, Mac Abeo, Mac II, Mac Ariño, Mac Mini, Mac Ramé, Mac Uto, Mac Areto, Macario.

 */
package acepta_el_reto;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class P334 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a;
        String nombres;

        a = lector.nextInt();
        lector.nextLine();
        String[] nombre = new String[a];
        for (int i = 0; i < a; i++) {
            nombres = lector.nextLine();
            if (!nombres.startsWith("MAC")) {
                if (nombres.endsWith("IX")) {
                    nombre[i] = "GALO";
                } else if (nombres.endsWith("US") || (nombres.endsWith("UM"))) {
                    nombre[i] = "ROMANO";
                } else if (nombres.endsWith("IC")) {
                    nombre[i] = "GODO";
                } else if (nombres.endsWith("AS")) {
                    nombre[i] = "GRIEGO";
                } else if (nombres.endsWith("AF")) {
                    nombre[i] = "NORMANDO";
                } else if (nombres.endsWith("EZ")) {
                    nombre[i] = "HISPANO";
                } else if (nombres.endsWith("A")) {
                    nombre[i] = "INDIO";
                } else if (nombres.endsWith("IS") || (nombres.endsWith("OS")) || (nombres.endsWith("AX"))) {
                    nombre[i] = "BRETON";
                } else {
                    nombre[i] = "PLUS ULTRA";
                }
            } else if (nombres.startsWith("MAC")) {
                if (nombres.endsWith("IX") || nombres.endsWith("US")
                        || nombres.endsWith("UM") || nombres.endsWith("IC")
                        || nombres.endsWith("AS") || nombres.endsWith("AF")
                        || nombres.endsWith("IS") || nombres.endsWith("OS")
                        || nombres.endsWith("AX") || nombres.endsWith("EZ")
                        || nombres.endsWith("A")) {
                    nombre[i] = "MULATO";
                } else {
                    nombre[i] = "PICTO";
                }
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(nombre[i]);
        }
    }
}
