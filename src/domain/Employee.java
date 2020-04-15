package domain;

/**
 * ����, ���� ����������� ����� �����������
 * 
 * @author Kot_Shredingera
 *
 */
public class Employee {

	/**
	 * ���� �������� � ������ �����.
	 */
	@Override
	public String toString() {
		return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= "
				+ dept;
	}

	private String name;
	private String jobTitle;
	private int ID;
	private int level;
	private String dept;

	// private static int employeesCount = 0;

	/**
	 * ���������� �������� ����: ��'�, ����� ������, �����, ����
	 * 
	 * @param name     - ��`� �����������
	 * @param jobTitle - ����� ������
	 * @param level    - ����� �������
	 * @param dept     - ����
	 */
	public Employee(String name, String jobTitle, int level, String dept) {
		this();
		setName(name);
		this.jobTitle = jobTitle;
		switch (level) {
		case 1:
		case 2:
		case 3:
			this.level = level;
			break;
		default:
			this.level = 1;
		}
		this.dept = dept;
	}

	/**
	 * �����, ���� ������ ID �����������
	 */

	public Employee() {
		ID = (int) (Math.random() * 1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
	}

	/**
	 * ���������� �������� ���� jobTitle
	 * 
	 * @param job - ����� ������
	 */
	public void setJobTitle(String job) {
		jobTitle = job;
	}

	/**
	 * ��������� �������� ���� jobTitle
	 * 
	 * @return �������� jobTitle (����� ������)
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * ��������� �������� ���� name
	 * 
	 * @return �������� name (��'� �����������)
	 */
	public String getName() {
		return name;
	}

	/**
	 * ������������ �������� ���� level
	 * 
	 * @param level - ���� �������
	 */
	public void setLevel(int level) {
		switch (level) {
		case 1:
		case 2:
		case 3:
			this.level = level;
			break;
		default:
			this.level = 1;
		}
	}

	/**
	 * ��������� �������� ���� level
	 * 
	 * @return �������� level (���� �������)
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * ��������� �������� ���� dept
	 * 
	 * @return �������� dept (��������)
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * ������������ �������� ���� dept
	 * 
	 * @param dept - ����� ��������
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * ������������ �������� ���� name
	 * 
	 * @param name - ��'� �����������
	 */
	public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
		if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
			this.name = name;
		} else {
			this.name = "John Doe";
		}
	}
}
