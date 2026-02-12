public class SilentState implements PhoneState
{
  @Override public void onReceiveMessage(String message, Phone phone)
  {
    System.out.println(message);
  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.vibrate();
  }

  @Override public void onVolumeButtonUp(Phone phone)
  {
    phone.changeToVibrateState();
  }

  @Override public void onVolumeButtonDown(Phone phone)
  {
  }
}
