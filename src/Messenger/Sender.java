package Messenger;
/**
 *
 * @author Ahsanul
 */
    public class Sender {
    public static void main(String[] args) {
        StdMessenger aidaStd = new StdMessenger(); 
        MailMessenger aidaMail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("= Test_Std_Messenger_Started =");
        System.out.println("Sending a Messege");
        aidaStd.sendMessege("Hai guys", "Would you have a breakfast","In the Restaurant");
        System.out.println("= Test_Std_Messenger_Finished =");
        System.out.println(""); System.out.println("");
//        Mail Messenger Test
        System.out.println("= Test_Mail_Messenger_Started =");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        aidaMail.sendMessege("Whatsup", "How are you", "Lets play together?");
        
        aidaMail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        aidaMail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        aidaMail.sendMessege("Whatsup", "How are you", "Lets play together?");
        System.out.println("= Test_Mail_Messenger_Finished =");
        }
    }
