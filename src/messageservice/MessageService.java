

package messageservice;


public class MessageService {

    private MessageStrategy messageStrategy;
    private MessageOutput messageOutput;

    public MessageService(MessageStrategy messageStrategy, MessageOutput messageOutput) {
        this.messageStrategy = messageStrategy;
        this.messageOutput = messageOutput;
    }

    public void message(){
        messageOutput.output(messageStrategy.returnMessage());
    }
    
}
    
