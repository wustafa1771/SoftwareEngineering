/**************************************************************************
Developed by: Onur Berk Tore
Purpose: Player Class For Our Game

**************************************************************************/



package RushHour;

public class UcgenPeynir extends powerUps{

	UcgenPeynir(int level){
		name = "UcgenPeynir";
		multiplyVel = 1;
		extraTime = level * 5 ;
		shield = false;
		duration = 0;
	}
}
