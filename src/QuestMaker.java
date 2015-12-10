import java.util.*;

public class QuestMaker {
	public String vowels = "aeiou";
	public String[] action = {"Search for", "Hunt", "Collect","Slay ","Shop for","Destroy","Meet with","Date with"};
	public String[] monsters = {"Goblin","Baneling","Emerald Dragon","Viper","Marianne","Crab","Amon","Uthar"};
	public String[] flavor = {"in the Mountains of Azbalor"," from the Castle's peak of Mt Doom",
								"into the depths of the Dark Woods of Rivendell"};
	public String make(){
		return this.action[ new Random().nextInt(this.action.length)] + " " + this.checkLetter(this.monsters[new Random().nextInt(this.monsters.length)] + " "+this.flavor[new Random().nextInt(this.flavor.length)]);
	}
	

	public String checkLetter(String text){
		char letter = text.toLowerCase().charAt(0);
		
	
		if(letter == 'a' | letter == 'e' | letter == 'i' | letter == 'o' | letter == 'u' ){
			return "an "+text;
		}else{
			return "a "+text;
		}
	}
}
