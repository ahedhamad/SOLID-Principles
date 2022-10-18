package Single_Responsibility.Implements;

import Single_Responsibility.Inteface.ISendEmail;
import Single_Responsibility.MailMessage;

public class MySendEmail implements ISendEmail {

    public void sendEmail(MailMessage mailMessage) {
        if (mailMessage.isValidMessage()) {
            // Code for getting Email setting and send invoice mail
        } else {
            //show error message for the user
        }

    }
}
