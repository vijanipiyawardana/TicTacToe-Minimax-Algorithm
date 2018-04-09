/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author vijani
 */
public enum CellState {
    COMPUTER("X"), USER("O"), EMPTY("-");
    private final String text;
    private CellState(String text){
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
    
}
