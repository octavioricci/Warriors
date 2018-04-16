import ia.battle.core.ConfigurationManager;
import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.WarriorManager;
import ia.exceptions.RuleException;

public class Trainer extends WarriorManager{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Calzaretto-Ricci Trainer";
	}

	@Override
	public Warrior getNextWarrior() throws RuleException {
		// TODO Auto-generated method stub
		
		// Max points for a warrior
		int maxStats = ConfigurationManager.getInstance().getMaxPointsPerWarrior();
		
		int localHealth = maxStats / 5;
		int localDefense = maxStats / 5;
		int localStrenght = maxStats / 5;
		int localSpeed = maxStats / 5;
		int localRange = maxStats / 5;
		
		return new SAS("SAS", 20, 20, 20, 20, 20);
		
		/*
		if (getCount() > 5) 
			return new SAS("SAS", 20, 20, 20, 20, 20);
		else
			return new SoldierOfFortune("SoF", 10, 30, 20, 10, 30);
		*/
		
		
	}
	
	public final void RememberWasAttacked(FieldCell source,int damage,String warrior ) {
		System.out.println(warrior + " was attacked in position " + source.getX() + source.getY() + " with a damage of: " + damage);
	}
	
		
}
