/**
 * 
 */
package Interface;

/**
 * @author Dr.Mokter
 *
 */
public class MySports implements Football, Hockey {

	/* (non-Javadoc)
	 * @see Interface.Sports#setHomeTeam(java.lang.String)
	 */
	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Inside the setHomeTeam()");

	}

	/* (non-Javadoc)
	 * @see Interface.Sports#setVisitingTeam(java.lang.String)
	 */
	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Inside the setVisitingTeam()");

	}

	/* (non-Javadoc)
	 * @see Interface.Hockey#homeGoalScored()
	 */
	@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub
		System.out.println("Inside the homeGoalScored()");
	}

	/* (non-Javadoc)
	 * @see Interface.Hockey#visitingGoalScored()
	 */
	@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub
		System.out.println("Inside the visitingGoalScored()");
	}

	/* (non-Javadoc)
	 * @see Interface.Hockey#endOfPeriod(int)
	 */
	@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub
		System.out.println("Inside the endOfPeriod()");
	}

	/* (non-Javadoc)
	 * @see Interface.Hockey#overtimePeriod(int)
	 */
	@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub
		System.out.println("Inside the overTimePeriod()");
	}

	/* (non-Javadoc)
	 * @see Interface.Football#homeTeamScored(int)
	 */
	@Override
	public void homeTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println("Inside the homeTeamScored()");
	}

	/* (non-Javadoc)
	 * @see Interface.Football#visitingTeamScored(int)
	 */
	@Override
	public void visitingTeamScored(int points) {
		// TODO Auto-generated method stub
		System.out.println("Inside the visitingTeamScored()");
	}

	/* (non-Javadoc)
	 * @see Interface.Football#endOfQuarter(int)
	 */
	@Override
	public void endOfQuarter(int quarter) {
		// TODO Auto-generated method stub
		System.out.println("Inside the endOfQuarter()");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside main()....");
		MySports mySports = new MySports();
		mySports.homeTeamScored(0);
		mySports.endOfPeriod(5);
		mySports.endOfQuarter(5);
		mySports.homeGoalScored();
		mySports.homeTeamScored(23);
		mySports.overtimePeriod(3);
		mySports.setVisitingTeam("Roll Tide");
		
	}

}
