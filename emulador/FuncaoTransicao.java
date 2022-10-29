public class FuncaoTransicao {
    Object simbolo[];
    Object conjuntoEstado[];
    Object alfabeto[];
    Object pattern[];
    int estado = 0;
    
    public Object FuncaoTransicaoaAD(Object estadoAtual, Object simbolo[], Object conjuntoEstado[]) {
    int limite = 0;
    //verificação de tamanho (se estiver no final, para)
    if(limite == simbolo.length) { 
    return estadoAtual;
    } else {

    if(simbolo[limite] == pattern[limite]) {
    estadoAtual = conjuntoEstado[estado];
    limite++;
    estado++;
    } else {
    limite++;   
    FuncaoTransicaoaAD(estadoAtual, simbolo, conjuntoEstado);

    }
































   /*  for (int i = 0; i < pattern.length; i++) {
        if (alfabeto[i] == simbolo[i] && pattern[i] == simbolo[i]) {
            return proximoEstado;
        } else {
            return estado;
        }
        this.estado = proximoEstado;
    }
    else {

    System.out.println("O símbolo "+simbolo+" não pertence ao alfabeto");
    }
    limite++;
    FuncaoTransicaoaAD(estado, (Object[]) simbolo[limite], proximoEstado);
            } */
    }
    

    return null;
    }
}