package Messenger;
/**
 *
 * @author Ahsanul
 */
    public class Sender {
    public static void main(String[] args) {
        StdMessenger aidaStd = new StdMessenger(); 
        MailMessenger ahsaMail = new MailMessenger();
        
//        StdMessenger Test
        System.out.println("= Test_Std_Messenger_Started =");
        System.out.println("Sending a Messege");
        ahsaStd.sendMessege("Hai guys", "Would you have a breakfast","In the Restaurant");
        System.out.println("= Test_Std_Messenger_Finished =");
        System.out.println(""); System.out.println("");
//        Mail Messenger Test
        System.out.println("= Test_Mail_Messenger_Started =");
        System.out.println("Sending a Messege"); // Not Connected Yet.
        ahsaMail.sendMessege("Whatsup", "How are you", "Lets play together?");
        
        ahsaMail.disconnect(); //Disconnecting
        
        System.out.println("Connecting"); // Connecting
        ahsaMail.connect(); //Connected
        
//        Resend
        System.out.println("Resend a Messege");
        ahsaMail.sendMessege("Whatsup", "How are you", "Lets play together?");
        System.out.println("= Test_Mail_Messenger_Finished =");
        }
    }
