package oop0528;  //���� Ŭ����(Test01_class)�� ������ġ
                  //package�� �ѹ��� �����Ѵ�

//Ŭ������ ����Ϸ��� ������ġ�� �����ؾ� �Ѵ�
//import�� ������ ���� �����ϴ�
import java.io.*;
import java.util.*;
import java.sql.Connection;
import java.awt.AWTEvent;

//�ĺ���
//->������Ʈ�� basicJava
//->��Ű����   oop0528
//->Ŭ������  Test01_class Ŭ�������� ù���ڴ� �ַ� �빮�ڷ� �Ѵ�
//->�Լ���, ������, ��ü��

/*
	�� Access Modifiers ���ټ���, ��������
      -> private    : �����. Ŭ���� ���ο����� ���� ����
      -> package    : ���� ��Ű��(oop0528)�������� ���� ����. ������ ��� �⺻��
      -> protected  : ��Ӱ��迡 �ִ� �ٸ� package�� �����ϴ� ��쿡�� ���� ����
      -> public     : ����. basicJava������Ʈ�������� ��� ���� ����
*/
/////////////////////////////////////////////////////////////////////

//����� ���� Ŭ����
class Sungjuk{ //package class Sungjuk
	           //->package�� �����ؾ� �Ѵ�
	
	//Ŭ���� ���ο����� ��������� ������� ���� ���� �����ϴ�
	
	//������� field
	public String name;
	int kor, eng, mat;  //package ������� �����Ǿ� �ִ�
	private int aver;
	
	//����Լ� method
	void calc() { //package���� ��� �����Ǿ� �ִ�
		aver=(kor+eng+mat)/3;
	}//calc() end
	
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp() end
	
	private void view() {}
	
}//class end

/////////////////////////////////////////////////////////////////////

public class Test01_class {

	public static void main(String[] args) {
		//Class Ŭ����
		//->���� �ڷ���(reference)
		//->������� : �������(field) + ����Լ�(method)
		//->Ŭ������ �޸�(RAM)�� �Ҵ�(new������)�ϰ� ����Ѵ� : ��ü(Object)
		//->��ü ���� ���� : new �������Լ�()
//------------------------------------------------------------------
		
		int a=3; //a�� �Ϲ� ��������
		new Sungjuk(); //��ü Object
		               //RAM�� heap������ �޸� Ȯ��(#100����)
		
		//sj : ����(reference)����. �޸𸮿� �Ҵ�� ���� �ּҰ�(#110)�� ����
		Sungjuk sj=new Sungjuk(); //#110����
		//���������� ���� ��ü�� ����� �����ϴ� ������ : . ������
		sj.name="�����";
		sj.kor=100;
		sj.eng=95;
		sj.mat=80;
		//sj.aver ����. private�Ӽ��� ���� �Ұ���
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		sj.calc();
		sj.disp();
		//sj.view()����. private�Ӽ��� ���� �Ұ���		
		
///////////////////////////////////////////////////////////
		
		//Object Oriented Program ��ü ���� ���α׷�
		//Ŭ������ ��������=new Ŭ������()
	
		Sungjuk sungjuk=new Sungjuk();  //#120����
		sungjuk.name="�迬��";
		sungjuk.kor=70;
		sungjuk.eng=65;
		sungjuk.mat=50;
		sungjuk.calc();
		sungjuk.disp();
		
///////////////////////////////////////////////////////////		
		
		//���������� ������ �ִ� ��ü�� �ּҰ�
		System.out.println(sj.hashCode());
		System.out.println(sungjuk.hashCode());
		
		int i=3;
		int j=i;
		
		Sungjuk tmp=sungjuk;
		System.out.println(tmp.hashCode());
		

	}//main() end
}//class end
