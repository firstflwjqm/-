package quiz;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog("가로 면적을 입력해주세요");
		String b = JOptionPane.showInputDialog("세로 면적을 입력해주세요");
		if(a!=null&&!a.equals("")&&b!=null&&!b.equals("")) {
			int width = Integer.parseInt(a);
			int height = Integer.parseInt(b);
			System.out.printf("가로: %d, 세로: %d, 면적: %d", width, height, width*height);
		}
		else {
			System.out.println("아무것도 입력안하셨거나, 취소버튼을 눌르셨습니다");			
		}
	}

}
