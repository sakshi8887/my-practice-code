public class interfaceconcept {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right in all four direction");
    }
}

class Hook implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("up,down,left,right in one direction");
    }
}
