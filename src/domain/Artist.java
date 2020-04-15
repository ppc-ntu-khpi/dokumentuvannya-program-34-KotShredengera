package domain;

/**
 * Class that represent Artist; Extends {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Artist extends Employee {

	/**
	 * Set field values: skills, name, jobTitle, level, dept
	 * 
	 * @param skiils   - list of skills
	 * @param name     - name of employee
	 * @param jobTitle - title of the post
	 * @param level    - access level
	 * @param dept     - dept
	 */
	public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.skiils = skiils;
	}

	/**
	 * Sets the value of the skills field
	 * 
	 * @param skiils - list of skills
	 */
	public Artist(String[] skiils) {
		super();
		this.skiils = skiils;
	}

	/**
	 * Method that declares the number of elements of the default skills set
	 */
	public Artist() {
		super();
		this.skiils = new String[10];
	}

	/**
	 * Gives value as a string.
	 */
	@Override
	public String toString() {
		return super.toString() + "\nSkills: " + getSkills();
	}

	private String[] skiils;

	/**
	 * Getting the value of the field skills
	 * 
	 * @return the string value of the skill
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
	 * Sets the value of the skills field
	 * 
	 * @param skills(list of skills)
	 */
	public void setSkills(String[] skills) {
		this.skiils = skills;
	}

	/**
	 * Getting the value of the field skills
	 * 
	 * @return list of skills
	 */
	public String[] getSkillsLSist() {
		return skiils;
	}
}
