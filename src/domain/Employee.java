package domain;

/**
 * Class that represent Employee
 * 
 * @author Kot_Shredingera
 *
 */
public class Employee {

	/**
	 * Gives value as a string.
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
	 * Sets field values: name, jobTitle, level, dept
	 * 
	 * @param name     - name of employee
	 * @param jobTitle - title of the post
	 * @param level    - access level
	 * @param dept     - dept
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
	 * Method that generates the employee ID
	 */

	public Employee() {
		ID = (int) (Math.random() * 1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
	}

	/**
	 * Sets the value of the jobTitle field
	 * 
	 * @param job - title of the post
	 */
	public void setJobTitle(String job) {
		jobTitle = job;
	}

	/**
	 * Getting the value of the field jobTitle
	 * 
	 * @return values jobTitle(title of the post)
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Getting the value of the field name
	 * 
	 * @return values name(name of employee)
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the level field
	 * 
	 * @param level - access level
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
	 * Getting the value of the level
	 * 
	 * @return values level(access level)
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Getting the value of the dept
	 * 
	 * @return values dept
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * Sets the value of the dept field
	 * 
	 * @param dept
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * Sets the value of the name field
	 * 
	 * @param name - name of employee
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
