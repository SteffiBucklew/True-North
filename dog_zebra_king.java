public class StrategicConsultingService {
	public static void main(String[] args) {
		// Constructor
		StrategicConsultingService scs = new StrategicConsultingService();
		
		// Variables
		String purpose, goals, direction;
		
		// Methods
		public void identifyPurpose(){
			purpose = "To help businesses utilize their resources in order to maximize their potential and create success.";
		}
		
		public void identifyGoals(){
			goals = "To focus on the customer experience, increase efficiency, encourage innovation, and build brand recognition.";
		}
		
		public void identifyDirection(){
			direction = "To develop a strategy that considers the business's current environment, resources, and objectives.";
		}
		
		public String generateStrategy(String purpose, String goals, String direction){
			return purpose + " " + goals + " " + direction;
		}
		
		public void consult(){
			scs.identifyPurpose();
			scs.identifyGoals();
			scs.identifyDirection();
			
			String strategy = scs.generateStrategy();
			System.out.println(strategy);
		}
	}
}