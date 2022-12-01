import java.io.File;
import java.util.*;
import JavaUtil.*;
import Maquinas.*;

public class Main {
  public static void main(String[] args) {
    File file = new File(args[0]);
    List<String> listaDados = Util.readFile(file);

    switch (listaDados.get(0)) {
      case "F":
        FiniteAutomata finiteAutomata = new FiniteAutomata();
        Util.tratamentoDados(listaDados, finiteAutomata);
        System.out.println("Simbolo: ");
        System.out.println(finiteAutomata.estadoInicial);
        for (int index = 0; index < finiteAutomata.estadosFinais.length; index++) {
          System.out.println("Estado final " + index + ": " + finiteAutomata.estadosFinais[index]);
        }

      case "P":
        PushdownAutomata pushdownAutomata = new PushdownAutomata();
      case "T":
        TuringMachine turingMachine = new TuringMachine();
    }
  }
}
