public class State {
	private String _name;
	private String _capitol;
	private String _city1;
	private String _city2;
	//private String _image; This needs to be the path to the file, but not sure yet how to return it
	
	
	public State(String name, String capitol, String, city1, String city2)
	{
		_name = name;
		_capitol = capitol;
		_city1 = city1;
		_city2 = city2;
		//Will need to change this method to include the image
	}
	public String toString()
	{
		return _name;
		return _capitol;
		return _city1;
		return _city2;
		//return _image; Will try to implement the name part of this first, then come back to add the image.
	}
}