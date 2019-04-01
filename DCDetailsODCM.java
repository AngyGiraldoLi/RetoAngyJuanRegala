package co.com.bancolombia.certification.finaclefe.userinterface.odcm;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class DCDetailsODCM extends PageObject {

	public static final Target APPLICABLE_RULES = Target.the("Applicable Rules")
			.located(By.name("odcmdcdetails.applicableRules"));
	public static final Target TXTPERIODDESC = Target.the("TXT Periodo Presentation").located(By.id("periodDesc"));
	public static final Target BTNACCEPT = Target.the("Botón Aceptar").located(By.id("Accept"));
	public static final Target LINKPERIODPRESENTATION = Target.the("Periodo Presentation").located(By.id("sLnk23"));
	public static final Target DATEOFEXPIRY = Target.the("Date of Expiry").located(By.id("expDate_ui"));
	public static final Target NEXTPAGE = Target.the("Next Page").located(By.id("NextPage"));
	public static final Target lATEST_DATEOF_SHIPMENT = Target.the("Latest Date of Shipment")
			.located(By.id("latestDateOfShipment_ui"));
	public static final Target COMMODITY_CODE = Target.the("Commodity Code").located(By.id("commodityCode"));
	public static final Target VALIDATE = Target.the("validate").located(By.id("Validate"));
	public static final Target LIMIT_DETAILS = Target.the("Limit Details").located(By.id("tfclimit"));
	public static final Target PLACEOFEXPIRY = Target.the("Place of Expiry")
			.located(By.name("odcmdcdetails.plExpDate"));
	public static final Target DC_DETAILS = Target.the("dcdetails").located(By.id("odcmdcdetails"));
	public static final Target LINKCHARGESDESCRIPCION = Target.the("charges Descripción").located(By.id("sLnk41"));
	public static final Target TEXTCHARGESDESCRIPCION = Target.the("Text charges Descripción").located(By.id("chargesTextDesc"));
	public static final Target LINKSENDERTORECEIVER = Target.the("Sender to Receiver").located(By.id("sLnk45"));
	public static final Target TEXTKSENDERTORECEIVER = Target.the("Text Sender to Receiver").located(By.id("senToRecDesc"));
	public static final Target TENOR = Target.the("Tenor").located(By.id("tenor"));
	public static final Target TXTUSANCEPERIOD = Target.the("Usance Period").located(By.id("usancePeriod"));
	private DCDetailsODCM() {
	}
}
