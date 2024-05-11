package org.Ramesh.Siva;



public class PanCard
{
		private String name;
		private String Place;
		
		public void DisplayAttributes()
		{
			System.out.println("Name :"+name);
			System.out.println("Pace :"+Place);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPlace() {
			return Place;
		}

		public void setPlace(String place) {
			Place = place;
		}
		
}
