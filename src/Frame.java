/**  *
 * This class creates the object Frame, which houses the values for the throws
 */
public class Frame 
{	
    private int ball1;
    private int ball2;
    private int bonusBall;
    
    /**
     * This stores the values for a normal 2 throw frame. 
     * @param ball1 the int value of the first throw
     * @param ball2 the int value of the second throw
     */
    public Frame(int ball1, int ball2)
    {
        this.ball1=ball1;
        this.ball2=ball2;
    }
    /**
     * This stores the values for the tenth frame with 3 throws
     * @param ball1 the int value of the first throw
     * @param ball2 the int value of the second throw
     * @param bonusBall the int value of the third throw
    */
    public Frame(int ball1, int ball2, int bonusBall)
    {
        this.ball1=ball1;
        this.ball2=ball2;
        this.bonusBall = bonusBall;
    }
    /**
     * This returns the value of the first throw
     * @return the value of ball1
     */
    public int getBall1()
    {
        return ball1;
    }
    /**
     * this returns the value of the second throw
     * @return the value of ball2
     */
    public int getBall2()
    {
        return ball2;
    }
    /**
     * This returns the value of the bonus throw on the tenth frame
     * @return the value of bonusBall
     */
    public int getBonusBall()
    {
        return bonusBall;
    }
    /**
     * Checks to see if the frame is a strike, ie, that it is [10,0]
     * @return true if the frame is a Strike
     */
    public boolean isStrike()
    {
        return this.getBall1() == 10;
    }
    /**
     * Check to see if the frame is a spare, includes logic to differentiate
     * from a strike
     * @return true if the frame is a spare
     */
    public boolean isSpare()
    {
        return (this.getBall1() + this.getBall2() == 10) && (this.getBall1() != 10);
    }
    /**
     * adds the 2 throws of a frame to find its simple score
     * @return the int value of the frames value
     */
    public int getSimpleScore()
    {
        return ball1 + ball2;
    }        
		
}