package May02;

public class Student {
    String name;
    double average;
    double grade1, grade2,grade3;
   // double grade2;
    //double grade3;
    double getAverage(){
        average = (grade1+grade2+grade3)/3 ;
    return average;}
      String getLetterGrade(){
            if ( average >= 90)
                return "A";
        else if ( average >= 80)
        return "B" ;
        else if ( average >= 70)
        return "C";
        else
        return "F";}
    void printReport(){
        System.out.println(name + getAverage() + getLetterGrade());}


            }




