public class GradePointAverage {
    public float calculateGPA(int subject1,int subject2,int subject3,int subject4){
        int total=subject1+subject2+subject3+subject4;
        float grade=((total/20)-4)/4;
        return grade;
    }
}
