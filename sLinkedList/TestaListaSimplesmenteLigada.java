package ep1.sLinkedList;
import java.io.*;
import ep1.ReadFiles;

public class TestaListaSimplesmenteLigada {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/tlfarias/faku/ep1/entradas/tarefas10000.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ReadFiles rf = new ReadFiles();
        ListaSimplesmenteLigada list = new ListaSimplesmenteLigada();
        long i = System.currentTimeMillis();
        
        String st;
        rf.cleanFile("SaidaListaSimplesLigada.txt");
        while ((st = br.readLine()) != null){            
            if(!(st.isEmpty())){
                list.addFirst(new Node(st, null));
            }
            else {
                rf.read(list.toString(), "SaidaListaSimplesLigada.txt");
                list.removeFirst();
            }            
        }
        br.close();
        System.out.println("Tempo em milissegundos da lista simplesmente ligada: " + (System.currentTimeMillis() - i));
    }
}