public class FuncaoTransicao {
Integer estadoAtual;
Integer proxEstado;
String simbolo;

public void setPattern(String pattern) {
    String chars[] = pattern.split(",");
    estadoAtual = Integer.parseInt(chars[0]);
    simbolo = chars[1];
    proxEstado = Integer.parseInt(chars[2]);
    }
}