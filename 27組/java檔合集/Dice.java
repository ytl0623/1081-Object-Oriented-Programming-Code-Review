
/**
 * Dice, dice has 6 faces if the player don't set the face
 * 
 * 
 */
public class Dice
{
    // 实例变量 - 用你自己的变量替换下面的例子
    private int numOfFace ;

    /**
     * dice has 6 faces if the player don't set the face
     */
    public Dice()
    {
        // 初始化实例变量
        numOfFace = 6;
    }

    /**
     * use to set the face
     * 
     * @the face you want to set
     * @No return
     */
    public void setFace(int face)
    {
        // 在这里加入你的代码
        numOfFace = face ;
    }
    /**
     * use to get the result of rolling the dice
     * 
     * @No pass parameters
     * @return the result
     */
    public int getRandomPoint() {
        int point = (int)(Math.random()*numOfFace)+1 ;
        return point ;
    }
}
