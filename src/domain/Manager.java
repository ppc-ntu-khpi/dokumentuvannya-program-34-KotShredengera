package domain;

/**
 * ����, ���� ����������� ����� ���������; ������ ���� {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Manager extends Employee {

	/**
	 * ������������ �������� ���� employees, name, jobTitle, level, dept
	 * 
	 * @param employees - ����� ����� ��� �����������
	 * @param name      - ��'�
	 * @param jobTitle  - ����� ������
	 * @param level     - ����� �������
	 * @param dept      - ����
	 */
	public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.employees = employees;
	}

	/**
	 * ������� ������� � ������ �����
	 */
	@Override
	public String toString() {
		return super.toString() + "\nEmployees: " + getEmployees();
	}

	/**
	 * ������������ ������� ���� employees
	 * 
	 * @param employees - ����� ������ ��� �����������
	 */
	public Manager(Employee[] employees) {
		super();
		this.employees = employees;
	}

	/**
	 * �����, ���� ������� ������� �������� ������ ����� ��� ����������� ��
	 * �������������
	 */
	public Manager() {
		super();
		employees = new Employee[10];
	}

	private Employee[] employees;

	/**
	 * ��������� ������ ���� �����������
	 * 
	 * @return ��'� �����������
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
	 * ������������ �������� ���� employees
	 * 
	 * @param employees - ����� ����� ��� �����������
	 */
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	/**
	 * ��������� ������ ����� ��� �����������
	 * 
	 * @return �������� employees (��� �����������)
	 */
	public Employee[] getEmployeesList() {
		return employees;
	}

}
