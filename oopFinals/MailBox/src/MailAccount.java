public class MailAccount
{
  private String user, mail;

  public MailAccount(String user, String mail){
    this.user = user;
    this.mail = mail;
  }

  public String getMail()
  {
    return mail;
  }

  public String getUser()
  {
    return user;
  }
  public void setMail(String mail){
    this.mail = mail;
  }
  public static boolean isValidMail(String mail){
    if (mail == null){
      return false;
    }
    int index = mail.indexOf('@');
    return index > 0 && index < mail.length()-1;
  }
}
