import java.util.ArrayList;

class Player extends Person {
		private String name;
	private int chips;
	private int bet=0;
	public Player(String name, int chips){
		this.name=name;
		this.chips=chips;
	}
	public String get_name(){
		return name;
	}
	public int make_bet(){
		bet=1;
		if (chips<=0){
			bet=0;
		}
		return bet;
	}
	@Override
	public boolean hit_me(Table table){
		boolean hit=false;
		if(getTotalValue()<=16){
			hit=true;
		}
		if(getTotalValue()>=17){
			hit=false;
		}
		return hit;
	
	}
	public int get_current_chips(){
		return chips;
		
	}
	public void increase_chips (int difference){
		chips+=difference;
	}
	public void say_hello(){
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");

	}
}

