package ep1.pilhaingenua;
import java.io.*;
import ep1.ReadFiles;

public class TestaPilhaIngenua {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/tlfarias/faku/ep1/entradas/tarefas99000.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ReadFiles rf = new ReadFiles();
        PilhaIngenua p = new PilhaIngenua();
        long i = System.currentTimeMillis();
        
        String st;
        rf.cleanFile("SaidaPilhaIngenua.txt");
        while ((st = br.readLine()) != null){            
            if(!(st.isEmpty())){
                p.add(Integer.parseInt(st));
            }
            else {
                p.remove();                             
            }            
        }
        br.close();
        System.out.println("Tempo em milissegundos da pilha ingênua: " + (System.currentTimeMillis() - i));
        // for(int j = p.pilha.length - 1; j >= 0; j--){
        //     if(p.pilha[j] != null) rf.read(Integer.toString(p.pilha[j]), "SaidaPilhaIngenua.txt");
        // }        
    }
}
