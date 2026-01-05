public class Mail
{
  private String subject, content;

  private MailAccount fromAccount, toAccount;
  private Date5 date;

  public Mail(String subject, String content, Date5 date, MailAccount fromAccount){
    this.subject = subject;
    this.content = content;
    this.date = date.copy();
    this.fromAccount = fromAccount;
    this.toAccount = null;
  }

  public void send(MailAccount toAccount){
    this.toAccount = toAccount;
  }

  public Date5 getDate()
  {
    return date;
  }

  public MailAccount getFromAccount()
  {
    return fromAccount;
  }

  public MailAccount getToAccount()
  {
    return toAccount;
  }

  public String getContent()
  {
    return content;
  }

  public String getSubject()
  {
    return subject;
  }

}
