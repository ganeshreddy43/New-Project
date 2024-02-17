package EmployeeDetails;

public class Test {
    public static void main(String[] args) {
        CompanyDetails companyDetails= new CompanyDetails("kiran",
                "xyz","3455","9999");
        System.out.println(companyDetails.getName());
        companyDetails.setName("abcd");
        System.out.println(companyDetails.getName());

    }
}
