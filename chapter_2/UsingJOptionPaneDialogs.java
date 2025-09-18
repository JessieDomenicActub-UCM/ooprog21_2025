import javax.swing.JOptionPane;

/**
 * A Java program that uses JOptionPane to interact with the user.
 * It prompts for a name, then confirms if the name should be displayed.
 * The program will loop back to the input dialog if the user does not confirm.
 */
public class  UsingJOptionPaneDialogs {

    public static void main(String[] args) {

        // Use a boolean flag to control the main loop.
        boolean confirmed = false;

        // The do-while loop ensures the program runs at least once and continues
        // until the user confirms they want to display their name.
        do {
            // 1. Prompt the user for their name using an input dialog.
            String name = JOptionPane.showInputDialog(
                null, // Parent component (null for default placement)
                "Please enter your name:", // Message to display
                "Name Input", // Title of the dialog
                JOptionPane.QUESTION_MESSAGE // Icon type
            );

            // Handle the case where the user clicks "Cancel" or closes the dialog.
            if (name == null) {
                // User canceled, exit the program gracefully.
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
                // Continue to the next iteration of the loop without asking for confirmation.
                continue;
            }

            // 2. Display a confirmation dialog to ask if the name should be shown.
            int confirmationResult = JOptionPane.showConfirmDialog(
                null, // Parent component
                "Do you want to show your name: \"" + name + "\"?", // Message
                "Confirmation", // Title
                JOptionPane.YES_NO_OPTION // Button options (Yes/No)
            );

            // 3. Check the user's response.
            if (confirmationResult == JOptionPane.YES_OPTION) {
                // If the user confirms, set the flag to true to exit the loop.
                confirmed = true;

                // 4. Display the name in a message dialog.
                JOptionPane.showMessageDialog(
                    null, // Parent component
                    "Hello, " + name + "!", // Message
                    "Name Display", // Title
                    JOptionPane.INFORMATION_MESSAGE // Icon type
                );
            }
            // If the user chooses "No" or closes the dialog, `confirmed` remains false,
            // and the loop will repeat.
        } while (!confirmed);

        System.out.println("Program finished.");
    }
}
