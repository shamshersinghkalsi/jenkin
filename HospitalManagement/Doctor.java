package HospitalManagement;

public class Doctor extends Staff implements Billable{
    private String specialization;
    private double consultationFee;
    public Doctor(String staffId, String name, int age, String specialization, double consultationFee){
        super(staffId, name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    @Override
    void describeDuty() {
        System.out.println(  getName() + " - Specialization: " + specialization + " - Diagnoses and treats patients ");
    }
        @Override
    public double generateBill() {
        return consultationFee;
    }

    @Override
    public String getBillDescription() {
        return " Consultation Fees";
    }
    String medicine;
    int days;
    public void prescribe(String medicine){
        this.medicine = medicine;
        System.out.println(" Prescribing "+ medicine);
    }
    public void prescribe(String medicine,int days){
        this.medicine = medicine;
        this.days = days;
        System.out.println(" Prescribing "+ medicine+ " for "
                + days +" days ");
    }

}




