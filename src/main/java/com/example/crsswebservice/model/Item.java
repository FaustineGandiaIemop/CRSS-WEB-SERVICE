package com.example.crsswebservice.model;
import javax.persistence.*;

@Entity
@Table(name = "items")

public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="item_name")
    private String itemName;
    @Column(name="item_category")
    private String category;
    @Column(name="item_shortname")
    private String shortname;

    @Column(name="item_organization")
    private String organization;
    @Column(name="item_participantname")
    private String participantname;
    @Column(name="item_membershipstartdate")
    private String membershipstartdate;
    @Column(name="item_registeredaddress")
    private String registeredaddress;
    @Column(name="item_billingaddress")
    private String billingaddress;
    @Column(name="item_region")
    private String region;
    @Column(name="item_ownership")
    private String ownership;
    @Column(name="item_natureofbusiness")
    private String natureofbusiness;
    @Column(name="item_DWMcounterparty")
    private String DWMcounterparty;
    @Column(name="item_license")
    private String license;
    @Column(name="item_licensestartdate")
    private String licensestartdate;
    @Column(name="item_licenseenddate")
    private String licenseenddate;
    @Column(name="item_applicationdate")
    private String applicationdate;
    @Column(name="item_remarks")
    private String remarks;
    @Column(name="item_paidregistrationfee")
    private String paidregistrationfee;
    @Column(name="item_applicationtype")
    private String applicationtype;
    @Column(name="item_participantleveldate")
    private String participantleveldate;








    public Item() {
    }

    public Item(String itemName, String category) {
        this.itemName = itemName;
        this.category = category;

    }

    public Item(String shortname, String organization, String participantname, String membershipstartdate, String registeredaddress, String billingaddress, String region, String ownership, String natureofbusiness, String DWMcounterparty, String license, String licensestartdate, String licenseenddate, String applicationdate, String remarks, String paidregistrationfee, String applicationtype, String participantleveldate) {
        this.shortname = shortname;
        this.organization = organization;
        this.participantname = participantname;
        this.membershipstartdate = membershipstartdate;
        this.registeredaddress = registeredaddress;
        this.billingaddress = billingaddress;
        this.region = region;
        this.ownership = ownership;
        this.natureofbusiness = natureofbusiness;
        this.DWMcounterparty = DWMcounterparty;
        this.license = license;
        this.licensestartdate = licensestartdate;
        this.licenseenddate = licenseenddate;
        this.applicationdate = applicationdate;
        this.remarks = remarks;
        this.paidregistrationfee = paidregistrationfee;
        this.applicationtype = applicationtype;
        this.participantleveldate = participantleveldate;
    }

    public long getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }
    public String getShortname() {
        return shortname;
    }

    public String getOrganization() {
        return organization;
    }

    public String getParticipantname() {
        return participantname;
    }

    public String getMembershipstartdate() {
        return membershipstartdate;
    }

    public String getRegisteredaddress() {
        return registeredaddress;
    }

    public String getBillingaddress() {
        return billingaddress;
    }

    public String getRegion() {
        return region;
    }

    public String getOwnership() {
        return ownership;
    }

    public String getNatureofbusiness() {
        return natureofbusiness;
    }

    public String getDWMcounterparty() {
        return DWMcounterparty;
    }

    public String getLicense() {
        return license;
    }

    public String getLicensestartdate() {
        return licensestartdate;
    }

    public String getLicenseenddate() {
        return licenseenddate;
    }

    public String getApplicationdate() {
        return applicationdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public String getPaidregistrationfee() {
        return paidregistrationfee;
    }

    public String getApplicationtype() {
        return applicationtype;
    }

    public String getParticipantleveldate() {
        return participantleveldate;
    }
}
