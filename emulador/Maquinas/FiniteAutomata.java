 package Maquinas;

import JavaUtil.Pattern;

public class FiniteAutomata {
  public String simbolo;
  public Integer estadoInicial;
  public Integer[] estadosFinais;
  public Pattern[] pattern;

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  public void setEstadoInicial(Integer estadoInicial) {
    this.estadoInicial = estadoInicial;
  }

  public void setEstadosFinais(Integer[] estadosFinais) {
    for (int index = 0; index < estadosFinais.length; index++) {
      this.estadosFinais[index] = estadosFinais[index];
    }
  }

  public void setPatterns(Pattern[] pattern) {
    for (int index = 0; index < pattern.length; index++) {
      this.pattern[index] = pattern[index];
    }
  }
}