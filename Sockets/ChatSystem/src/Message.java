import java.io.Serializable;

public class Message implements Serializable
{
  private String name;
  private String content;

  public Message(String name, String content)
  {
    this.name = name;
    this.content = content;
  }

  public String getName()
  {
    return name;
  }

  public String getContent()
  {
    return content;
  }
}