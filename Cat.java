import java.util.*;
public class Cat{
	String _name;
	double _price;
	int _id;
	boolean _currentlyRented;
	ArrayList<Customer> _renters= new ArrayList<Customer>();
	public Cat(String name, int id, double price){
		_name=name;
		_id=id;
		_price=price;
		_currentlyRented=false;
	}
	public void rentCat(Customer c){
		_renters.add(c);
		_currentlyRented=true;

	}
	public void returnCat(Customer c){
		_currentlyRented=false;
	}
	public String getName(){
		return _name;
	}
	public double getId(){
		return _id;
	}
	public boolean isAvailable(){
		return !_currentlyRented;
	}
	public String toString(){
		String catString="ID " + _id + ". " + _name + ": $" + _price + " / day";
	}
}