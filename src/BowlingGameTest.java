import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BowlingGameTest {

    public BowlingGameTest() {        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of calcScore method, of class BowlingGame.
     */
    @Test 
    public void testCalcScore() {
        System.out.println("calcScore:");
        int tempScore=0;
        System.out.println("Game 1, expect 81");
        BowlingGame test1 = new BowlingGame();
        test1.gameFrame.add(new Frame(1,5));	
        test1.gameFrame.add(new Frame(3,6)); 	
        test1.gameFrame.add(new Frame(7,2)); 	
        test1.gameFrame.add(new Frame(3,6));	
        test1.gameFrame.add(new Frame(4,4));	
        test1.gameFrame.add(new Frame(5,3)); 
        test1.gameFrame.add(new Frame(3,3)); 
        test1.gameFrame.add(new Frame(4,5)); 	
        test1.gameFrame.add(new Frame(8,1)); 
        test1.gameFrame.add(new Frame(2,6));
        tempScore = test1.calcScore();
        assertEquals(81, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 2, expect 94");
        BowlingGame test2 = new BowlingGame();
        test2.gameFrame.add(new Frame(10,0));	
        test2.gameFrame.add(new Frame(3,6)); 	
        test2.gameFrame.add(new Frame(7,2)); 	
        test2.gameFrame.add(new Frame(3,6));	
        test2.gameFrame.add(new Frame(4,4));	
        test2.gameFrame.add(new Frame(5,3)); 
        test2.gameFrame.add(new Frame(3,3)); 
        test2.gameFrame.add(new Frame(4,5)); 	
        test2.gameFrame.add(new Frame(8,1)); 
        test2.gameFrame.add(new Frame(2,6));
        tempScore = test2.calcScore();
        assertEquals(94, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 3, expect 88");
        BowlingGame test3 = new BowlingGame();
        test3.gameFrame.add(new Frame(1,9));	
        test3.gameFrame.add(new Frame(3,6)); 	
        test3.gameFrame.add(new Frame(7,2)); 	
        test3.gameFrame.add(new Frame(3,6));	
        test3.gameFrame.add(new Frame(4,4));	
        test3.gameFrame.add(new Frame(5,3)); 
        test3.gameFrame.add(new Frame(3,3)); 
        test3.gameFrame.add(new Frame(4,5)); 	
        test3.gameFrame.add(new Frame(8,1)); 
        test3.gameFrame.add(new Frame(2,6));
        tempScore = test3.calcScore();
        assertEquals(88, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 4, expect 103");
        BowlingGame test4 = new BowlingGame();
        test4.gameFrame.add(new Frame(10,0));	
        test4.gameFrame.add(new Frame(4,6)); 	
        test4.gameFrame.add(new Frame(7,2)); 	
        test4.gameFrame.add(new Frame(3,6));	
        test4.gameFrame.add(new Frame(4,4));	
        test4.gameFrame.add(new Frame(5,3)); 
        test4.gameFrame.add(new Frame(3,3)); 
        test4.gameFrame.add(new Frame(4,5)); 	
        test4.gameFrame.add(new Frame(8,1)); 
        test4.gameFrame.add(new Frame(2,6));
        tempScore = test4.calcScore();
        assertEquals(103, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 5, expect 112");
        BowlingGame test5 = new BowlingGame();
        test5.gameFrame.add(new Frame(10,0));	
        test5.gameFrame.add(new Frame(10,0)); 	
        test5.gameFrame.add(new Frame(7,2)); 	
        test5.gameFrame.add(new Frame(3,6));	
        test5.gameFrame.add(new Frame(4,4));	
        test5.gameFrame.add(new Frame(5,3)); 
        test5.gameFrame.add(new Frame(3,3)); 
        test5.gameFrame.add(new Frame(4,5)); 	
        test5.gameFrame.add(new Frame(8,1)); 
        test5.gameFrame.add(new Frame(2,6));
        tempScore = test5.calcScore();
        assertEquals(112, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 6, expect 98");
        BowlingGame test6 = new BowlingGame();
        test6.gameFrame.add(new Frame(8,2));	
        test6.gameFrame.add(new Frame(5,5)); 	
        test6.gameFrame.add(new Frame(7,2)); 	
        test6.gameFrame.add(new Frame(3,6));	
        test6.gameFrame.add(new Frame(4,4));	
        test6.gameFrame.add(new Frame(5,3)); 
        test6.gameFrame.add(new Frame(3,3)); 
        test6.gameFrame.add(new Frame(4,5)); 	
        test6.gameFrame.add(new Frame(8,1)); 
        test6.gameFrame.add(new Frame(2,6));
        tempScore = test6.calcScore();
        assertEquals(98, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 7, expect 90");
        BowlingGame test7 = new BowlingGame();
        test7.gameFrame.add(new Frame(1,5));	
        test7.gameFrame.add(new Frame(3,6)); 
        test7.gameFrame.add(new Frame(7,2)); 	
        test7.gameFrame.add(new Frame(3,6));	
        test7.gameFrame.add(new Frame(4,4));	
        test7.gameFrame.add(new Frame(5,3)); 
        test7.gameFrame.add(new Frame(3,3)); 
        test7.gameFrame.add(new Frame(4,5)); 	
        test7.gameFrame.add(new Frame(8,1)); 
        test7.gameFrame.add(new Frame(2,8,7));
        tempScore = test7.calcScore();
        assertEquals(90, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 8, expect 92");
        BowlingGame test8 = new BowlingGame();
        test8.gameFrame.add(new Frame(1,5));	
        test8.gameFrame.add(new Frame(3,6)); 	
        test8.gameFrame.add(new Frame(7,2)); 	
        test8.gameFrame.add(new Frame(3,6));	
        test8.gameFrame.add(new Frame(4,4));	
        test8.gameFrame.add(new Frame(5,3)); 
        test8.gameFrame.add(new Frame(3,3)); 
        test8.gameFrame.add(new Frame(4,5)); 	
        test8.gameFrame.add(new Frame(8,1)); 
        test8.gameFrame.add(new Frame(10,7,2));
        tempScore = test8.calcScore();
        assertEquals(92, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 9, expect 93");
        BowlingGame test9 = new BowlingGame();
        test9.gameFrame.add(new Frame(1,5));	
        test9.gameFrame.add(new Frame(3,6)); 	
        test9.gameFrame.add(new Frame(7,2)); 	
        test9.gameFrame.add(new Frame(3,6));	
        test9.gameFrame.add(new Frame(4,4));	
        test9.gameFrame.add(new Frame(5,3)); 
        test9.gameFrame.add(new Frame(3,3)); 
        test9.gameFrame.add(new Frame(4,5)); 	
        test9.gameFrame.add(new Frame(8,1)); 
        test9.gameFrame.add(new Frame(2,8,10));
        tempScore = test9.calcScore();
        assertEquals(93, tempScore);
        System.out.println("The Score is " + tempScore);
        
        System.out.println("Game 10, expect 300");
        BowlingGame test10 = new BowlingGame();
        test10.gameFrame.add(new Frame(10,0));	
        test10.gameFrame.add(new Frame(10,0)); 	
        test10.gameFrame.add(new Frame(10,0)); 	
        test10.gameFrame.add(new Frame(10,0));	
        test10.gameFrame.add(new Frame(10,0));	
        test10.gameFrame.add(new Frame(10,0)); 
        test10.gameFrame.add(new Frame(10,0)); 
        test10.gameFrame.add(new Frame(10,0)); 	
        test10.gameFrame.add(new Frame(10,0)); 
        test10.gameFrame.add(new Frame(10,10,10));
        tempScore = test10.calcScore();
        assertEquals(300, tempScore);
        System.out.println("The Score is " + tempScore);
                
        System.out.println("Game 11, expect 135");
        BowlingGame test11 = new BowlingGame();
        test11.gameFrame.add(new Frame(6,3));	
        test11.gameFrame.add(new Frame(7,1)); 	
        test11.gameFrame.add(new Frame(8,2)); 	
        test11.gameFrame.add(new Frame(7,2));	
        test11.gameFrame.add(new Frame(10,0));	
        test11.gameFrame.add(new Frame(6,2)); 
        test11.gameFrame.add(new Frame(7,3)); 
        test11.gameFrame.add(new Frame(10,0)); 	
        test11.gameFrame.add(new Frame(8,0)); 
        test11.gameFrame.add(new Frame(7,3,10));
        tempScore = test11.calcScore();
        assertEquals(135, tempScore);
        System.out.println("The Score is " + tempScore);
    }

    /**
     * Test of calcFrameScore method, of class BowlingGame.
     */
    @Test
    public void testCalcFrameScore() {
        System.out.println("calcFrameScore");
        Frame frame = null;
        BowlingGame instance = new BowlingGame();
        Frame testFrame = new Frame (5,2);
        instance.gameFrame.add(testFrame);
        int expResult = 7;
        System.out.println("Frame [5,2] = 7");
        int result = instance.calcFrameScore(testFrame);
        assertEquals(expResult, result);
    }

}