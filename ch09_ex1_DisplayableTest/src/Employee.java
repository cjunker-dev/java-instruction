public class Employee implements Displayable, DepartmentConstants {

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    public String toString() {
    	String dept = "Unknown";
    	if (department == ADMIN) {
    		dept = "Administration";
    	}
    	else if (department == EDITORIAL) {
    		dept = "Editorial";
    	}
    	else if (department == MARKETING) {
    		dept = "Marketing";
    	}
    	String string = firstName + " " + lastName + " (" + dept + ")";
    	return string;
    }
    
    
}