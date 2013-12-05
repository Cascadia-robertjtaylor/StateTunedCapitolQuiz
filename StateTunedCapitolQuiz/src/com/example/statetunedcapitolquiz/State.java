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
	/*public String toString()
	{
		return _name,
			_capitol,
			_city1,
			_city2,
			_image;
	}*/
}
