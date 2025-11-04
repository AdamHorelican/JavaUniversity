import java.util.Arrays;

public class GradeList
{
    private int indexOfNextAvailableElement;
    private Grade[] grades;
    private final int MAX_SIZE = 10;

    public GradeList()
    {
        grades = new Grade[MAX_SIZE];
        indexOfNextAvailableElement = 0;
    }

    public int getSize()
    {
        int size = 0;
        for (Grade grade : grades)
        {
            if (grade != null)
            {
                size++;
            }
        }
        return size;
    }

    public Grade getGrade(int index)
    {
        if (index < 0 && index >= indexOfNextAvailableElement){
          throw new IndexOutOfBoundsException("Index " + index + " out of range");
        }
      return grades[index];
    }

    public void addGrade(Grade grade)
    {
        if (indexOfNextAvailableElement >= MAX_SIZE){
          throw new ArrayStoreException("Out of boundaries");
        }
        grades[indexOfNextAvailableElement] = grade;
        indexOfNextAvailableElement++;

    }

    public Grade[] getAllGrades()
    {
        return grades;
    }

    public double getAverage()
    {
        int sum = 0;
        int size = getSize();
        if (size==0){
          throw new IllegalStateException("At least one grade required");
        }

        for (Grade grade : grades)
        {
            if(grade != null)
            {
                sum += grade.getGrade();
            }
        }

        return ((double) sum / size);
    }

    @Override
    public String toString()
    {
        return "GradeList{" +
                "indexOfNextAvailableElement=" + indexOfNextAvailableElement +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
