
package leitor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeitorDados{
    
    public String[] lerdados(String args){
   
        
        try {   
           List<String> dados = Files.readAllLines(Paths.get(args));
           String[] dadosArray = dados.toArray(new String[0]);
           return dadosArray;

        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo");
        }
        return null;
    }
}