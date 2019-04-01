package co.com.bancolombia.certification.finaclefe.models;

import cucumber.api.DataTable;

public class ModelIssueODCM {

	private String cmbFunction;
	private String txtDocumentaryCreditNo;
	private String txtDocumentaryCreditType;
	private String txtCCY;
	private String txtCifId;
	private String txtpaysysid;
	private String bdTxtAcid;
	private String dcOpenValue;
	private String promissoryNumber;
	private String nameBeneficiary;
	private String addressBeneficiary;
	private String txtaddressLine2;
	private String txtaddressLine3;
	private String advisingBank;
	private String advisingBranch;
	private String avaliableBank;
	private String avaliableBranch;
	private String availableBy;
	private String applicableRules;
	private String dateOfExpiry;
	private String latestDateofShipment;
	private String commodityCode;
	private String placeExpiry;
	private String txtLimitIdPrefix;
	private String txtLimitIdSuffix;
	private String cmbPaymentStatus;
	private String txtperiodpresentation;
	private String cmbTenor;
	private String txtUnsancePeriod;

	public ModelIssueODCM(DataTable dtDatos) {

		this.cmbFunction = dtDatos.asList(String.class).get(0);
		this.txtDocumentaryCreditNo = dtDatos.asList(String.class).get(1);
		this.txtDocumentaryCreditType = dtDatos.asList(String.class).get(2);
		this.txtCCY = dtDatos.asList(String.class).get(3);
		this.txtCifId = dtDatos.asList(String.class).get(4);
		this.txtpaysysid = dtDatos.asList(String.class).get(5);
		this.bdTxtAcid = dtDatos.asList(String.class).get(6);
		this.dcOpenValue = dtDatos.asList(String.class).get(7);
		this.promissoryNumber = dtDatos.asList(String.class).get(8);
		this.nameBeneficiary = dtDatos.asList(String.class).get(9);
		this.addressBeneficiary = dtDatos.asList(String.class).get(10);
		this.txtaddressLine2 = dtDatos.asList(String.class).get(11);
		this.txtaddressLine3 = dtDatos.asList(String.class).get(12);
		this.advisingBank = dtDatos.asList(String.class).get(13);
		this.advisingBranch = dtDatos.asList(String.class).get(14);
		this.avaliableBank = dtDatos.asList(String.class).get(15);
		this.avaliableBranch = dtDatos.asList(String.class).get(16);
		this.availableBy = dtDatos.asList(String.class).get(17);
		this.applicableRules = dtDatos.asList(String.class).get(18);
		this.cmbTenor = dtDatos.asList(String.class).get(19);
		this.txtUnsancePeriod = dtDatos.asList(String.class).get(20);
		this.txtperiodpresentation = dtDatos.asList(String.class).get(21);
		this.dateOfExpiry = dtDatos.asList(String.class).get(22);
		this.latestDateofShipment = dtDatos.asList(String.class).get(23);
		this.commodityCode = dtDatos.asList(String.class).get(24);
		this.placeExpiry = dtDatos.asList(String.class).get(25);
		this.txtLimitIdPrefix = dtDatos.asList(String.class).get(26);
		this.txtLimitIdSuffix = dtDatos.asList(String.class).get(27);
		this.cmbPaymentStatus = dtDatos.asList(String.class).get(28);
	}

	public String getCmbFunction() {
		return cmbFunction;
	}

	public void setCmbFunction(String cmbFunction) {
		this.cmbFunction = cmbFunction;
	}

	public String getTxtDocumentaryCreditNo() {
		return txtDocumentaryCreditNo;
	}

	public void setTxtDocumentaryCreditNo(String txtDocumentaryCreditNo) {
		this.txtDocumentaryCreditNo = txtDocumentaryCreditNo;
	}

	public String getTxtDocumentaryCreditType() {
		return txtDocumentaryCreditType;
	}

	public void setTxtDocumentaryCreditType(String txtDocumentaryCreditType) {
		this.txtDocumentaryCreditType = txtDocumentaryCreditType;
	}

	public String getTxtCCY() {
		return txtCCY;
	}

	public void setTxtCCY(String txtCCY) {
		this.txtCCY = txtCCY;
	}

	public String getTxtCifId() {
		return txtCifId;
	}

	public void setTxtCifId(String txtCifId) {
		this.txtCifId = txtCifId;
	}

	public String getTxtpaysysid() {
		return txtpaysysid;
	}

	public void setTxtpaysysid(String txtpaysysid) {
		this.txtpaysysid = txtpaysysid;
	}

	public String getBdTxtAcid() {
		return bdTxtAcid;
	}

	public void setBdTxtAcid(String bdTxtAcid) {
		this.bdTxtAcid = bdTxtAcid;
	}

	public String getDcOpenValue() {
		return dcOpenValue;
	}

	public void setDcOpenValue(String dcOpenValue) {
		this.dcOpenValue = dcOpenValue;
	}

	public String getPromissoryNumber() {
		return promissoryNumber;
	}

	public void setPromissoryNumber(String promissoryNumber) {
		this.promissoryNumber = promissoryNumber;
	}

	public String getNameBeneficiary() {
		return nameBeneficiary;
	}

	public void setNameBeneficiary(String nameBeneficiary) {
		this.nameBeneficiary = nameBeneficiary;
	}

	public String getAddressBeneficiary() {
		return addressBeneficiary;
	}

	public void setAddressBeneficiary(String addressBeneficiary) {
		this.addressBeneficiary = addressBeneficiary;
	}

	public String getAdvisingBank() {
		return advisingBank;
	}

	public void setAdvisingBank(String advisingBank) {
		this.advisingBank = advisingBank;
	}

	public String getAdvisingBranch() {
		return advisingBranch;
	}

	public void setAdvisingBranch(String advisingBranch) {
		this.advisingBranch = advisingBranch;
	}

	public String getAvaliableBank() {
		return avaliableBank;
	}

	public void setAvaliableBank(String avaliableBank) {
		this.avaliableBank = avaliableBank;
	}

	public String getAvaliableBranch() {
		return avaliableBranch;
	}

	public void setAvaliableBranch(String avaliableBranch) {
		this.avaliableBranch = avaliableBranch;
	}

	public String getAvailableBy() {
		return availableBy;
	}

	public void setAvailableBy(String availableBy) {
		this.availableBy = availableBy;
	}

	public String getApplicableRules() {
		return applicableRules;
	}

	public void setApplicableRules(String applicableRules) {
		this.applicableRules = applicableRules;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getLatestDateofShipment() {
		return latestDateofShipment;
	}

	public void setLatestDateofShipment(String latestDateofShipment) {
		this.latestDateofShipment = latestDateofShipment;
	}

	public String getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getPlaceExpiry() {
		return placeExpiry;
	}

	public void setPlaceExpiry(String placeExpiry) {
		this.placeExpiry = placeExpiry;
	}

	public String getTxtLimitIdPrefix() {
		return txtLimitIdPrefix;
	}

	public void setTxtLimitIdPrefix(String txtLimitIdPrefix) {
		this.txtLimitIdPrefix = txtLimitIdPrefix;
	}

	public String getTxtLimitIdSuffix() {
		return txtLimitIdSuffix;
	}

	public void setTxtLimitIdSuffix(String txtLimitIdSuffix) {
		this.txtLimitIdSuffix = txtLimitIdSuffix;
	}

	public String getCmbPaymentStatus() {
		return cmbPaymentStatus;
	}

	public void setCmbPaymentStatus(String cmbPaymentStatus) {
		this.cmbPaymentStatus = cmbPaymentStatus;
	}

	public String getTxtaddressLine2() {
		return txtaddressLine2;
	}

	public void setTxtaddressLine2(String txtaddressLine2) {
		this.txtaddressLine2 = txtaddressLine2;
	}

	public String gettxtaddressLine3() {
		return txtaddressLine3;
	}

	public void settxtaddressLine3(String txtaddressLine3) {
		this.txtaddressLine3 = txtaddressLine3;
	}

	public String getTxtperiodpresentation() {
		return txtperiodpresentation;
	}

	public void setTxtperiodpresentation(String txtperiodpresentation) {
		this.txtperiodpresentation = txtperiodpresentation;
	}

	public String getcmbTenor() {
		return cmbTenor;
	}

	public void setcmbTenor(String cmbTenor) {
		this.cmbTenor = cmbTenor;
	}

	public String gettxtUnsancePeriod() {
		return txtUnsancePeriod;
	}

	public void settxtUnsancePeriod(String txtUnsancePeriod) {
		this.txtUnsancePeriod = txtUnsancePeriod;
	}
}