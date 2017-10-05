package assignment;

import java.awt.*;
import java.util.*;

/**
 * An immutable representation of a tetris piece in a particular rotation.
 * Each piece is defined by the blocks that make up its body.
 *
 * You need to implement this.
 */
public final class TetrisPiece extends Piece {

    private LinkedList<TetrisPiece> rotations = new LinkedList<TetrisPiece>();
    private int width;
    private int height;
    private Point[] body;
    private int[] skirt;

    /**
     * Parse a "piece string" of the form "x1 y1 x2 y2 ..." into a TetrisPiece
     * where the corresponding (x1, y1), (x2, y2) positions have been filled in.
     */
    public static Piece getPiece(String pieceString) {

        TetrisPiece tPiece = new TetrisPiece();
        tPiece.body = Piece.parsePoints(pieceString);
        ArrayList <Integer> xVals = new ArrayList<Integer>();
        ArrayList <Integer> yVals = new ArrayList<Integer>();
        tPiece.height = Collections.max(yVals) - Collections.min(yVals) + 1;
        tPiece.width = Collections.max(xVals) - Collections.min(xVals) + 1;


        HashMap<Integer, Integer> skirtMap = new HashMap<Integer, Integer>();

        for(Point p : tPiece.body){
            xVals.add(p.x);
            yVals.add(p.y);

            if(skirtMap.containsKey(p.x)){
                if(p.y < skirtMap.get(p.x)) {
                    skirtMap.put(p.x, p.y);
                }
            }
            else{
                skirtMap.put(p.x, p.y);
            }
        }

        tPiece.skirt = new int [tPiece.width];
        for(int i = 0; i < tPiece.skirt.length; i++){
            tPiece.skirt[i] = skirtMap.get(i);
        }

        return tPiece;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public Point[] getBody() {
        return body;
    }

    @Override
    public int[] getSkirt() {
        return skirt;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof TetrisPiece){
            Point[] otherBody = ((TetrisPiece) other).getBody();
            return (Arrays.equals(otherBody, this.getBody()));
        }
        return false;


    }
}
