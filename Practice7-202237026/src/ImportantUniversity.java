
public class ImportantUniversity extends University{

		void enterRule(double math, double english, double chinese) {
	
		double total=math+english+chinese;
		if(total>=220)
		System.out.println("Exam scores"+total+
		
		"Reaching the admission line for key universities");
		else
		System.out.println("Exam scores"+total+
		"Not meeting the admission criteria for key universities");
		
	}

}
