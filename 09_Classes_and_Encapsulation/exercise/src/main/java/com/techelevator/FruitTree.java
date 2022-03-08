package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public FruitTree(String typeOfFruit, int startingNumberOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = startingNumberOfFruit;
    }

    public boolean pickFruit(int numberOfPiecesToRemove){
        if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;
        }
        return false;
    }

    public String getTypeOfFruit() {
        this.typeOfFruit = typeOfFruit;
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        this.piecesOfFruitLeft = piecesOfFruitLeft;
        return piecesOfFruitLeft;
    }
}
