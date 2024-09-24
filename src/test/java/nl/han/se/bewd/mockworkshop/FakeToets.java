package nl.han.se.bewd.mockworkshop;

import nl.han.se.bewd.mockworkshop.student.Student;
import nl.han.se.bewd.mockworkshop.toets.Toets;

public class FakeToets extends Toets {

    int fakeReturnValue = 7;

    public void setReturnValueForGetToetsCijferVoorStudent(int fakeReturnvalue) {
        this.fakeReturnValue = fakeReturnvalue;
    }

    @Override
    public int getToetsCijferVoorStudent(Student s) {
        return fakeReturnValue;
    }
}