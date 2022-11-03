import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FiniteAutomataD extends Exception {
    final String type = "FAD";
    Integer estadoInicial;
    Integer estadosFinais[];
    FuncaoTransicao[] pattern;


    public FiniteAutomataD() {
        this.estadoInicial = 0;
        this.estadosFinais = new Integer[0];  
    }

            public FiniteAutomataD(File arquivo) throws Exception {

                // verifica se o arquivo existe
                if(arquivo == null||!arquivo.exists()||!arquivo.getName().endsWith(".txt")) {
                    throw new Exception("Arquivo inválido");
                } else {

                    // abre o arquivo de texto para leitura
                    try {
                        BufferedReader textBuffer = new BufferedReader(new FileReader("texto.txt"));
                        String linha = "";

                    // le a primeira linha e verifica se o tipo de automato é válido
                        linha = textBuffer.readLine();
                        if(!linha.contains("AFD")) {
                            System.out.println("Tipo de automato inválido");
                        }
                        else {
                            while (true) {

                                //verifica se a linha não é vazia ou se já foi lida pela primeira etapa de verificação
                                if (linha != null && !linha.contains("AFD")) {
                                this.estadoInicial = Integer.parseInt(linha);
                                linha = textBuffer.readLine();
                                
                                String estados[] = linha.split("|");
                                
                                //corta a linha de estados finais e atribui ao vetor estadosFinais.
                                for (int i = 0; i < estados.length; i++) {
                                    estadosFinais[i] = Integer.parseInt(estados[i]);
                                }
                                linha = textBuffer.readLine();
                                textBuffer.close();
                                setMapaTransicao(linha);
                                
                                } else {
                                throw new Exception("Arquivo inválido");
                            }
                        }
                    }   textBuffer.close();
                }
                        catch (Exception e) {
                        System.out.println("Erro ao ler o arquivo");
                        }
                
                    //
                }           
        }

    public void setMapaTransicao(String linha) {
    
    //seta as transicoes em patterns
    String transicoes[];
    transicoes = linha.split("\\|");

    for (int i = 0; i < transicoes.length; i++) {
        pattern[i].setPattern(transicoes[i]);
    }
        
    }
}
