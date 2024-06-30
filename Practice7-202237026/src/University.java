
public class University {

		
	void enterRule(double math, double english, double chinese) {
			
			double total=math+english+chinese;
			if(total>=180)
			System.out.println("Exam scores"+
			total+"Reaching the minimum admission line for universities");
			else
			System.out.println("Exam scores"+total+
			
			"Not meeting the minimum admission requirements for universities");
		
		
	}

}
