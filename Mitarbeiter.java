public class Mitarbeiter {
     
    private String firstName;
    private String familyName;
    private String function; 
    private int entryYear;


    public Mitarbeiter(String firstName, String familyName, String function, int entryYear) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.function = function;
        this.entryYear = entryYear;
    }

    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFamilyName() {
        return familyName;
    }
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
    public String getFunction() {
        return function;
    }
    public void setFunction(String function) {
        this.function = function;
    }
    public int getEntryYear() {
        return entryYear;
    }
    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

}
