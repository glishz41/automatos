package JavaUtil;

public class Pattern {
  Integer estado,proximoEstado;
  String simbolo;

public void setPattern(String pattern) {
  String[] aux;
  aux = pattern.split(",");

  estado = Integer.parseInt(aux[0]);
  simbolo = aux[1];
  proximoEstado = Integer.parseInt(aux[2]);
  
  }
}