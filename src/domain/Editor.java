package domain;

/**
 * ����, ���� ����������� ����� ��������� ������ ���� {@link Artist}
 * 
 * @author Kot_Shredingera
 *
 */
public class Editor extends Artist {
	/**
	 * ���������� �������� ����: electronicEditing, skills, name, jobTitle, level,
	 * dept
	 * 
	 * @param electronicEditing - �������� ����������� ������������
	 * @param skiils            - ������ ����
	 * @param name              - ��'�
	 * @param jobTitle          - ����� ������
	 * @param level             - ����� �������
	 * @param dept              - - ����� ��������
	 */
	public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
		super(skiils, name, jobTitle, level, dept);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * ���������� �������� ����: electronicEditing, skills
	 * 
	 * @param electronicEditing - �������� ����������� ������������
	 * @param skiils            - �����
	 */
	public Editor(boolean electronicEditing, String[] skiils) {
		super(skiils);
		this.electronicEditing = electronicEditing;
	}

	/**
	 * ���������� �������� ���� electonicEditing
	 * 
	 * @param electronicEditing - �������� ����������� ������������
	 */
	public Editor(boolean electronicEditing) {
		super();
		this.electronicEditing = electronicEditing;
	}

	/**
	 * ���������� �������� ���� electonicEditing �� ������������� true
	 */
	public Editor() {
		super();
		this.electronicEditing = true;
	}

	/**
	 * ������� ������� � ������ �����
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
	 * ��������� ������� ���� electronicEditing
	 * 
	 * @return electronicEditing(�������� ����������� ������������)
	 */
	public boolean getPreferences() {
		return electronicEditing;
	}

	/**
	 * ������������ ������� ���� electonicEditing
	 * 
	 * @param electronic - �������� ����������� ������������
	 */
	public void setPreferences(boolean electronic) {
		this.electronicEditing = electronic;
	}
}
