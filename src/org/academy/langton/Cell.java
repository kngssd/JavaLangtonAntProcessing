package org.academy.langton;

public class Cell {
    private CellColour colour;
    private final GridPosition gridPosition;

    public Cell(int x, int y){
        gridPosition = new GridPosition(x, y);
        colour = CellColour.WHITE;
    }

    public CellColour changeColour(){
        switch (colour) {
            case CellColour.WHITE -> colour = CellColour.BLACK;
            case CellColour.BLACK -> colour = CellColour.RED;
            case CellColour.RED -> colour = CellColour.WHITE;
        }
        return colour;
    }

    public CellColour getColour() {
        return colour;
    }

    public void setColour(CellColour givenColour) {
        this.colour = givenColour;
    }

    public GridPosition gridPosition(){
        return gridPosition;
    }
}
