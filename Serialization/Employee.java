package Serialization;

import java.io.Serializable;

public class Employee implements Serializable {
    // Highly recommended to declare a version control ID
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;

    // This field will be completely skipped during serialization
    private transient String socialSecurityNumber;

    public Employee(String name, int id, String ssn) {
        this.name = name;
        this.id = id;
        this.socialSecurityNumber = ssn;
    }
}
