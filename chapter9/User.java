package chapter9;
/** 
 * 
 * @author Sebastian_Gao 
 * ���� E-mail:sebastiangao0219@gmail.com
 * @date ����ʱ�䣺May 6, 2020 3:07:50 PM 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @override
 * 
 * ʵ���û�ע�Ṧ��
 * 1���û������25���ַ����ȡ����ܰ����ո񡢵�˫���š��ʺŵ��������
 * 2������6-18λ��ֻ�ܰ�����ĸ�����֡��������(�»��ߡ�@��#��$��!)
 * �����֡�����ĸʱ������ǿ�ȶ����� (�������) ����+���롢����+���š�����+��ĸ��ǿ��Ϊ��(�������) ͬʱ���������ַ���ǿ��Ϊǿ(�������)
 * 3���û�������ȷ��email
 * �������@���ţ���ֻ�ܰ���һ�� @��. ���Ų����ڿ�ͷ��Ҳ�����ڽ�β
 * 
 */
public class User {
	private String userName;
	private String password;
	private String email;
	
	
	public User() {
		super();
	}
	
	public User(String userName, String password, String email) {
		setUserName(userName);
		setPassword(password);
		setEmail(email);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	


	

}
