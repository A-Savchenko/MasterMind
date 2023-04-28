//package com.company;
//
///**
// *  This class creates and manages one array of pegs from the game MasterMind.
// *
// *  @author Artem Savchenko
// *  @since 10/7/22
// */
//
//public class PegArray {
//
//	// array of pegs
//	private Peg [] pegs;
//
//	// the number of exact and partial matches for this array
//	// as matched against the master.
//	// Precondition: these values are valid after getExactMatches() and getPartialMatches()
//	//				are called
//	private int exactMatches, partialMatches;
//
//	/**
//	 *	Constructor
//	 *	@param numPegs	number of pegs in the array
//	 */
//	public PegArray(int numPegs) {
//		pegs = new Peg[numPegs];
//		for(int i = 0; i < numPegs; i++)
//		{
//			pegs[i] = new Peg();
//		}
//	}
//	public void setPeg(int n, char c)
//	{
//		pegs[n].setLetter(c);
//	}
//	/**
//	 *	Return the peg object
//	 *	@param n	The peg index into the array
//	 *	@return		the peg object
//	 */
//	public Peg getPeg(int n) {
//		return pegs[n];
//	}
//
//	/**
//	 *  Finds exact matches between master (key) peg array and this peg array
//	 *	Postcondition: field exactMatches contains the matches with the master
//	 *  @param master	The master (code) peg array
//	 *	@return			The number of exact matches
//	 */
//	public int getExactMatches(PegArray master) {
//		for(int i = 0; i < 4 ; i++)
//		{
//			if(master.getPeg(i).getLetter()==pegs[i].getLetter()) exactMatches++;
//		}
//		return exactMatches;
//	}
//
//	/**
//	 *  Find partial matches between master (key) peg array and this peg array
//	 *	Postcondition: field partialMatches contains the matches with the master
//	 *  @param master	The master (code) peg array
//	 *	@return			The number of partial matches
//	 */
//	public int getPartialMatches(PegArray master) {
//		String masterCode = "";
//		for(int i = 0; i < 4; i++)
//		{
//			masterCode += master.getPeg(i).getLetter();
//		}
//		for(int i = 0; i < 4; i++)
//		{
//			int index = masterCode.indexOf(pegs[i].getLetter());
//			if(index != -1)
//			{
//				partialMatches++;
//				masterCode = masterCode.substring(0, index) + 'X' + masterCode.substring(index + 1);
//			}
//		}
//		return partialMatches;
//	}
//
//	// Accessor methods
//	// Precondition: getExactMatches() and getPartialMatches() must be called first
//	public int getExact() { return exactMatches; }
//	public int getPartial() { return partialMatches; }
//
//}