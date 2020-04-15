package domain;

/**
 * Клас, який представляє собою Менеджера; Наслідує клас {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Manager extends Employee {

	/**
	 * Встановлення значення полів employees, name, jobTitle, level, dept
	 * 
	 * @param employees - масив даних про співробітника
	 * @param name      - ім'я
	 * @param jobTitle  - назва посади
	 * @param level     - рівень доступу
	 * @param dept      - відділ
	 */
	public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.employees = employees;
	}

	/**
	 * Надання значень у вигляді рядка
	 */
	@Override
	public String toString() {
		return super.toString() + "\nEmployees: " + getEmployees();
	}

	/**
	 * Встановлення значень полю employees
	 * 
	 * @param employees - масив данних про співробітників
	 */
	public Manager(Employee[] employees) {
		super();
		this.employees = employees;
	}

	/**
	 * Метод, який оголошує кількість елементів масиву даних про співробітників за
	 * замовчуванням
	 */
	public Manager() {
		super();
		employees = new Employee[10];
	}

	private Employee[] employees;

	/**
	 * Отримання масиву імен співробітників
	 * 
	 * @return ім'я співробітника
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
	 * Встановлення значення поля employees
	 * 
	 * @param employees - масив даних про співробітника
	 */
	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	/**
	 * Отримання масиву даних про співробітників
	 * 
	 * @return значення employees (дані співробітників)
	 */
	public Employee[] getEmployeesList() {
		return employees;
	}

}
