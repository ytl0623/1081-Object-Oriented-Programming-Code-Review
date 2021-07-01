
/**
 * TEST RollTheDice in class Player
 * 
 * 
 */
public class TestRollTheDice
{
    // 实例变量 - 用你自己的变量替换下面的例子
    int face ;
    Dice dice = new Dice();

    /**
     * set the dice face to 6
     */
    public TestRollTheDice()
    {
        face = 6 ;
    
    }

    /**
     * Test roll the dice 500 times, if the result always in 1 - 6, means the Dice is working correctly.
     * 
     * @No pass parameters
     * @print the result
     */
    public void TestRoll()
    {
        // 在这里加入你的代码
        dice.setFace(face) ;
        boolean Wrong = false ;
        for( int i = 0 ; i < 500 ; i++ ) {
            int result = dice.getRandomPoint() ;
            if ( result < 1 || result > 6 ) {
                Wrong = true ;
            }   
        }
        
        if ( Wrong ) 
            System.out.println("Wrong!") ;
        else 
            System.out.println("Everything is alright!") ;
        
    }
}
