package HospitalManagement;

public class Nurse extends Staff {
    private String ward;
public Nurse(String staffID, String name, int age, String ward){
    super(staffID,name,age);
    this.ward = ward;

}
    @Override
    void describeDuty() {
        System.out.println(  getName()+ "- Ward: " +ward+ " - Assists doctors and cares for patients");


    }
}
