package core.basesyntax;


public class Ball {
    final Color color;
    final int number;
    public Ball(Color color , int number){
        this.color = color;
        this.number = number;
    }
    @Override
    public String toString(){
        return "Ball{color=' " + color + "' , number" + number + "}";
    }
}