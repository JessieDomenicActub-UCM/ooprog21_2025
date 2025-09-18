import javax.swing.JOptionPane;


public class  UsingJOptionPaneDialogs {

    public static void main(String[] args) {

       
        boolean confirmed = false;

        do {
            // 1. Prompt the user for their name using an input dialog.
            String name = JOptionPane.showInputDialog(
                null, // Parent component (null for default placement)
                "Please enter your name:", 
                "Name Input", 
                JOptionPane.QUESTION_MESSAGE 
            );

            // Handle the case where the user clicks "Cancel" or closes the dialog.
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

            // 2. Display a confirmation dialog to ask if the name should be shown.
            int confirmationResult = JOptionPane.showConfirmDialog(
                null, 
                "Do you want to show your name: \"" + name + "\"?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION // Button options (Yes/No)
            );

            if (confirmationResult == JOptionPane.YES_OPTION) {
                // If the user confirms, set the flag to true to exit the loop.
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

