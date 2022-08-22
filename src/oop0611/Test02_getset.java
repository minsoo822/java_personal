package oop0611;


class Bbs {
	private int bbsno;		//�۹�ȣ
	private String writer;	//���ۼ���
	private String subject; //������
	
	public Bbs() {}
	
	public int getBbsno() {
		return this.bbsno;
	}
	
	public void setBbsno(int bbsno) {
		this.bbsno=bbsno;
	}
	
	public String getWriter() {
		return this.writer;
	}
	public void setWriter(String writer) {
		this.writer=writer;
	}	
	public String getSubject() {
		return this.subject;
	}	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
}//class end



//��Ŭ�������� getter�� setter�Լ��� �ڵ� �ڵ��Ҽ�����
class Member {
	private int memberno;
	private String id;
	private String pw;
	private String name;
	private String address;
	
	public Member() {}
	
	//�޴� Source->Generate Getters and Setters...
	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}//class end








public class Test02_getset {

	public static void main(String[] args) {
		//getter�� setter�Լ�
		/*
		   �� �Լ��� �ۼ� ��Ģ
		     - is�Լ���()  : �ַ� boolean������ ��ȯ
		     - to�Լ���()  
		     - get�Լ���() : �ַ� ���ϰ��� ������
		     - set�Լ���() : �ַ� void�� 		 
		 */
		
		//->get�ʵ�ù���ڴ빮��()
		//->set�ʵ�ù���ڴ빮��()
		
		
		
		Bbs bbs=new Bbs();
		
		bbs.setBbsno(3);
		bbs.setWriter("����");
		bbs.setSubject("����ȭ ���� �Ǿ����ϴ�");
		
		System.out.println(bbs.getBbsno());
		System.out.println(bbs.getWriter());
		System.out.println(bbs.getSubject());
		
		
		
		
		
	}
}
		
