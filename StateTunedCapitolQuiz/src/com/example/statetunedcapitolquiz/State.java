package com.example.statetunedcapitolquiz;

import java.util.ArrayList;

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
	
	 /*public ArrayList<State> getName() {
		   return _name;
		 }
	 
	 public ArrayList<State> getCapitol() {
		   return _capitol;
		 }
	 
	 public ArrayList<State> getCity1() {
		   return _city1;
		 }
	 
	 public ArrayList<State> getCity2() {
		   return _city2;
		 }
	 
	 public ArrayList<State> getImage() {
		   return _image;
		 }*/
	
	/*public String toString()
	{
		return 	_name;
	}
	
	public String toString()
	{
		return _capitol;
	}
	
	public String toString()
	{
		return _city1;
	}
	
	public String toString()
	{
		return _city2;
	}
	
	public String toString()
	{
		return _image;
	}*/
	
}


/*package com.example.activitylistexample;

public class Course {
	private String _name;
	public Course(String name)
	{
		_name = name;
	}
	
	@Override
	public String toString(){
		return _name;
	}

}
*/