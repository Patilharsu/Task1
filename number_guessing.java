import javax.swing.*;

public class number_guessing{
    public static void main(String[] args) {
        int compnum = (int) (Math.random() * 100 + 1);
        int user_output = 0;
        int count = 1;
        try {
            while (user_output != compnum) {
                String response = JOptionPane.showInputDialog(null, "Enter the guesssing number between 1 and 100");
                user_output = Integer.parseInt(response);
                JOptionPane.showMessageDialog(null, " " + determineGuess(user_output, compnum, count));
                count++;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static String determineGuess(int user_output , int compnum , int count)
    {
        if (user_output <= 0 || user_output > 100) {
            return "Your guess number is invalid";
        } else if (user_output == compnum) {
            return "Correct! \n Total Guesses : " + count;
        } else if (user_output > compnum) {
            return "Your guess number is too high, try again, \n Try Number : " + count;
        } else if (user_output < compnum) {
            return "Your guess number is too low, try again, \n Try Number :  " + count;
        } else {
            return "Your guess number is incorrect \n Try Number : " + count;
        }
    }
}
