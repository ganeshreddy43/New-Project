package EmployeeDetails;

public class CompanyDetails {
    private String name;
   private String fatherName;
  private String id;
  private String mobileNo;
    public CompanyDetails(String name, String fatherName, String id, String mobileNo) {
        this.name = name;
        this.fatherName = fatherName;
        this.id = id;
        this.mobileNo = mobileNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getId() {
        return id;
    }

    public String getMobileNo() {
        return mobileNo;
    }
}
