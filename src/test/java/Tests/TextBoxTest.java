package Tests;

import Interfaces.PersonInfo;
import Steps.PageTextBox;
import org.junit.jupiter.api.Test;



class TextBoxTest extends MainTest implements PersonInfo {
    @Test
    public void testTextBox(){
        PageTextBox textBox = new PageTextBox(driver);
        textBox.transition();
        textBox.inputFirstName(person.getName());
        textBox.inputLastName(person.getEmail());
        textBox.inputCurrentAddress(person.getCurrentAddress());
        textBox.inputPermanentAddress(person.getPermanentAddress());
        textBox.clickSubmit();
    }
}