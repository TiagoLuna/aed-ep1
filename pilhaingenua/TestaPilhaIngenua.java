package ep1.pilhaingenua;
import java.io.*;
import ep1.ReadFiles;

public class TestaPilhaIngenua {
    public static void main(String[] args) throws Exception{
        File file = new File("/home/tlfarias/faku/ep1/entradas/tarefas10000.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ReadFiles rf = new ReadFiles();
        PilhaIngenua p = new PilhaIngenua();
        long i = System.currentTimeMillis();
        
        String st;
        int count = 0;
        rf.cleanFile("SaidaPilhaIngenua.txt");
        while ((st = br.readLine()) != null){            
            if(!(st.isEmpty())){
                p.add(Integer.parseInt(st));
                count++;
            }
            else {
                rf.read(Integer.toString(p.pilha[count - 1]), "SaidaPilhaIngenua.txt");
                p.remove();
                count--;                                
            }            
        }
        br.close();
        System.out.println("Tempo em milissegundos da pilha ingênua: " + (System.currentTimeMillis() - i));
    }
}
