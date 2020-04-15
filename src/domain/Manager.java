package domain;

/**
 * Class that represent; Extends {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Manager extends Employee {

	/**
	 * Sets field values: employees, name, jobTitle, level, dept
	 * 
	 * @param employees - list of employee data
	 * @param name      - name of employee
	 * @param jobTitle  - title of the post
	 * @param level     - access level
	 * @param dept      - dept
	 */
	public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.employees = employees;
	}

	/**
	 * Gives value as a string.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nEmployees: " + getEmployees();
	}

	/**
	 * Sets the value of the employee field
	 * 
	 * @param employees - list of employee data
	 */
	public Manager(Employee[] employees) {
		super();
		this.employees = employees;
	}

	/**
	 * A method that declares the number of elements of an array of default employee
	 * data
	 */
	public Manager() {
		super();
		employees = new Employee[10];
	}

	private Employee[] employees;

	/**
	 * Getting the value of the field employees
	 * 
	 * @return name of employee
	 */
	public String getEmployees() {
		String s = "";
		for (Employee e : employees) {
			s = s + e.getName() + ", ";
		}
		s = s.substring(0, s.length() - 2);
		return s;
	}

	/**
	 * Sets the value of the employee field
	 * 
	 * @param employees - list of employee data
	 */
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	/**
	 * Getting the value of the field employees
	 * 
	 * @return values employees
	 */
	public Employee[] getEmployeesList() {
		return employees;
	}

}
