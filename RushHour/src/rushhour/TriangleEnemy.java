package RushHour;

import java.util.Iterator;
import java.util.Vector;



public class TriangleEnemy extends Enemy{
	
	void  move(){
		
	}
	void getDamaged(){
		
	}
	
	boolean FollowPlayer;
	

	
	TriangleEnemy(int ID){
		this.ID = ID;
		this.EnemyCounter = 4;
		/*
		 1 + 3
		   *
		  ***
		 */
		this.AttackType = "TriangleEnemy";
		
		
		Vector<Seagull> seagulls = new Vector<Seagull>();
		
		for(int i = 0; i < this.EnemyCounter; i++ ){
			//int ID,int health, int speed,int height,int width
			seagulls.add(new Seagull(i,50,1,100,100));
		}
		
		seagulls.elementAt(0).setHeight(100);
		seagulls.elementAt(0).setWidth(100);
		
		seagulls.elementAt(1).setHeight(100-10);
		seagulls.elementAt(1).setWidth(100+10);
		
		seagulls.elementAt(2).setHeight(100);
		seagulls.elementAt(2).setWidth(100+10);
		
		seagulls.elementAt(3).setHeight(100+10);
		seagulls.elementAt(3).setWidth(100+10);
		
		/*
		 *  		*
		 * 		*	*
		 * 			*
		 * 
		 */

		
		
		
	}
	
	
	
	
	
	

}
