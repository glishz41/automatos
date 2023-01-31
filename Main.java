

import leitor.*;
import maquinas.AFD;
import maquinas.AP;
import maquinas.MT;

public class Main {
    public static void main(String[] args) {
    LeitorDados leitor = new LeitorDados();
    String[] specs = leitor.lerdados(args[0]);
    String[] input= leitor.lerdados(args[1]);

    switch (specs[0]) {
        case "F":
            AFD afd = new AFD(specs, input);
            afd.run();
            break;
        case "P":
            AP ap = new AP(specs, input);
            ap.run();
            break;
        case "M":
            MT mt = new MT(specs, input);
            mt.run();
            break;
        default:
            System.out.println("Erro ao ler arquivo");
            break;
        }
    }
}