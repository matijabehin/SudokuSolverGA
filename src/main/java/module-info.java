module hr.sudokusolver.sudokusolverga {
    requires javafx.controls;
    requires javafx.fxml;


    opens hr.sudokusolver.sudokusolverga to javafx.fxml;
    exports hr.sudokusolver.sudokusolverga;
    exports hr.sudokusolver.sudokusolverga.enums;
    opens hr.sudokusolver.sudokusolverga.enums to javafx.fxml;
    exports hr.sudokusolver.sudokusolverga.sudoku;
    opens hr.sudokusolver.sudokusolverga.sudoku to javafx.fxml;
    exports hr.sudokusolver.sudokusolverga.information;
    opens hr.sudokusolver.sudokusolverga.information to javafx.fxml;
}