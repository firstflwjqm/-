package quiz;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("통신사를 입력하세요"); 
		String b = JOptionPane.showInputDialog("전화번호를 입력하세요"); 
		String c = JOptionPane.showInputDialog("이름을 입력하세요");
		String[] arr = {a,b,c};
		for(String i : arr) {
			if(i==null||i.equals(""))
				System.out.println("공백이나 취소를 입력하셨네요 프로그램을 다시 시작해주세요");
				System.exit(0);
		}
		
		String d = c+"님은 "+a+"에 "+b+"로 가입되셨습니다.";
		System.out.println(d);
	}

}
