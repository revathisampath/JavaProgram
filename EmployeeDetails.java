package vechicle;

public class EmployeeDetails {
	
	public void printEmployeeName(String empName,int empId) {
		System.out.println("EmployeeName:"+empName);
		System.out.println("Id:"+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void printEmployeeMobileNumber(long empMobileNumber) {
		System.out.println(empMobileNumber);
	}

	public static void main(String[] args) {
		
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("revathi",20);
		emp.getEmployeeAddress("chennai");
		emp.printEmployeeSalary(354467.4748);
		emp.printEmployeeMobileNumber(9876543210l);
	}

}
