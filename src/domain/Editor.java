package domain;

/**
 * Class that represent Editor; Extends {@link Artist}
 * 
 * @author Kot_Shredingera
 *
 */
public class Editor extends Artist {
	/**
	 * Sets field values: electronicEditing, skills, name, jobTitle, level, dept
	 * 
	 * @param electronicEditing - availability of electronic editing
	 * @param skiils            - list of skills
	 * @param name              - name of employee
	 * @param jobTitle          - title of the post
	 * @param level             - access level
	 * @param dept              - dept
	 */
	public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
		super(skiils, name, jobTitle, level, dept);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Sets field values: electronicEditing, skills
	 * 
	 * @param electronicEditing - availability of electronic editing
	 * @param skiils            - list of skills
	 */
	public Editor(boolean electronicEditing, String[] skiils) {
		super(skiils);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Sets the value of the electronicEditing field
	 * 
	 * @param electronicEditing - availability of electronic editing
	 */
	public Editor(boolean electronicEditing) {
		super();
		this.electronicEditing = electronicEditing;
	}

	/**
	 * Sets the default electonicEditing field to true
	 */
	public Editor() {
		super();
		this.electronicEditing = true;
	}

	/**
	 * Gives value as a string.
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
	 * Getting the value of the field electronicEditing
	 * 
	 * @return electronicEditing
	 */
	public boolean getPreferences() {
		return electronicEditing;
	}

	/**
	 * Sets the value of the electronicEditing field
	 * 
	 * @param electronic - availability of electronic editing
	 */
	public void setPreferences(boolean electronic) {
		this.electronicEditing = electronic;
	}
}
