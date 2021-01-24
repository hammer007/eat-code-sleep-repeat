package com.hammer.codilitylessons;

public class FrogJmp {

	public static void main(String[] args) {
		int ans = solution(3, 999111321, 7);
		System.out.println("General print"+ans);
		if(ans == 3) {
			System.out.println("print"+ans);
		}
	}
	
	public static int solution(int X, int Y, int D) {
	    if(D<=0 || X<0 || Y<0 || X == Y || X>Y){
            return 0;
        } 
        else
            return ((Y-X)%D==0)?(Y-X)/D:(Y-X)/D+1;		
	}
}

/*
 *   --- Easier Solution ---(1,5,2)
 	if(D<=0 || X<0 || Y<0 || X == Y || X>Y) {
     
        	return 0;
        }
        else 
            return (X+Y)/D;
*/



/*  --- Correctness 100%, but performance or time complexity is high for many test cases.
		int count = 0;
        int sum = X;
        if(D<=0 || X<0 || Y<0 || X >= Y) {
        	return 0;
        }
        for(int i=0;i<=Y/2;i++){
            sum = sum + D;
            count++;
            if( sum >= Y){
            	break;
            }
        }
        return count;		*/

/*
 *  if(D<=0 || X<0 || Y<0 || X == Y || X>Y){
            return 0;
        } 
        int sum=X;
        int count = 0;
        do{
        	sum = sum + D;
            count++;
        }while(sum <= Y);
        return count;
    }
    
    Test cases>> (3, 999111321, 7), (1,5,2), 
    */

/*
        if(D<=0 || X<0 || Y<0 || X == Y || X>Y){
            return 0;
        } 
        else
            return ((Y-X)%D==0)?(Y-X)/D:(Y-X)/D+1;
*/
