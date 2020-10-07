package ep1.sLinkedList;
import java.io.*;
import ep1.ReadFiles;

public class TestaListaSimplesmenteLigada {
    public static void main(String[] args) throws Exception{
        /* Define arquivo, leitores e referências às outras classes */
        File file = new File("/home/tlfarias/faku/ep1/entradas/tarefas95000.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ReadFiles rf = new ReadFiles();
        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
        long i = System.currentTimeMillis();
        
        /* Faz leitura linha a linha adicionando e removendo conforme condição imposta */
        String st;
        rf.cleanFile("SaidaListaSimplesLigada.txt");
        while ((st = br.readLine()) != null){            
            if(!(st.isEmpty())){
                list.addFirst(new Node(st, null));
            }
            else {
                list.removeFirst();
            }            
        }
        br.close();

        /* Imprime o tempo e popula o arquivo com o resultado da pilha */
        System.out.println("Tempo em milissegundos da lista simplesmente ligada: " + (System.currentTimeMillis() - i));
        rf.read(list.toString(), "SaidaListaSimplesLigada.txt");
    }
}