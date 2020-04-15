package domain;

/**
 * Клас, який представляє собою актора Наслідує клас {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Artist extends Employee {

	/**
	 * Встановлення значення полів: skills, name, jobTitle, level, dept
	 * 
	 * @param skiils   - список умінь
	 * @param name     - ім'я
	 * @param jobTitle - назва посади
	 * @param level    - рівень доступу
	 * @param dept     - - назва відділення
	 */
	public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.skiils = skiils;
	}

	/**
	 * Встановлення зчачень поля skills
	 * 
	 * @param skiils - список умінь
	 */
	public Artist(String[] skiils) {
		super();
		this.skiils = skiils;
	}

	/**
	 * Метод, який оголошує кількість елементів масиву умінь за замовчуванням
	 */
	public Artist() {
		super();
		this.skiils = new String[10];
	}

	/**
	 * Надання значень у вигляді рядка
	 */
	@Override
	public String toString() {
		return super.toString() + "\nSkills: " + getSkills();
	}

	private String[] skiils;

	/**
	 * Отримання значень поля skills
	 * 
	 * @return рядкове значення уміння
	 */
	public String getSkills() {
		String s = "";
		for (String e : skiils) {
			s = s + e + ", ";
		}
		s = s.substring(0, s.length() - 2);
		return s;
	}

	/**
	 * Встановлення значень поля skills
	 * 
	 * @param skills(список умінь)
	 */
	public void setSkills(String[] skills) {
		this.skiils = skills;
	}

	/**
	 * Отримання значень поля skills
	 * 
	 * @return список умінь
	 */
	public String[] getSkillsLSist() {
		return skiils;
	}
}
