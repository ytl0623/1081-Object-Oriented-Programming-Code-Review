
/**
 * TEST Game
 * 
 * 
 * @版本（一个版本号或者一个日期）
 */
public class TestStartGame
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
     * 类 TestStartGame 的对象的构造函数
     */
    public TestStartGame()
    {
        // 初始化实例变量
        
    }

    /**
     * test the game,the condition is set as:tom's first and second roll is 3 and 5,and mary is same as him and then in the third time,tom's point is 8 and mary is 6. Repeat for 10times.So the reslut is goint to be : Tom wins:10, Mary wins:0, Draw:0.
     * 
     * @No pass Parameters
     * @Print the Result
     */
    public void TestGame()
    {
        Result result = new Result() ; 
        int tomResult ;
        int maryResult ;
        for ( int i = 0 ; i < 10 ; i ++ ) {
            tomResult = 3 + 5 ; /*throw the 6face dice twice*/
            maryResult = 3 + 5 ;
            String winner ;
            if ( tomResult > maryResult ) {
                winner = "tom" ;
            }
            else if ( tomResult < maryResult ) {
                winner = "mary" ;
            }
            else {
                tomResult = 0 ;
                maryResult = 0 ;
                tomResult = 8 ; /*throw the 8face dice */
                maryResult = 6 ;
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
