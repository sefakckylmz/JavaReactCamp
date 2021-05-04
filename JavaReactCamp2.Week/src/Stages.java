
public class Stages {

		private String day;
		private String syllabus;
		private String record;
		private String homework;
		private String evaluation;
		
		public Stages() {
			
		}

		public Stages(String day, String syllabus, String record, String homework, String evaluation) {
			super();
			this.day = day;
			this.syllabus = syllabus;
			this.record = record;
			this.homework = homework;
			this.evaluation = evaluation;
		}

		public String getDay() {
			return day;
		}

		public void setDay(String day) {
			this.day = day;
		}

		public String getSyllabus() {
			return syllabus;
		}

		public void setSyllabus(String syllabus) {
			this.syllabus = syllabus;
		}

		public String getRecord() {
			return record;
		}

		public void setRecord(String record) {
			this.record = record;
		}

		public String getHomework() {
			return homework;
		}

		public void setHomework(String homework) {
			this.homework = homework;
		}

		public String getEvaluation() {
			return evaluation;
		}

		public void setEvaluation(String evaluation) {
			this.evaluation = evaluation;
		}
		
}
