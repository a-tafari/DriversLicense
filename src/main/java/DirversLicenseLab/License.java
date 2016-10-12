package DirversLicenseLab;

/**
 * Created by abijah on 10/11/16.
 */
public class License {

private String dob, name;
private Boolean organDoner;
    private char gender;
    private double weight;

    public License (String n, char g, String d){
        name= n;
        gender = g;
        dob = d;
    }
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOrganDoner() {
        return organDoner;
    }

    public void setOrganDoner(Boolean organDoner) {
        this.organDoner = organDoner;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String serializeToCSV(){
        StringBuilder myNewString = new StringBuilder();
//        myNewString.append(name).append(',').append(dob).append(',').append(gender).append(',').append(organDoner).append(weight);
//        return myNewString.toString();

        String result = String.format("%s,%c,%s", name , gender, dob);
        return  result;
    }

    public static String getCSVHeader(){
        return "Name,Gender,Date of Birth";
    }

    public static void main(String[] args) {

        License l = new License("Billy", 'M', "6/25/82");
        System.out.format("%s\n%s\n", l.getCSVHeader(),l.serializeToCSV());



    }


}
