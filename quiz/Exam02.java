package quiz;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String h = JOptionPane.showInputDialog("키를 입력해주세요");
		if(h!=null&&!h.equals("")) {
			int height = Integer.parseInt(h);		
			System.out.printf("%dcm의 적정체중은 %f입니다.",height,(height-100)*0.9d);
			
		}
		else {
			System.out.println("잘못 입력하셨습니다.(아무것도 입력안하셨거나, 취소를 눌르셨습니다.)");
			
		}
	}

}
