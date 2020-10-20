public class Solver {

    // find a solution to the initial board (using the A* algorithm)
    public Solver(Board initial) {
        if (initial == null) {
            throw new IllegalArgumentException("Board must be not null");
        }
    }

    // is the initial board solvable? (see below)
    public boolean isSolvable()

    // min number of moves to solve initial board; -1 if unsolvable
    public int moves()

    // sequence of boards in a shortest solution; null if unsolvable
    public Iterable<Board> solution()

    // test client (see below)
    public static void main(String[] args)

}
