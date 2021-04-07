package sample.board;

import sample.board.Case;

public class EmptyCase extends Case {
    private String caseVoid;

    public EmptyCase() {
        setCaseVoid("Empty");
    }

    @Override
    public String toString() {
        return  " *-----------------------------------------------*" +
                "\n" + "                 " + "It's" + " " + caseVoid + " " + "here.." +
                "\n" + "*-----------------------------------------------*";
    }

    public String getCaseVoid() {
        return caseVoid;
    }

    public void setCaseVoid(String caseVoid) {
        this.caseVoid = caseVoid;
    }
}
