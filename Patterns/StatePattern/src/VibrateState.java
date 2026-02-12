public class VibrateState implements PhoneState
{
  @Override public void onReceiveMessage(String message, Phone phone)
  {
    phone.vibrate();
    System.out.println(message);
  }

  @Override public void onReceiveCall(Phone phone)
  {
    phone.vibrate();
  }

  @Override public void onVolumeButtonUp(Phone phone)
  {
     phone.changeToSoundState();
  }

  @Override public void onVolumeButtonDown(Phone phone)
  {
    phone.changeToSilentState();
  }
}
