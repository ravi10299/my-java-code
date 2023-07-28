public class interfaces{
    public static void main(String args[]){
        Queen q= new Queen();
        q.move();


    }
}

interface Chessplayer{
    void move();
}
class Queen implements Chessplayer{
    public void move(){
        System.out.println("up , down,left , right  - in 4 direction move");

    }

}
class king implements Chessplayer{
    public void move(){
        System.out.println("up , down,left , right  - in 1 direction move");
        
    }

}
class Rook implements Chessplayer{
    public void move(){
        System.out.println("up , down,left , right");
        
    }

}