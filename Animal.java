import java.util.Comparable;

public class Animal implements Comparable<Animal>{

	private String name;
	private int legs;

	public Animal(String _name, int _legs){
		name = _name;
		legs = _legs;
	}//constructor for Animal

	//getter functions
        public String getName(){
                return name;
        }

        public int getLegs(){
                return legs;
        }

	//setter functions
	public void setName(String _name){
		name = _name;
	}
	public void setLegs(int _legs){
		legs = _legs;
	}

	//overriding the compareTo methods by comparing the names.
	@Override
	public int compareTo(Animal o){
		return this.getName().compareTo(o.getName());
	}




}




