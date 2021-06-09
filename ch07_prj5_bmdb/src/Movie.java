
public class Movie {

		private int ID;
		private String Title;
		private int Year;
		private String Rating;
		private String Director;
		
		public static String staticVariable;
		
		public Movie() {
			
		}
		
		public Movie(int ID, String Title, int Year, String Rating, String Director) {
			super();
			this.ID = ID;
			this.Title = Title;
			this.Rating = Rating;
			this.Director = Director;
		}
	}
