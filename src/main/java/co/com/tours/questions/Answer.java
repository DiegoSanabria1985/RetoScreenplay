package co.com.tours.questions;

import co.com.tours.userinterface.EnterPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }



    public static Answer toThe(String question) {
        return  new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String welcomePage= Text.of(EnterPasswordPage.WELCOME).viewedBy(actor).asString();
        if (question.equals(welcomePage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
