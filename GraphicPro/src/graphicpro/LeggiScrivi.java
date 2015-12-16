
package graphicpro;

import java.io.*;
import java.util.*;

public class LeggiScrivi {
    
    public static ArrayList<String> LeggiFile(){
        ArrayList<String> parole=new ArrayList<>();
        BufferedReader br = null;
        try {
            String Riga;
            br = new BufferedReader(new FileReader("Parole.txt"));
            while ((Riga = br.readLine()) != null){  //finch� la riga � diversa da null, leggila
                parole.add(Riga);
            }
            br.close();             //chiudi il buffer
        }catch (IOException e){
            e.printStackTrace();
        }
        return parole;
    }
    
    public static void ScriviFile(ArrayList<String> parole){
        try{
            File file =new File("Parole.txt");
            if(!file.exists()){
                file.createNewFile();             //controllo se il file non esiste e lo creo
            }
            FileWriter fw = new FileWriter(file);      //apro i buffer con il parametro TRUE
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for(int i=0;i<parole.size();i++)
                pw.println(parole.get(i));                       //scrivo il contenuto
            pw.close();

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }
}