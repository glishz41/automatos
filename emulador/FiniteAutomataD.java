import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FiniteAutomataD extends Exception {
    final String type = "FAD";
    Integer estadoInicial;
    ArrayList<String> alfabeto;
    ArrayList<Integer> estadosFinais;
    Map<Integer, String> mapaTransicoes = new HashMap<Integer, String>();

    public FiniteAutomataD() {
        this.estadoInicial = 0;
        this.alfabeto = new ArrayList<String>();
        this.estadosFinais = new ArrayList<Integer>();
        mapaTransicoes = new HashMap<Integer, String>();
    }
            public FiniteAutomataD(File arquivo) throws Exception {
                if(arquivo == null||!arquivo.exists()||!arquivo.getName().endsWith(".txt")) {
                    throw new Exception("Arquivo inválido");
                }
                else {

                    // abre o arquivo de texto para leitura
                    try {
                        BufferedReader buffRead = new BufferedReader(new FileReader("texto.txt"));
                        String linha = "";

                    // le a primeira linha e verifica se o tipo de automato é válido
                        linha = buffRead.readLine();
                        if(!linha.contains("AFD")) {
                            System.out.println("Tipo de automato inválido");
                            java.lang.System.exit(1);
                        }

                        else {
                            while (true) {

                    //verifica se a linha não é vazia ou se já foi lida pela primeira etapa de verificação

                                if (linha != null && !linha.contains("AFD")) {
                                this.estadoInicial = Integer.parseInt(linha);
                                linha = buffRead.readLine();
                                
                                for (int i = 0; i < linha.length(); i++) {
                                estadosFinais.add(Integer.parseInt(linha.charAt(i)+""));
                                }
                                
                                linha = buffRead.readLine();


                                } else
                                    break;
                                linha = buffRead.readLine();
                            }
                            buffRead.close();
                        }  
                    }
                        catch (Exception e) {
                            System.out.println("Erro ao ler o arquivo");
                        }
                    //
                }           
        }

    public void setAutomato(String linha) throws Exception {

    }
}
