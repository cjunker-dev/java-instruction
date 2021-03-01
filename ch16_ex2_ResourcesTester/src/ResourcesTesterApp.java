import java.io.*;

public class ResourcesTesterApp {

    public static void main(String[] args) throws IOException {
        String s1 = readLineWithResources();
        String s2 = readLineWithFinally();
    }

    public static String readLineWithResources() {
        System.out.println("Starting readLineWithResources() method.");

        try (BufferedReader in = new BufferedReader(
                new FileReader("products.txt"))){
            
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            return null;
        }
    }

    public static String readLineWithFinally() throws IOException {
        System.out.println("Starting readLineWithFinally() method.");
        BufferedReader in = new BufferedReader(
                			new FileReader("products.txt"));
        String event = "";
        try {
           
            String s = in.readLine();
            return s;
        } catch (IOException e) {
            System.out.println(e.toString());
            event = "File not found.";
            return null;
        }
        finally {
        	try {
        	in.close();
        	event = "file was closed";
        	}
        	catch (IOException e) {
        		event = "file wasn't closed.";
        	}
        System.out.println(event);
        }
    	

    }
}
