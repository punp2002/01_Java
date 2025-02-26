package edu.kh.oop.method.model.service;

import java.util.Scanner;
import edu.kh.oop.method.model.vo.Member;

public class MemberService {

	// �Ӽ� (�ʵ�)
	private Scanner sc = new Scanner(System.in);
		
	private Member memberInfo = null; // ������ ȸ���� ������ ������ ����
	private Member loginMember = null; // �α����� ȸ���� ������ ������ ����
	// ��� (������, �޼���)
	
	// �޴� ȭ�� ��� ���
	public void displayMenu() {
		
		int menuNum = 0; // �޴� ���ÿ� ����
		
		// ������ �ѹ��� ����
		do {
			System.out.println("======ȸ�� ���� ���� ���α׷�======");
			System.out.println("1. ȸ������");
			System.out.println("2. �α���");
			System.out.println("3. ȸ�� ���� ��ȸ");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� �Է� : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // �Է� ���ۿ� ���� ���๮�� ���ſ�
			
			switch(menuNum) {
			// ���� ȣ���� �޼��尡 return �ϴ� �� �� �����ϱ�!
			case 1 : System.out.println( signUp() ); break;
			case 2 : System.out.println( login() );  break;
			case 3 : System.out.println( selectMember() ); break;
			case 4 : 
				int result = updateMember(); 
			
			if(result == -1) {
				System.out.println("�α��� �� �̿�ٶ�");
			} else if(result == 0) {
				System.out.println("ȸ�� ���� ���� ����(��й�ȣ ����ġ)");
			} else {
				// result == 1
				System.out.println("ȸ�� ������ �����Ǿ����ϴ�!");
			}
			break;
			case 0 : System.out.println("���α׷� ����.."); break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�. �޴��� �ִ� ��ȣ�� �Է����ּ���.");
			}
			
		}while(menuNum != 0); // menuNum�� 0�̵Ǹ� �ݺ� ����
			
		
	}
	// ȸ�� ���� ���
public String signUp() { // �޼��� ����
		
		System.out.println("\n*********ȸ�� ����**********");
		
		System.out.print("���̵� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		System.out.print("��й�ȣ Ȯ�� : ");
		String memberPw2 = sc.next();
		
		System.out.print("�̸� : ");
		String memberName = sc.next();
		
		System.out.print("���� : ");
		int memberAge = sc.nextInt();
		
		// ��й�ȣ, ��й�ȣ Ȯ���� ��ġ�ϸ� ȸ������
		// ��ġ���� ������ ȸ������ ����
		
		if( memberPw.equals(memberPw2) ) { // ��ġ�ϴ� ���
			
			// ȸ�� ���� ?
			// ���ο� ȸ�� ��ü�� ����
			// -> Member Ŭ���� �̿��ؼ� ���ο� ��ü ����
			// -> �Ű����������� �̿�
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			
			
			return "ȸ�� ���� ����!!!";
			
		} else { // ��ġ���� �ʴ� ���
			
			return "ȸ�� ���� ����!! (��й�ȣ ����ġ)";
		}
		
		
	}
	
	
	// �α��� ���
	// ȸ�������� �Ǿ��ִ� ����� �ִ��� ������ �˻�
	// ���� �Է��� ���̵�� ��й�ȣ�� ������ ����� ������ �ִ��� Ȯ��!
	public String login() {
		
		System.out.println("\n********�α���*********");
		
		// ȸ�������� �ߴ������� Ȯ��
		// == memberInfo�� ��ü�� �����ϰ� �ִ��� Ȯ�� 
		// == null���� �ƴ��� Ȯ��

		if(memberInfo == null) { // ȸ�������� ���� ���
			// null : �ƹ��͵� �����ϰ� ���� ����
			return "ȸ�����Ժ��� �������ּ���!";
			// return ��;
			// -> ���� �޼��� �����ϰ� 
			// ���� ������ �ش� �޼��带 ȣ���������� �ǵ��ư�
		} 
		
		// ȸ�� ���� �ߴٸ�, �ش� �������� ������ �� ����
		// �α��� ��� ����
		System.out.print("���̵� : ");
		String memberId = sc.next();
		
		System.out.print("��й�ȣ : ");
		String memberPw = sc.next();
		
		// ȸ�� ���� ����(memberInfo�� �����ϴ� Member��ü)��
		// ����� ���̵�, ��й�ȣ��
		// �Է��� ���̵�, ��й�ȣ�� ������ "�α��� ����"
		// ���� ������ "���̵� �Ǵ� ��й�ȣ ����ġ" ����
		
		// ���̵�, ��й�ȣ�� ��� ��ġ�� ���
		if( memberId.equals(memberInfo.getMemberId()) && 
		memberPw.equals(memberInfo.getMemberPw()) ) {
			
			// �α����� ����� ������ ����Ű��
			// loginMember�� ���� �α����� ����� ������ ����Ű��
			// == loginMember�� memberInfo�� �����ϰ��ִ� ��ü�� �ּ� ����
			loginMember = memberInfo;
			// ��������
			
			// int[] arr = {1,2,3};
			// int[] newArr = arr;
			
			// ȸ������ ������ loginMember�� �����Ͽ�
			// � ȸ���� �α����ߴ����� ������ �� �ְ���!
			return loginMember.getMemberName() + "�� ȯ���մϴ�";
			
		} else {
			
			return "���̵� �Ǵ� ��й�ȣ�� ��ġ���� �ʽ��ϴ�!";
			
		}
		
	}
	// ȸ�� ���� ��ȸ ���
		// -> ��ȸ�Ϸ���?
		// -> �α����� �ߴ��� ���ߴ��� Ȯ��
		// 1. �α��� ������? ���� �α����� ����� ������ �����ϰ� �ִ� ��ü����
		// ���� ������ (�̸�, ���̵�, ����)
		// 2. �α��� ��������? �α��� �� �̿����ּ���
		public String selectMember() {
			System.out.println("\n******ȸ�� ���� ��ȸ*******");
			
			// 1) �α��� ���� Ȯ��
			if( loginMember == null ) {
				return "�α��� �� �̿����ּ���";
			}
			
			// 2) �α����� �Ǿ��ִ� ���
			// �̸� : ȫ�浿
			// ���̵� : user01
			// ���� : 20��
			
			String str = "�̸� : " + loginMember.getMemberName();
			str += "\n���̵� : " + loginMember.getMemberId();
			str += "\n���� : " + loginMember.getMemberAge() + "��";
			
			return str;
			
			
		}
		
		
		// ȸ�� ���� ���� ���
		public int updateMember() {
			
			System.out.println("\n*****ȸ�� ���� ����******");
			
			// 1) �α��� ���� �Ǻ�
			// �α����� �Ǿ����� ������ -1 ��ȯ
			if(loginMember == null) {
				return -1;
			}
			
			// 2) �α����� �Ǿ����� ��
			// 2-1) ������ ȸ�� ���� �Է� �ޱ�(�̸�, ����)
			System.out.print("������ �̸� �Է� : ");
			String inputName = sc.next();
			
			System.out.print("������ ���� �Է� : ");
			int inputAge = sc.nextInt();
			
			// 2-2) ��й�ȣ�� �Է¹޾Ƽ� ���� �α����� ȸ���� ��й�ȣ�� 
			// 		��ġ�ϴ��� Ȯ��
			System.out.print("��й�ȣ �Է� : ");
			String inputPw = sc.next();
			
			if( inputPw.equals(loginMember.getMemberPw()) ) {
				// -> ��й�ȣ�� ��ġ�ϴ� ��� , 
				// 	�α����� ȸ���� �̸��� ���� ������
				//		�Է¹��� ������ ���� �� 1 ��ȯ
				loginMember.setMemberName(inputName);
				loginMember.setMemberAge(inputAge);
				
				return 1;
				
			} else {
				// -> ��й�ȣ�� �ٸ� ��� 0 ��ȯ
				return 0;
			}
			
			
		}
}

