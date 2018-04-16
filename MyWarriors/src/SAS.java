import Actions.ExploreAction;
import ia.battle.core.BattleField;
import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.WarriorData;
import ia.battle.core.actions.Action;
import ia.battle.core.actions.Attack;
import ia.exceptions.RuleException;

public class SAS extends Warrior {


	public SAS(String name, int health, int defense, int strength, int speed, int range) throws RuleException {
		super(name, health, defense, strength, speed, range);
		// TODO Auto-generated constructor stub
	
		 
	}

	// Core method
	@Override
	public Action playTurn(long tick, int actionNumber) {
		// TODO Auto-generated method stub
		
		WarriorData enemyData = BattleField.getInstance().getEnemyData();
		
		
		// If enemy is in my range
		if ( enemyData.getInRange()) {
			return new Attack(enemyData.getFieldCell());
		}
		
		else {
			return new ExploreAction(this.getPosition(), 1 , 2  );
		}
		
		
		
	}

	@Override
	public void wasAttacked(int damage, FieldCell source) {
		
		// Is it casted because rememberWasAttacked it's only
		// a Trainer method, not from Warriormanager
		((Trainer)this.getWarriorManager()).RememberWasAttacked(source,damage,this.getName());
		
	}

	@Override
	public void enemyKilled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void worldChanged(FieldCell oldCell, FieldCell newCell) {
		// TODO Auto-generated method stub
		
	}
	

}
