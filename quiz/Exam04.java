package quiz;

import javax.swing.JOptionPane;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] 질문 = {"Q1.이름은?","Q2.나이는?","Q.3사는지역은?","Q.4몸무게는?","Q,5직업이 프로그래머인가요? ture 또는 false로 대답해주세요","Q.6좋아하는 색은?"};
			String[] 대답 = new String[질문.length];

			for(int i=0;i<질문.length;i++) {
				while(true) 
				{
					대답[i] = JOptionPane.showInputDialog(질문[i]);
					if(대답[i] !=null && !(대답[i].equals(""))) 
					{ 
						if(i==1||i==3) 
						{
							if(!대답[i].matches("\\d+")) 
							{
								JOptionPane.showMessageDialog(null, "숫자를 입력하세요");
								continue;
							}
							
						}
						
						break;
					} 
					
					else 
					{ 
						JOptionPane.showMessageDialog(null, "다시 입력하세요(공백이나 취소를 클릭하지마세요)");
					}
				} 	
			}
			String name = 대답[0]; 
			int age = Integer.parseInt(대답[1]);
			String local = 대답[2];
			float weight = Float.parseFloat(대답[3]);				
			boolean job = Boolean.parseBoolean(대답[4]); 	
			String color = 대답[5];
			
			Friend f = new Friend(name,age,local,weight,job,color);
			System.out.println(f);
		
	}

}


class Friend{
	String name;
	int age;
	String local;
	float weight;
	boolean job;
	String color;
	
	
	@Override
	public String toString() 
	{
		return "친구의 이름은 " + name + "이고 나이는 " + age + "세이다.\n" + local + "에 살고있고 몸무게는" + weight + "킬로이다.\n좋아하는 색은"+color+"이/가 들어가는 색이고, 프로그래머 여부는 "+job
				+"이다.";
	}


	Friend(String name, int age, String local, float weight, boolean job, String color)
	{
		this.name=name;
		this.age=age;
		this.local=local;
		this.weight=weight;
		this.job=job;
		this.color=color;
	}
	
}