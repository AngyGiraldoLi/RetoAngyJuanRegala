package cissueodcm;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import co.com.bancolombia.certification..models.ModelIssueODCM;
import co.com.bancolombia.certification..userinterface.odcm.GeneralDetailsdc;
import co.com.bancolombia.certification..userinterface.odcm.RPartyDetails;
import co.com.bancolombia.certification..util.Log;
import co.com.bancolombia.certification..util.Utilidades;
import co.com.bancolombia.certification..util.WaitResponse;
import co.com.bancolombia.certification..util.WorkFrame;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class GeneralDetailsDC implements Task {

	ModelIssueODCM modelIssueODCM;
	Utilidades util;
	WorkFrame workFrame;

	public GeneralDetailsDC(DataTable dtDatos) {
		this.modelIssueODCM = new ModelIssueODCM(dtDatos);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		try {
			workFrame.out();
			workFrame.inStandarFrames();

			boolean selecctAcount = false, condition =true;
			if (selecctAcount == condition) {
				actor.attemptsTo(Click.on(GeneralDetailsdc.SELECT_ACCOUNT));
				WaitResponse.forAWhile();
				Robot robot = new Robot();
				workFrame.out();
				WaitResponse.forAWhile(3000);
				robot.keyPress(KeyEvent.VK_F12);
				WaitResponse.forAWhile();
				robot.keyPress(KeyEvent.VK_ENTER);
				WaitResponse.forAWhile();
				robot.mousePress(0);
				robot.keyPress(KeyEvent.VK_F12);
				WaitResponse.forAWhile();
				robot.keyPress(KeyEvent.VK_TAB);
				WaitResponse.forAWhile();
				robot.keyPress(KeyEvent.VK_TAB);
				WaitResponse.forAWhile();
				robot.keyPress(KeyEvent.VK_TAB);
				WaitResponse.forAWhile();
				robot.keyPress(KeyEvent.VK_ENTER);
			} else {
				actor.attemptsTo(Enter.theValue(modelIssueODCM.getBdTxtAcid()).into(GeneralDetailsdc.ACCTID));
			}
			WaitResponse.forAWhile();
			util.enfocarDriverFinacle();
			WaitResponse.forAWhile();
			actor.attemptsTo(Enter.theValue(modelIssueODCM.getDcOpenValue()).into(GeneralDetailsdc.DC_OPEN_VALUE));
			actor.attemptsTo(Enter.theValue(modelIssueODCM.getTxtpaysysid()).into(GeneralDetailsdc.TXTPAYSYSID));
			WaitResponse.forAWhile();
			actor.attemptsTo(Click.on(RPartyDetails.PARTY_DETAILS));
			WaitResponse.forAWhile();
		} catch (Exception e) {
			Log.grabarLog(e.toString());
		}
	}

	public static Performable at(DataTable dtDatos) {
		return Tasks.instrumented(GeneralDetailsDC.class, dtDatos);
	}
}
