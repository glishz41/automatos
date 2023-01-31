package pattern;

public class Patterns {
    public Integer estado;
    public String simbolo, empilha ="", desempilha ="", sentido ="", escreve ="";
    public Integer proximoEstado;


    public Patterns(String pattern, String type) {
        if(type == "F") {
        String[] patternArray = pattern.split(",");
        this.estado = Integer.parseInt(patternArray[0]);
        this.simbolo = patternArray[1];
        this.proximoEstado = Integer.parseInt(patternArray[2]);
        }
        else if (type == "P"){
            String[] patternArray = pattern.split(",");
            this.estado = Integer.parseInt(patternArray[0]);
            this.simbolo = patternArray[1];
            this.empilha = patternArray[2];
            this.desempilha = patternArray[3];
            this.proximoEstado = Integer.parseInt(patternArray[4]);
        } else if (type == "M") {
            String[] patternArray = pattern.split(",");
            this.estado = Integer.parseInt(patternArray[0]);
            this.simbolo = patternArray[1];
            this.escreve = patternArray[2];
            this.sentido = patternArray[3];
            this.proximoEstado = Integer.parseInt(patternArray[4]);

        }
    }
}
