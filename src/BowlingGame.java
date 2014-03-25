import java.util.ArrayList;
/**
 * This runs the bowling game, which includes setting up the game, scoring it,
 * and logic for scoring individual frames
 * @author John Albrecht(cs338032), Ravikumar Chimmalgi(cs338014), Daniel Sellig(?)
 */
public class BowlingGame {

    private int score = 0;    
    public ArrayList gameFrame = new ArrayList();
    /**
     * This is where i originally specified the values of all the throws in the 
     * game, Commented out for the current test package.
     */
    public BowlingGame()
    {											
        /*
        gameFrame.add(new Frame(6,3));	
        gameFrame.add(new Frame(7,1)); 	
        gameFrame.add(new Frame(8,2)); 	
        gameFrame.add(new Frame(7,2));	
        gameFrame.add(new Frame(10,0));	
        gameFrame.add(new Frame(6,2)); 
        gameFrame.add(new Frame(7,3)); 
        gameFrame.add(new Frame(10,0)); 	
        gameFrame.add(new Frame(8,0)); 
        gameFrame.add(new Frame(7,3,10));
        */
    }
    /**
     * This calculates the score of a full game of bowling with 10 frames. It can
     * handle numerous uses of strikes and spares, and includes logic for handling
     * the final frame of the game
     * @return the full, calculated score of a ten frame game
     */
    public int calcScore()
    {
        Frame nextFrame;
        
        for (int i=0; i < 10; i++)
        {	
            if(i==9) 
            {
                int temp = 0;
                Frame frame1 = (Frame)gameFrame.get(i);
                if (frame1.getBall1() + frame1.getBall2() == 10)
			temp = 10 + (frame1.getBonusBall());		
		else if (frame1.getBonusBall() + frame1.getBall2() == 10)
			temp = 10 + (frame1.getBall1());
		else
			temp = (frame1.getBall1()) + (frame1.getBall2()) + (frame1.getBonusBall());
                score += temp;
                //System.out.println(The current score is " + score);
            }
            else
            {
                if(((Frame)gameFrame.get(i)).isSpare())
                {
                    nextFrame = (Frame)gameFrame.get(i+1);
                    score += 10 + (nextFrame.getBall1());
                }
                else if(((Frame)gameFrame.get(i)).isStrike() && (i+1)!=9)
                {
                    nextFrame = (Frame)gameFrame.get(i+1);
                    score += 10;
                    if (nextFrame.getBall1() == 10)					
                    {	
                        score+=10;
                        nextFrame = (Frame)gameFrame.get(i+2);
                        score+=(nextFrame.getBall1());
                    }
                    else
                        score += calcFrameScore(nextFrame);
                }
                else if(((Frame)gameFrame.get(i)).isStrike() && (i+1)==9)
                {
                    nextFrame = (Frame)gameFrame.get(i+1);
                    score += 10;
                    if (nextFrame.getBall1() == 10)					
                    {	
                        score += 10 + (nextFrame.getBall2());
                    }
                    else
                        score += (nextFrame.getBall1()) + (nextFrame.getBall2()); //Added else, seems to work
                }
                else
                    score += calcFrameScore((Frame)gameFrame.get(i));
                    //System.out.println("The current score is " + score);
            }
        }
        return score;
    }

    /**
     * This calculates the simple score of a single frame of 2 throws
     * @param frame this holds the 2 values of the frame
     * @return the basic score of a frame with 2 throws
     */
    public int calcFrameScore(Frame frame)
    {
        return (frame.getBall1()) + (frame.getBall2());	
    }	
}
