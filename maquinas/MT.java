package maquinas;

import pattern.Patterns;

public class MT {
    Integer estadosFinais[], estadoInicial, estadoAtual, node = 0;
    String sentido, dados[],fita[], type = "M";
    public Patterns[] patterns;


    public MT(String[] specs, String[] input) {
        //construtores da classe
        this.dados = input;
        String estadoInicial = specs[1];
        this.estadoInicial = Integer.parseInt(estadoInicial);
        this.fita = new String[100];
        String[] estadosFinais = specs[2].split(",");
        this.estadosFinais = new Integer[estadosFinais.length];
        for (int i = 0; i < estadosFinais.length; i++) {
            this.estadosFinais[i] = Integer.parseInt(estadosFinais[i]);
        }

        String[] patterns = specs[3].split(";");
        this.patterns = new Patterns[patterns.length];
        for (int i = 0; i < patterns.length; i++) {
            this.patterns[i] = new Patterns(patterns[i], type);
        }
    }
    public Boolean run() {
        //metodo que executa a maquina
        System.out.println("Estado Inicial em -> "+estadoInicial);
        for (int i = 0; i < dados.length; i++) {
            String input = dados[i];
            estadoAtual = estadoInicial;
            for (int j = 0; j < input.length(); j++) {
                estadoAtual = proximoEstado(estadoAtual, input.charAt(j));
                System.out.println("sentido"+this.patterns[i].sentido);
                if(this.patterns[i].sentido == "d") {
                    System.out.println("Foi para a direita");
                    node++;
                }
                if(this.patterns[i].sentido == "e") {
                    System.out.println("Foi para a esquerda");
                    node--;
                }
                //verifica se o estado atual eh nulo ou seja se há transição
                System.out.println("O Estado eh -> "+estadoAtual+" ---- Simbolo: "+input.charAt(j));
                if(estadoAtual == null) {
                    System.out.println("REJEITADO POR NAO TER TRANSICAO");
                    return false;
                }
            }
        }
        System.out.println("ESTADO FINAL DA FITA :");
        for (int i = 0; i < fita.length; i++) {
            if(fita[i]!=null){
                System.out.println(fita[i]);
                }
            }
        //verifica se o estado atual eh final        
        if (isFinal(estadoAtual)) {
            System.out.println("\nACEITA");
            return true;
        } else {
            System.out.println("\nREJEITA");
            return false;
        }
    }
    public Integer proximoEstado(Integer estadoAtual, Character simbolo) {
        for (int i = 0; i < patterns.length; i++) {
            if (patterns[i].estado == estadoAtual && patterns[i].simbolo.equals(simbolo.toString())) {
                escrever(patterns[i].escreve);
                return patterns[i].proximoEstado;
            }
        }
        return null;
    }
    public Boolean isFinal(Integer estadoAtual) {
        for (int i = 0; i < estadosFinais.length; i++) {
            if (estadosFinais[i] == estadoAtual) {
                return true;
            }
        }
        return false;
    }
    public void escrever(String escreve) {
        fita[node] = escreve;
        System.out.println("Escreveu: "+escreve+" na posicao "+node);
    }
}
