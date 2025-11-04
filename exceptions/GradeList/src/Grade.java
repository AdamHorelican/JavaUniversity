
public class Grade
{
    private String courseName;
    private int grade;

    public Grade(String courseName, int grade)
    {
        if(!isLegalGrade(grade))
        {
            throw new IllegalArgumentException("Inavlid grade");
        }
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        if(!isLegalGrade(grade))
        {
            throw new IllegalArgumentException("Invalid grade!");
        }
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return "Grade{" +
                "courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }

    private boolean isLegalGrade(int grade)
    {
        return grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12;
    }
}
