import java.io.IOException;

public class ShutdownComputer {

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("shutdown -s -t 0");
            process.waitFor();

            System.out.println("Компьютер выключается...");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}