import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class inherit {

    public String inherit() {
        String command = "pwd";
        System.out.println("Default comand ---> "+command);
        return command;
    }
    // *****************
    private String name="class X";
    public String getName() {
       // name = "Orrey";
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // *****************
    public void getSystemCommand(String args){
        try {
            // Command to execute

            // Create ProcessBuilder instance with command
            ProcessBuilder processBuilder = new ProcessBuilder(args);


            // Start the process
            Process process = processBuilder.start();

            // Read output from the process
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the process to finish
            int exitCode = process.waitFor();

            // Check if the process exited successfully
            if (exitCode == 0) {
                System.out.println("Command executed successfully, command is == "+args);
            } else {
                System.out.println("Command failed with error code: " + exitCode);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }


}
