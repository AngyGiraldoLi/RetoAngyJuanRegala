package co.com.bancolombia.certification.finaclefe.questions;

import co.com.bancolombia.certification.finaclefe.userinterface.hsmg.FirstPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ResultMessage implements Question<Integer>{

	@Override
	public Integer answeredBy(Actor actor) {
		if (!Text.of(FirstPage.ACCEPT).viewedBy(actor).asString().isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	public static ResultMessage is() {
		return new ResultMessage();
	}

}
