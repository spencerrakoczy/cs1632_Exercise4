import java.util.*;

public class RentACat{
	
	public static void Main(String[] args){
		ArrayList<Cat> cats=new ArrayList<Cat>();
		ArrayList<Customer> customers=new ArrayList<Customer>();
		Scanner ui = new Scanner(System.in);
		int choice;
		while(true)
			System.out.println("Option [1,2,3,4] > ");
			choice = ui.nextInt();
			ui.next();
			if(choice==1){ //show list of cats for rent
				for(Cat c : cats){
					System.out.println(c.toString);
				}
			}else if(choice==2){ //rent a cat to a customer
				System.out.println("Customer ID > ");
				int cid = ui.nextInt();
				ui.next();
				boolean customerFound=false;
				Customer rentTo;
				for(Customer cu: customers){
					rentTo=cu;
					if(cid==cu.getId()){
						customerFound=true;
						break;
					}
				}
				if(customerFound!=true){
					System.out.println("Customer ID invlid");
					continue;
				}
				//if we get here the customer has been found
				System.out.println("Rent which cat? > ");
				int catId= ui.nextInt();
				ui.next();
				Cat toRent;
				boolean catFound=false;
				for(Cat cp : cats){
					toRent=cp;
					if(catId==cp.getId()){
						if(cp.isAvailable()){
							catFound=true;
							break
						} else{
							System.out.println("Sorry, "+ cp.getName +" is not here.");
							continue;
						}
					}
				}
				if(catFound!=true){
					System.out.println
				}
			}else if (choice==3){ //return a cat

			}else if (choice==4){ //quit

			} else {
				System.out.println("Invalid Option! ");
			}
		
	}
	public static void initialize(Arraylist ct, Arraylist cust){
		Cat c1=new Cat("Skerp", 1, 100.00);
		Cat c2=new Cat("Derp", 2, 200.00);
		Customer cu1=new Customer("Charles", 1);
		Customer cu2=new Customer("Manfried", 2);
		ct.add(c1);
		ct.add(c2);
		cust.add(cu1);
		cust.add(cu2);
	}


}