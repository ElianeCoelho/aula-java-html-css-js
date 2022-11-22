package Controller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
public class LoadPage {

    public void getPage(URL url, File file) throws IOException {
        BufferedReader in =
                new BufferedReader(new InputStreamReader(url.openStream()));

        BufferedWriter out = new BufferedWriter(new FileWriter(file));

        String inputLine;

        while ((inputLine = in.readLine()) != null) {
		
            // Imprime página no console
            System.out.println(inputLine);
			
            // Grava pagina no arquivo
            out.write(inputLine);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }



    public static void main(String[] args) {
        URL url = null;
        File file = new File("tutorial.html");
        try {
            url = new URL("https://www.msn.com/pt-br/esportes/fifa-world-cup/os-jogadores-mais-gatos-da-copa-do-mundo-de-2022/ss-AA14ndic?ocid=msedgntp&pc=W129&cvid=4a44fb8daceb4cf787dd242776b34071");
            new LoadPage().getPage(url, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    
    

