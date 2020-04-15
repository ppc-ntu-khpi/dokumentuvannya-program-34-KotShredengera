package domain;

/**
 * Клас, який представляє собою редактора Наслідує клас {@link Artist}
 * 
 * @author Kot_Shredingera
 *
 */
public class Editor extends Artist {
	/**
	 * Встановлює значення полів: electronicEditing, skills, name, jobTitle, level,
	 * dept
	 * 
	 * @param electronicEditing - наявність електроного редактування
	 * @param skiils            - список умінь
	 * @param name              - ім'я
	 * @param jobTitle          - назва посади
	 * @param level             - рівень доступу
	 * @param dept              - - назва відділення
	 */
	public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
		super(skiils, name, jobTitle, level, dept);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Встановлює значення полів: electronicEditing, skills
	 * 
	 * @param electronicEditing - наявність електроного редактування
	 * @param skiils            - уміння
	 */
	public Editor(boolean electronicEditing, String[] skiils) {
		super(skiils);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Встановлює значення полю electonicEditing
	 * 
	 * @param electronicEditing - наявність електроного редактування
	 */
	public Editor(boolean electronicEditing) {
		super();
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Встановлює значення полю electonicEditing за замовчуванням true
	 */
	public Editor() {
		super();
		this.electronicEditing = true;
	}

	/**
	 * Надання значень у вигляді рядка
	 */
	@Override
	public String toString() {
		String s = super.toString() + "\nEditing preferences= ";
		if (electronicEditing)
			s = s + "electronic";
		else
			s = s + "paper";
		return s;

	}

	private boolean electronicEditing;

	/**
	 * Отримання значень поля electronicEditing
	 * 
	 * @return electronicEditing(наявність електроного редактування)
	 */
	public boolean getPreferences() {
		return electronicEditing;
	}

	/**
	 * Встановлення значень поля electonicEditing
	 * 
	 * @param electronic - наявність електроного редактування
	 */
	public void setPreferences(boolean electronic) {
		this.electronicEditing = electronic;
	}
}
