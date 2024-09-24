package nl.han.se.bewd.mockworkshop;

import nl.han.se.bewd.mockworkshop.student.Student;
import nl.han.se.bewd.mockworkshop.toets.Summatief;

public class PolymorfieMock implements Summatief {
    @Override
    public int getToetsCijferVoorStudent(Student s) {
        return 8;
    }

    @Override
    public void verwijderStudentResultaten(Student s) {

    }

}
