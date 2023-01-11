
public class hrapp {
	
	public static void main (String[] args)
	{
		System.out.println("HRapp Start");
		
		Employee e1 = new Employee(230, "Jerry", 333998);
		Employee e2 = new Employee(420, "Gracie", 332823);
		
		Department dept = new Department("Education");
		
		dept.addEmp(e1);
		dept.addEmp(e2);
		dept.addEmp(new Employee(772, "Jack", 33298));
		
		Employee[] emps = dept.getEmployees();
		
		for (Employee emp : emps) {
			System.out.println("Emp " + emp);
			//System.out.println("Emp" + e2);
			
		}
		System.out.println("Total " + dept.getTotalSalary());
		System.out.println("Average " + dept.getAverageSalary());
		
		//Búsqueda
		System.out.println("EmpID " + dept.getEmployeeByID(4200));
	}
	
	
}
