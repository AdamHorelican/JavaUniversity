import java.util.ArrayList;

public class MailBox
{
  private ArrayList<Mail> mails;

  public MailBox(){
    this.mails = new ArrayList<>();
  }
  public int getNumberOfMails(){
    return mails.size();
  }
  public void createMail(Mail mail){
    this.mails.add(mail);
  }

  public ArrayList<Mail> getBySubject(String subject){
    ArrayList<Mail> newOne = new ArrayList<>();
    for (int i = 0; i < getNumberOfMails(); i++)
    {
      if(mails.get(i).getSubject().equals(subject)){
        newOne.add(mails.get(i));
      }
    }
    return newOne;
  }

  public ArrayList<String> getSubjectsFromUser(String user){
    ArrayList<String> fromUsers = new ArrayList<>();

    for (Mail m : mails){
      if (m.getFromAccount().getUser().equals(user)){
        fromUsers.add(m.getSubject());
      }
    }
    return fromUsers;
  }

  public ArrayList<PriorityMail> getAllHighPriorityMails(){
    ArrayList<PriorityMail> lambda = new ArrayList<>();
    for (Mail m : mails){
      if (m instanceof PriorityMail){
        PriorityMail pm = (PriorityMail) m;
        if(pm.isHighPriority()){
          lambda.add(pm);
        }
      }
    }
    return lambda;
  }
}
