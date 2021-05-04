
public class Main {

	public static void main(String[] args) {
		
	
		Education education1 = new Education("C# + ANGULAR","Engin DEM�RO�","C# ile Programlama",36,"resim adresi1");
		
		Education education2 = new Education("Java + React","Engin DEM�RO�","Java ile Programlama",56,"resim adresi2");
	
		Education education3 = new Education("Programlamaya Giri� i�in Temel Kurs","Engin DEM�RO�","Yeni Ba�layanlar i�in Programlama",80,"resim adresi3");
	
	
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
		
		Stages stages1 = new Stages("1.G�n","1.G�n Ders Program�","1.G�n kayd�","1.G�n �devi","1.G�n De�erlendirme");
		
		Stages stages2 = new Stages("2.G�n","2.G�n Ders Program�","2.G�n kayd�","2.G�n �devi","2.G�n De�erlendirme");
	
		Stages stages3 = new Stages("3.G�n","3.G�n Ders Program�","3.G�n kayd�","3.G�n �devi","3.G�n De�erlendirme");
	
	
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
