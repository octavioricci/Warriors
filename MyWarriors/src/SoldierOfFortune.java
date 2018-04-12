import ia.battle.core.FieldCell;
import ia.battle.core.Warrior;
import ia.battle.core.actions.Action;
import ia.exceptions.RuleException;

public class SoldierOfFortune extends Warrior {

	public SoldierOfFortune(String name, int health, int defense, int strength, int speed, int range)
			throws RuleException {
		super(name, health, defense, strength, speed, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Action playTurn(long tick, int actionNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void wasAttacked(int damage, FieldCell source) {
		// TODO Auto-generated method stub
		
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
