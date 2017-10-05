package assignment;

import org.junit.Test;

import java.awt.*;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TetrisPieceTest {

    Piece lpiece = TetrisPiece.getPiece("0 0  1 0  2 0  3 0");
    Piece jpiece = TetrisPiece.getPiece("0 1  1 1  2 1  2 0");
    Piece spiece = TetrisPiece.getPiece("0 0  1 0  1 1  2 1");
    Piece square = TetrisPiece.getPiece("0 0  0 1  1 0  1 1");
    Piece tpiece = TetrisPiece.getPiece("0 0  1 0  1 1  2 0");

    @Test
    public void getPiece() throws Exception {
    }

    @Test
    public void getWidth() throws Exception {
        assertEquals(4, lpiece.getWidth());
        assertEquals(3, spiece.getWidth());
        assertEquals(3, tpiece.getWidth());
        assertEquals(3, jpiece.getWidth());
        assertEquals(2, square.getWidth());
    }

    @Test
    public void getHeight() throws Exception {
        assertEquals(1, lpiece.getHeight());
        assertEquals(2, spiece.getHeight());
        assertEquals(2, tpiece.getHeight());
        assertEquals(2, jpiece.getHeight());
        assertEquals(2, square.getHeight());
    }

    @Test
    public void getBody() throws Exception {
        Point [] lpiecepoints = new Point[4];
        lpiecepoints[0] = new Point(0, 0);
        lpiecepoints[1] = new Point(1, 0);
        lpiecepoints[2] = new Point(2, 0);
        lpiecepoints[3] = new Point(3, 0);
        assertEquals(true, Arrays.equals(lpiecepoints,lpiece.getBody()));

    }

    @Test
    public void getSkirt() throws Exception {
        assertEquals(Arrays.equals(new int[] {0, 0 , 0, 0},lpiece.getSkirt()), true);
        assertEquals(Arrays.equals(new int[] {0, 0 , 1}, spiece.getSkirt()), true);
        assertEquals(Arrays.equals(new int[] {0, 0 , 0}, tpiece.getSkirt()), true);
        assertEquals(Arrays.equals(new int[] {1, 1, 0}, jpiece.getSkirt()), true);
        assertEquals(Arrays.equals(new int[] {0, 0}, square.getSkirt()), true);
    }

    @Test
    public void equals() throws Exception {
        Piece lpiece2 = TetrisPiece.getPiece("0 0  1 0  2 0  3 0");
        assertEquals(true, lpiece.equals(lpiece2));
        assertEquals(false, lpiece.equals(tpiece));

    }


}
