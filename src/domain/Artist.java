package domain;

/**
 * ����, ���� ����������� ����� ������ ������ ���� {@link Employee}
 * 
 * @author Kot_Shredingera
 *
 */
public class Artist extends Employee {

	/**
	 * ������������ �������� ����: skills, name, jobTitle, level, dept
	 * 
	 * @param skiils   - ������ ����
	 * @param name     - ��'�
	 * @param jobTitle - ����� ������
	 * @param level    - ����� �������
	 * @param dept     - - ����� ��������
	 */
	public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
		super(name, jobTitle, level, dept);
		this.skiils = skiils;
	}

	/**
	 * ������������ ������� ���� skills
	 * 
	 * @param skiils - ������ ����
	 */
	public Artist(String[] skiils) {
		super();
		this.skiils = skiils;
	}

	/**
	 * �����, ���� ������� ������� �������� ������ ���� �� �������������
	 */
	public Artist() {
		super();
		this.skiils = new String[10];
	}

	/**
	 * ������� ������� � ������ �����
	 */
	@Override
	public String toString() {
		return super.toString() + "\nSkills: " + getSkills();
	}

	private String[] skiils;

	/**
	 * ��������� ������� ���� skills
	 * 
	 * @return ������� �������� �����
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
	 * ������������ ������� ���� skills
	 * 
	 * @param skills(������ ����)
	 */
	public void setSkills(String[] skills) {
		this.skiils = skills;
	}

	/**
	 * ��������� ������� ���� skills
	 * 
	 * @return ������ ����
	 */
	public String[] getSkillsLSist() {
		return skiils;
	}
}
