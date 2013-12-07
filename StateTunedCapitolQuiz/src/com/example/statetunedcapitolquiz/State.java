package com.example.statetunedcapitolquiz;

public class State {
	private String _name;
	private String _capitol;
	private String _city1;
	private String _city2;
	private String _image; //file name of the state image
	
	
	public State(String name, String capitol, String city1, String city2, String image)
	{
		_name = name;
		_capitol = capitol;
		_city1 = city1;
		_city2 = city2;
		_image = image;
	}
	

	public String getName() {
		   return _name;
		 }
	 
	 public String getCapitol() {
		   return _capitol;
		 }
	 
	 public String getCity1() {
		   return _city1;
		 }
	 
	 public String getCity2() {
		   return _city2;
		 }
	 
	 public String getImage() {
		   return _image;
		 }
	 
	 public static void buildArray(State[] a)
	 {
		 a[0] = new State("Alabama", "Montgomery", "Birmingham", "Mobile", "AL.png");
		 a[1] = new State("Alaska", "Juneau", "Anchorage", "Fairbanks", "AK.png");
		 a[2] = new State ("Arizona", "Phoenix", "Tucson", "Mesa", "AZ.png");
		 a[3] = new State ("Arkansas", "Little Rock", "Fort Smith", "Fayetteville", "AR.png");
		 a[4] = new State ("California", "Sacramento", "Los Angeles", "San Diego", "CA.png");
		 a[5] = new State ("Colorado", "Denver", "Colorado Springs", "Aurora", "CO.png");
		 a[6] = new State ("Connecticut", "Hartford", "Bridgeport", "New Haven","CT.png");
		 a[7] = new State ("Delaware", "Dover", "Wilmington", "Neward", "DE.png");
		 a[8] = new State ("Florida", "Tallahassee", "Jacksonville", "Miami", "FL.png");
		 a[9] = new State ("Georgia", "Atlanta", "Augusta", "Columbus", "GA.png");
		 a[10] = new State ("Hawaii", "Honolulu", "Hilo", "Kailua", "HI.png");
		 a[11] = new State ("Idaho", "Boise", "Nampa", "Meridian", "ID.png");
		 a[12] = new State ("Illinois", "Springfield", "Chicago", "Aurora", "IL.png");
		 a[13] = new State ("Indiana", "Indianapolis", "Fort Wayne", "Evansville", "IN.png");
		 a[14] = new State ("Iowa", "Des Moines", "Cedar Rapids", "Davenport", "IA.png");
		 a[15] = new State ("Kansas", "Topeka", "Wichita", "Overland Park", "KS.png");
		 a[16] = new State ("Kentucky", "Frankfort", "Louisville", "Lexington", "KY.png");
		 a[17] = new State ("Louisiana", "Baton Rouge", "New Orleans", "Shreveport", "LA.png");
		 a[18] = new State ("Maine", "Augusta", "Portland", "Lewiston", "ME.png");
		 a[19] = new State ("Maryland", "Annapolis", "Baltimore", "Columbia", "MD.png");
		 a[20] = new State ("Massachusetts", "Boston", "Worcester", "Springfield", "MA.png");
		 a[21] = new State ("Michigan", "Lansing", "Detroit", "Grand Rapids", "MI.png");
		 a[22] = new State ("Minnesota", "St. Paul", "Minneapolis", "Rochester", "MN.png");
		 a[23] = new State ("Mississippi", "Jackson", "Gulfport", "Hattiesburg", "MS.png");
		 a[24] = new State ("Missouri", "Jefferson City", "Kansas City", "Saint Louis", "MO.png");
		 a[25] = new State ("Montana", "Helena", "Billings", "Missoula", "MT.png");
		 a[26] = new State ("Nebraska", "Lincoln", "Omaha", "Bellevue", "NE.png");
		 a[27] = new State ("Nevada", "Carson City", "Las Vegas", "Henderson", "NV.png");
		 a[28] = new State ("New Hampshire", "Concord", "Manchester", "Nashua", "NH.png");
		 a[29] = new State ("New Jersey", "Trenton", "Newark", "Jersey City", "NJ.png");
		 a[30] = new State ("New Mexico", "Santa Fe", "Albuquerque", "Las Cruces", "NM.png");
		 a[31] = new State ("New York", "Albany", "New York City", "Buffalo", "NY.png");
		 a[32] = new State ("North Carolina", "Raleigh", "Charlotte", "Greensboro", "NC.png");
		 a[33] = new State ("North Dakota", "Bismark", "Fargo", "Grand Forks", "ND.png");
		 a[34] = new State ("Ohio", "Columbus", "Cleveland", "Cincinnati", "OH.png");
		 a[35] = new State ("Oklahoma", "Oklahoma City", "Tulsa", "Norman", "OK.png");
		 a[36] = new State ("Oregon", "Salem", "Portland", "Eugene", "OR.png");
		 a[37] = new State ("Pennsylvania", "Harrisburg", "Philadelphia", "Pittsburg", "PA.png");
		 a[38] = new State ("Rhode Island", "Providence", "Warwick", "Cranston", "RI.png");
		 a[39] = new State ("South Carolina", "Columbia", "Charleston", "North Charleston", "SC.png");
		 a[40] = new State ("South Dakota", "Pierre", "Sioux Falls", "Rapid City", "SD.png");
		 a[41] = new State ("Tennesee", "Nashville", "Memphis", "Knoxville", "TN.png");
		 a[42] = new State ("Texas", "Austin", "Houston", "San Antonio", "TX.png");
		 a[43] = new State ("Utah", "Salt Lake City", "West Valley City", "Provo", "UT.png");
		 a[44] = new State ("Vermont", "Montpelier", "Burlington", "Essex", "VT.png");
		 a[45] = new State ("Virginia", "Richmond", "Virginia Beach", "Norfolk", "VA.png");
		 a[46] = new State ("Washington", "Olympia", "Seattle", "Spokane", "WA.png");
		 a[47] = new State ("West Virginia", "Charleston", "Huntington", "Parkersburg", "WV.png");
		 a[48] = new State ("Wisconsin", "Madison", "Milwaukee", "Green Bay", "WI.png");
		 a[49] = new State ("Wyoming", "Cheyenne", "Casper", "Laramie", "WY.png");
	 }
}