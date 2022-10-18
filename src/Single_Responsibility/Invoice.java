package Single_Responsibility;
import Single_Responsibility.Inteface.IConnectionDb;
import Single_Responsibility.Inteface.ISendEmail;

import java.util.Date;

public class Invoice {
    private long amount;
    private Date invoiceDate;
    // composition relationship
    MailMessage mailMessage = new MailMessage("MailAddressFrom","MailAddressTo","MailSubject","MailBody");
    // composition relationship with interface
    private ISendEmail sender;
    // composition relationship with interface
    private IConnectionDb Connector;
    //constructor function
    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }
//  add function
    public void add()  {
        Connector.connectToAdd();
        sender.sendEmail(mailMessage);
    }
    // delete function
    public void delete()  {
       Connector.connectToDelete();
    }
    // sendEmail function
    public void sendEmail(MailMessage mailMessage)  {
        sender.sendEmail(mailMessage);
    }

//setter and getter functions
    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public void setMailMessage(MailMessage mailMessage) {
        this.mailMessage = mailMessage;
    }

    public void setSender(ISendEmail sender) {
        this.sender = sender;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public ISendEmail getSender() {
        return sender;
    }

    public long getAmount() {
        return amount;
    }

    public MailMessage getMailMessage() {
        return mailMessage;
    }

    public IConnectionDb getConnector() {
        return Connector;
    }

    public void setConnector(IConnectionDb connector) {
        Connector = connector;
    }
}
