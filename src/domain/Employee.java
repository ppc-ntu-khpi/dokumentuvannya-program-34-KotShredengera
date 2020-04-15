package domain;

/**
 * Клас, який представляє собою співробітника
 * 
 * @author Kot_Shredingera
 *
 */
public class Employee {

	/**
	 * Надає значення у вигляді рядка.
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
	 * Встановлює значення полів: ім'я, назва посади, рівень, відділ
	 * 
	 * @param name     - ім`я співробітника
	 * @param jobTitle - назва посади
	 * @param level    - рівень доступу
	 * @param dept     - відділ
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
	 * Метод, який генерує ID співробітника
	 */

	public Employee() {
		ID = (int) (Math.random() * 1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
	}

	/**
	 * Встановлює значення поля jobTitle
	 * 
	 * @param job - назва посады
	 */
	public void setJobTitle(String job) {
		jobTitle = job;
	}

	/**
	 * Отримання значення поля jobTitle
	 * 
	 * @return значення jobTitle (назва посади)
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * Отримання значення поля name
	 * 
	 * @return значення name (ім'я співробітника)
	 */
	public String getName() {
		return name;
	}

	/**
	 * Встановлення значення поля level
	 * 
	 * @param level - рівня доступу
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
	 * Отримання значення поля level
	 * 
	 * @return значення level (рівня доступу)
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Отримання значення поля dept
	 * 
	 * @return значення dept (відділення)
	 */
	public String getDept() {
		return dept;
	}

	/**
	 * Встановлення значення поля dept
	 * 
	 * @param dept - назва відділення
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * Встановлення значення поля name
	 * 
	 * @param name - ім'я співробітника
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
