
public class Education {

		private String name;
		private String instructor;
		private String content;
		private int percentageOfCompletion;
		private String picture;
		
		public Education() {
			
		}

		public Education(String name, String instructor, String content, int percentageOfCompletion, String picture) {
			super();
			this.name = name;
			this.instructor = instructor;
			this.content = content;
			this.percentageOfCompletion = percentageOfCompletion;
			this.picture = picture;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getInstructor() {
			return instructor;
		}

		public void setInstructor(String instructor) {
			this.instructor = instructor;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public int getPercentageOfCompletion() {
			return percentageOfCompletion;
		}

		public void setPercentageOfCompletion(int percentageOfCompletion) {
			this.percentageOfCompletion = percentageOfCompletion;
		}

		public String getPicture() {
			return picture;
		}

		public void setPicture(String picture) {
			this.picture = picture;
		}
		
		
		
		
}
