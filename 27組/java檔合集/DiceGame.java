
/**
 * DiceGame, control the whole game
 * 
 * 
 */
public class DiceGame
{
    // 实例变量 - 用你自己的变量替换下面的例子
    Player tom = new Player() ;
    Player mary = new Player() ;
    class Result 
    {
        int tomWins = 0;
        int maryWins = 0 ;
        int draw = 0 ;
        
        void setResult(String winner) {
            if (winner == "tom" ) {
                tomWins = tomWins + 1 ;
            }
            else if ( winner == "mary" ) {
                maryWins = maryWins + 1 ;
            }
            else if ( winner == "draw" ) {
                draw = draw + 1 ;
            }
        }
        
        void printResult() {
            System.out.println("Tom wins:" + tomWins ) ;
            System.out.println( "Mary wins:" + maryWins ) ;
            System.out.println( "Draw:" + draw ) ;
        }
    }

    /**
     * 类 DiceGame 的对象的构造函数
     */
    public DiceGame()
    {
        // 初始化实例变量
    }

    /**
     * a method to start the whole game and print the result.
     * 
     * @no pass parameters
     * @No return, print the result 
     */
    public void StartGame()
    {
        int tomResult ; /*throw the 6face dice twice*/
        int maryResult ;
        String winner ;
        Result result = new Result() ;
        for ( int i = 0 ; i < 10 ; i ++ ) {
            tomResult = 0 ;
            maryResult = 0 ;
            tomResult = tom.RollTheDice(1) + tom.RollTheDice(2) ;
            maryResult = mary.RollTheDice(1) + mary.RollTheDice(2) ;
            if ( tomResult > maryResult ) {
                winner = "tom" ;
            }
            else if ( tomResult < maryResult ) {
                winner = "mary" ;
            }
            else { /* draw*/
                tomResult = 0 ;
                maryResult = 0 ;
                tomResult = tom.RollTheDice(3) ; /*throw the 8face dice */
                maryResult = mary.RollTheDice(3) ;
                if (tomResult > maryResult ) {
                    winner = "tom" ;
                }
                else if ( tomResult < maryResult) {
                    winner = "mary" ;
                }
                else {
                winner = "draw" ;
                }
            }
            result.setResult(winner) ;
        }
        result.printResult() ;
    }
    
}

