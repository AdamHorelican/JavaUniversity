import java.lang.reflect.Array;

public class StudentList5
{
  private int size;
  private Student5[] list;

  public StudentList5(){
    list = new Student5[10];
    size = 0;
  }
  public void addStudent(Student5 student){
    if (size == list.length){
      doubleTheListCapacity();
    }
    list[size] = student;
    size++;
  }

  private void doubleTheListCapacity(){
    Student5[] newList = new Student5[list.length*2];
    for (int i = 0; i < size; i++){
      newList[i] = list[i];
    }
    list = newList;
  }

  public Student5 getStudent(int index){
    if (index < 0 || index > list.length){
      throw new IndexOutOfBoundsException("Index out of bounds");
    }
    return list[index];
  }

  public void removeStudent(Student5 student){
    int index = -1;

    for (int i =0; i < size;i++){
      if (list[i].equals(student)){
        index = i;
        break;
      }
    }
    if (index == -1) throw new RuntimeException("Not found");

    for (int i = index; i<size -1; i++){
      list[i] = list[i+1];
    }
    list[size -1] = null;
    size--;
  }

  public int getNumberOfStudents(){
    return size;
  }
  public int getNumberOfStudentsByEducation(Education education){
    int count= 0;
    for (int i = 0; i < size; i++){
      if (list[i].getEducation().equals(education)){
        count++;
      }
    }
    return count;
  }

  public Student5[] getStudentsByEducation(Education education){
    int count = 0;
    int countInArray = 0;
    for (int i = 0; i < size; i++){
      if (list[i].getEducation().equals(education)){
        count++;
      }
    }
    Student5[] newList = new Student5[count];
    for (int i = 0; i < size; i++){
      if (list[i].getEducation().equals(education)){
        newList[countInArray] = list[i];
        countInArray++;
      }
    }
    return newList;
  }

  public int getNumberOfHighSchoolStudents(){
    int numberOfHighSchoolStudents = 0;
    for (int i = 0; i < size; i++)
    {
     Education edu = list[i].getEducation();

     if (edu instanceof School){
       School school = (School) edu;
       if (school.getSchoolType().equals(School.HIGH_SCHOOL)){
         numberOfHighSchoolStudents++;
       }
     }
    }
    return numberOfHighSchoolStudents;
  }
}
