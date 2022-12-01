package JavaUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import Maquinas.*;

public class Util {
  

  // lê o arquivo
  public static List<String> readFile(File file) {
    try {
      List<String> listaDados;
      listaDados = new ArrayList<String>(Files.readAllLines(file.toPath()));
      return listaDados;
      
    } catch (IOException e) {
      System.out.println("Erro na leitura do input 1");
    }
    return null;
    }
    public static void tratamentoDados(List<String> listaDados, FiniteAutomata maquina) {
    Integer auxI[] = {};
      
    ///setando o estado inicial
    maquina.setEstadoInicial(Integer.parseInt(listaDados.get(1)));
    String aux[] = (listaDados.get(2)).split("|");

      
    ///convertendo o vetor e setando os estados finais
    for (int index = 0; index < aux.length; index++) {
    auxI[index] = Integer.parseInt(aux[index]);
}
    maquina.setEstadosFinais(auxI);

    Pattern[] pattern = {};
    ///convertendo os patterns e setando
    String[] patterns = (listaDados.get(3)).split("|");
    for (int index = 0; index < patterns.length; index++) {
    pattern[index].setPattern(patterns[index]);
}
    maquina.setPatterns(pattern);
    
    }
      public static void tratamentoDados(List<String> listaDados, PushdownAutomata maquina) {
    
    }
      public static void tratamentoDados(List<String> listaDados, TuringMachine maquina) {
    
    }
  }
