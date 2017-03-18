/**************************************************************************
Developed by: Onur Berk Töre
Purpose: Creating Seagull Scheme for different Attack Types

**************************************************************************/


package rushhour;

import java.util.Vector;

public class AttackType {

	int ID;
	int mode;
	Vector<Seagull> seagulls = new Vector<Seagull>();
	
	public AttackType(int ID,String Scheme,int Mode){
		
		this.ID = ID;
		this.mode = Mode;
		
		generateScheme(Scheme,Mode);
		
	}
	
	
	//Under Construction
	public void generateScheme(String Scheme,int mode){
		int seagullNumber = mode * 2;
		
		if(Scheme == "Triangle"){
			for(int i = 0; i< (2*seagullNumber)-1; i++ )
			{
				for(int j = 0; j < (2*seagullNumber)-1; j++)
				{
					
					
					if(i < seagullNumber){
						if(j <=seagullNumber-i || j > seagullNumber + i){
							//Do Nothing;
						}
					}
					
				}
			}
		}
	}
	
	
}
