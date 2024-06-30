
public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			double math=64,english=76.5,chinese=66;
			ImportantUniversity univer = new ImportantUniversity();
			univer.enterRule(math,english,chinese);//Calling rewritten methods
			math=89;
			english=80;
			chinese=86;
			univer = new ImportantUniversity();
			
			
			univer.enterRule(math,english,chinese);//Calling rewritten methods
			
		
	}

}
