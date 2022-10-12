package adapterDesignPattern;

import Other.PilotPen;

public class School {

    public static void main(String[] args) {

        Pen p = new PenAdaptor();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(p);
        aw.writesAssignment("I am not in mood to write assignment");
    }
}
