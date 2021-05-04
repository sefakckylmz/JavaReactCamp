
public class Main {

	public static void main(String[] args) {
		
	
		Education education1 = new Education("C# + ANGULAR","Engin DEMÝROÐ","C# ile Programlama",36,"resim adresi1");
		
		Education education2 = new Education("Java + React","Engin DEMÝROÐ","Java ile Programlama",56,"resim adresi2");
	
		Education education3 = new Education("Programlamaya Giriþ için Temel Kurs","Engin DEMÝROÐ","Yeni Baþlayanlar için Programlama",80,"resim adresi3");
	
	
		Education [] educations = {education1,education2,education3};
		
		for (Education education : educations) {
			System.out.println(education.getName());
			System.out.println(education.getInstructor());
			System.out.println(education.getContent());
			System.out.println(education.getPercentageOfCompletion());
			System.out.println(education.getPicture());
			System.out.println("------------------------");
		}
		
		EducationManager educationManager = new EducationManager();
		
		educationManager.JoinToEducation(education1);
		educationManager.LeaveToEducation(education1);
		educationManager.JoinToEducation(education2);
		educationManager.LeaveToEducation(education2);
		educationManager.JoinToEducation(education3);
		educationManager.LeaveToEducation(education3);
		System.out.println("------------------------");
		
		Stages stages1 = new Stages("1.Gün","1.Gün Ders Programý","1.Gün kaydý","1.Gün Ödevi","1.Gün Deðerlendirme");
		
		Stages stages2 = new Stages("2.Gün","2.Gün Ders Programý","2.Gün kaydý","2.Gün Ödevi","2.Gün Deðerlendirme");
	
		Stages stages3 = new Stages("3.Gün","3.Gün Ders Programý","3.Gün kaydý","3.Gün Ödevi","3.Gün Deðerlendirme");
	
	
		Stages [] stagess = {stages1,stages2,stages3};
		
		for (Stages stages : stagess) {
			System.out.println(stages.getDay());
			System.out.println(stages.getSyllabus());
			System.out.println(stages.getRecord());
			System.out.println(stages.getHomework());
			System.out.println(stages.getEvaluation());
			System.out.println("------------------------");
		}
		StagesManager stagesManager = new StagesManager();
		
		stagesManager.Completed(stages1);
		stagesManager.UnCompleted(stages1);
		stagesManager.Completed(stages2);
		stagesManager.UnCompleted(stages2);
		stagesManager.Completed(stages3);
		stagesManager.UnCompleted(stages3);
	}

}
