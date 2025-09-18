import javax.swing.JOptionPane;


public class  UsingJOptionPaneDialogs {

    public static void main(String[] args) {

       
        boolean confirmed = false;

        do {
           
            String name = JOptionPane.showInputDialog(
                null, 
                "Please enter your name:", 
                "Name Input", 
                JOptionPane.QUESTION_MESSAGE 
            );

           
            if (name == null) {        
                System.exit(0);
            }
            
            // Check if the user entered an empty name.
            if (name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Name cannot be empty. Please try again.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                );
                continue;
            }

           
            int confirmationResult = JOptionPane.showConfirmDialog(
                null, 
                "Do you want to show your name: \"" + name + "\"?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION 
            );

            if (confirmationResult == JOptionPane.YES_OPTION) {                
                confirmed = true;

                JOptionPane.showMessageDialog(
                    null, // Parent component
                    "Hello, " + name + "!", // Message
                    "Name Display", // Title
                    JOptionPane.INFORMATION_MESSAGE // Icon type
                );
            }
            
        } while (!confirmed);

        System.out.println("Program finished.");
    }
}



