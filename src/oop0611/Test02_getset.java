package oop0611;


class Bbs {
	private int bbsno;		//글번호
	private String writer;	//글작성자
	private String subject; //글제목
	
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



//이클립스에서 getter와 setter함수를 자동 코딜할수있음
class Member {
	private int memberno;
	private String id;
	private String pw;
	private String name;
	private String address;
	
	public Member() {}
	
	//메뉴 Source->Generate Getters and Setters...
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
		//getter와 setter함수
		/*
		   ● 함수명 작성 규칙
		     - is함수명()  : 주로 boolean형으로 반환
		     - to함수명()  
		     - get함수명() : 주로 리턴값이 존재함
		     - set함수명() : 주로 void형 		 
		 */
		
		//->get필드첫글자대문자()
		//->set필드첫글자대문자()
		
		
		
		Bbs bbs=new Bbs();
		
		bbs.setBbsno(3);
		bbs.setWriter("이젠");
		bbs.setSubject("무궁화 꽃이 피었습니다");
		
		System.out.println(bbs.getBbsno());
		System.out.println(bbs.getWriter());
		System.out.println(bbs.getSubject());
		
		
		
		
		
	}
}
		
