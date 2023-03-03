package application;

import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // File e Scanner
        /*
        File file = new File("/home/natasha-carmo/Doc/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
         */

        // FileReader e BufferedReader
        /*
        String path = "/home/natasha-carmo/Doc/in.txt";
        BufferedReader br = null;
        FileReader fr = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

         */

        // try-with-resources
        /*
        String path = "/home/natasha-carmo/Doc/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) { //strings instanciadas direto nos argumentos do try
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        */

        // FileWriter e BufferedWriter
        /*
        String[] lines = new String[] { "Cause sometimes I look in her eyes","And that's where I find a glimpse of us" };
        String path = "/home/natasha-carmo/Doc/out.txt"; // criando novo arquivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // Cada vez que o código for rodado o arquivo vai ser recriado, pra isso não acontecer
            // é só usar new FileWriter(path, true). Então ele vai atualizar e anexar informações novas.
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        */

        // Manipulando pastas com File
        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); //

        System.out.println("FOLDERS:");

        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        // Cria uma subpasta
        boolean success = new File(strPath + "Subpasta").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();

        */

        // Informações do caminho do arquivo
        /*

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getName: " + path.getName());
        sc.close();

        */
    }


}
