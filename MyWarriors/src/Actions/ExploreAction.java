package Actions;

import java.util.ArrayList;

import ia.battle.core.BattleField;
import ia.battle.core.ConfigurationManager;
import ia.battle.core.FieldCell;
import ia.battle.core.actions.Move;

public class ExploreAction extends Move{

	private FieldCell from;
	private int moveX, moveY;
	
	public ExploreAction(FieldCell from, int toX, int toY) {
		
		this.from = from;
		this.moveX = toX;
		this.moveY = toY;
	}
	
	@Override
	public ArrayList<FieldCell> move() {
		
		// Get the x and y where i am positioned
		int x = from.getX();
		int y = from.getY();
		
		ArrayList<FieldCell> path = new ArrayList<FieldCell>();
		
		// while my actual position in X is not the position i want to move
		// until i get the destination i want to go
		// Asks if the warrior has reached the map boundary on the right
		int destinationX = x + this.moveX;
		for (; x < destinationX ; x++) {
			if (x < ConfigurationManager.getInstance().getMapWidth() -1 )
				path.add(BattleField.getInstance().getFieldCell(x, y));
			else {
				x--;
				break;
			}
				
		}
		
		
		
		// while my actual position in Y is not the position i want to move
		// until i get the destination i want to go
		// Asks if the warrior has reached the map boundary at the top
		int destinationY = y + this.moveY;
		for (; y < destinationY ; y++) {
			if (y < ConfigurationManager.getInstance().getMapHeight())
				path.add(BattleField.getInstance().getFieldCell(x, y));
			
		}
		
		return path;
	
	}

	
}
