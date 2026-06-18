package HospitalManagement;

public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[3];
      staff[0] = new Doctor(" D001 "," Dr. Sharma ",45," Cardiology ",800);
      staff[1] = new Nurse(" N001 ", " Nurse Priya ", 30, " ICU ");
      staff[2] = new Doctor(" D002 ", " Dr. Tejpal ",75," Dermatology ",500);
       double totalRevenue = 0;
       Doctor D = new Doctor(" D001 "," Dr. Sharma ",45," Cardiology ",800);

        for (int i = 0; i < 3; i++) {
            staff[i].displayInfo();
            staff[i].describeDuty();
            if (staff[i] instanceof Billable){
                System.out.println(" Bill for " + staff[i].getName()+": " +((Billable) staff[i]).generateBill()+" " +
                        " - "+ ((Billable) staff[i]).getBillDescription());
            totalRevenue = totalRevenue + ((Billable) staff[i]).generateBill();

            }
            System.out.println(" Total Hospital Revenue: " +totalRevenue);
            D.prescribe("Dolo");
            D.prescribe("Amoxicillin",5);

        }
    }
}
