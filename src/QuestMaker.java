import java.util.*;

public class QuestMaker {

	public char[] v = {'a','e','i','o','u'};
	public String[] action = {"Search for", "Hunt", "Collect","Slay ","Shop for","Destroy","Meet with","Date"};
	public String[] prefix = {"for","with",""};
	public String[] monsters = {"Goblin","Baneling","Emerald Dragon","Viper","Marianne","Crab","Amon","Uthar"};
	public String[] flavor = {"in the Mountains of Azbalor"," from the Castle's peak of Mt Doom",
								"into the depths of the Dark Woods of Rivendell"};
	public String make(){
		return this.action[ new Random().nextInt(this.action.length)] + " " + this.checkLetter(this.monsters[new Random().nextInt(this.monsters.length)] + " "+this.flavor[new Random().nextInt(this.flavor.length)]);
	}
	

	public String checkLetter(String text){
		char letter = text.toLowerCase().charAt(0);
		for(int i = 0; i < v.length; i++){
			if(letter == v[i]){
				return "an "+text;
			}
		}
		return "a "+text;

	}
}
