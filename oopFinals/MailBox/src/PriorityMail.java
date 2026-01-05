public class PriorityMail extends Mail
{
  private boolean highPriority;


  public PriorityMail(boolean highPriority, String subject, String content, Date5 date, MailAccount fromAccount){
    super(subject, content, date, fromAccount);
    this.highPriority = highPriority;
  }
  public boolean isHighPriority(){
    return highPriority;
  }
}
