
/**
 * Player: each player has 3 dices.
 * 
 * 
 */
public class Player
{
    // 实例变量 - 用你自己的变量替换下面的例子
    Dice dice1 = new Dice() ;
    Dice dice2 = new Dice() ;
    Dice dice3 = new Dice() ;
    /**
     * 类 Player 的对象的构造函数 the dice1 and dice2 have 6 faces, the dice3 has 8faces.
     */
    public Player()
    {
        // 初始化实例变量 if haven't set the face, the face will be 6.
        dice3.setFace(8) ;
    }

    /**
     * Player roll the dice, get a random point.
     * 
     * @numOfDice means which dice do the player want to roll.
     * @return the result of the dice.
     */
    public int RollTheDice(int numOfDice)
    {
        int result = -10 ;
        if ( numOfDice == 1 ) {
            result = dice1.getRandomPoint() ;
        } // if     
        else if ( numOfDice == 2 ) {
            result = dice2.getRandomPoint() ;
        }
        else if ( numOfDice == 3 ) {
            result = dice3.getRandomPoint() ;
        }
        
        return result ;
    }
}
