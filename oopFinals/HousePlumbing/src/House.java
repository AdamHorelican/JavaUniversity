import java.util.Arrays;

public class House
{
  private Room[] rooms;

  public House(Room[] rooms){
    this.rooms = new Room[rooms.length];
    for (int i = 0; i < rooms.length; i++)
    {
      this.rooms[i] = rooms[i].copy();
    }
  }

  public int getNumberOfRooms(){
    return rooms.length;
  }

  public double getTotalSize(){
    double count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      count += rooms[i].getSize();
    }
    return count;
  }

  public int getNumberOfBathRooms(){
    int count = 0;
    for (int i = 0; i < rooms.length; i++)
    {
      if (rooms[i] instanceof BathRoom){
        count++;
      }
    }
    return count;
  }
  public void rebuildRoom(int index, Room room){
    rooms[index] = room.copy();
  }
  public void combineTwoRoomsIntoOne(int index1, int index2, Room room){

    //index1 < index2
    if (index1 > index2){
      int tmp = index1;
      index1 = index2;
      index2 = tmp;
    }
    rooms[index1] = room.copy();
    for (int i = index2; i <rooms.length-1 ; i++)
    {
      rooms[i]= rooms[i+1];
    }
    rooms[rooms.length-1] = null;

  }

  @Override public String toString()
  {
    return "House{" + "rooms=" + Arrays.toString(rooms) + '}';
  }
}
