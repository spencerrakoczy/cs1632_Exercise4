public class Customer{
	String _name;
	int _id;
	public Customer(String name, int id){
		_name=name;
		_id=id;
	}
	public String getName(){
		return _name;
	}
	public int getId(){
		return _id;
	}
}