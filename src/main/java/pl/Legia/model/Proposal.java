package pl.Legia.model;

import java.sql.Date;
import java.util.Objects;

public class Proposal {

    private long proposalId;
    private String firstName;
    private String secondName;
    private String surname;
    private String citizenship;
    private Date birthDate;
    private String birthPlace;
    private String PESEL;
    private String addressOfStay;
    private String addressOfCorrespondence;
    private String phoneNumber;
    private String universityName;
    private String universityFaculty;
    private String fieldOfStudy;
    private String yearOfStudy;
    private String plannedYearOfGraduation;
    private String healthCategory;

    public Proposal(){}

    public Proposal(Proposal proposal) {
        this.proposalId = proposal.proposalId;
        this.firstName = proposal.firstName;
        this.secondName = proposal.secondName;
        this.surname = proposal.surname;
        this.citizenship = proposal.citizenship;
        this.birthDate = proposal.birthDate;
        this.birthPlace = proposal.birthPlace;
        this.PESEL = proposal.PESEL;
        this.addressOfStay = proposal.addressOfStay;
        this.addressOfCorrespondence = proposal.addressOfCorrespondence;
        this.phoneNumber = proposal.phoneNumber;
        this.universityName = proposal.universityName;
        this.universityFaculty = proposal.universityFaculty;
        this.fieldOfStudy = proposal.fieldOfStudy;
        this.yearOfStudy = proposal.yearOfStudy;
        this.plannedYearOfGraduation = proposal.plannedYearOfGraduation;
        this.healthCategory = proposal.healthCategory;
    }

    public long getProposalId() {
        return proposalId;
    }

    public void setProposalId(long proposalId) {
        this.proposalId = proposalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getPESEL() {
        return PESEL;
    }

    public void setPESEL(String PESEL) {
        this.PESEL = PESEL;
    }

    public String getAddressOfStay() {
        return addressOfStay;
    }

    public void setAddressOfStay(String addressOfStay) {
        this.addressOfStay = addressOfStay;
    }

    public String getAddressOfCorrespondence() {
        return addressOfCorrespondence;
    }

    public void setAddressOfCorrespondence(String addressOfCorrespondence) {
        this.addressOfCorrespondence = addressOfCorrespondence;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityFaculty() {
        return universityFaculty;
    }

    public void setUniversityFaculty(String universityFaculty) {
        this.universityFaculty = universityFaculty;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getPlannedYearOfGraduation() {
        return plannedYearOfGraduation;
    }

    public void setPlannedYearOfGraduation(String plannedYearOfGraduation) {
        this.plannedYearOfGraduation = plannedYearOfGraduation;
    }

    public String getHealthCategory() {
        System.out.println("ProposalClass health_category getter: "+ healthCategory);
        return healthCategory;
    }

    public void setHealthCategory(String healthCategory) {
        this.healthCategory = healthCategory;
    }


    @Override
    public String toString() {
        return "proposal{" +
                "proposalId=" + proposalId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", surname='" + surname + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", birthDate=" + birthDate +
                ", birthPlace='" + birthPlace + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", addressOfStay='" + addressOfStay + '\'' +
                ", addressOfCorrespondence='" + addressOfCorrespondence + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", universityFaculty='" + universityFaculty + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", yearOfStudy='" + yearOfStudy + '\'' +
                ", plannedYearOfGraduation='" + plannedYearOfGraduation + '\'' +
                ", healthCategory='" + healthCategory + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proposal)) return false;
        Proposal proposal = (Proposal) o;
        return proposalId == proposal.proposalId &&
                Objects.equals(firstName, proposal.firstName) &&
                Objects.equals(secondName, proposal.secondName) &&
                Objects.equals(surname, proposal.surname) &&
                Objects.equals(citizenship, proposal.citizenship) &&
                Objects.equals(birthDate, proposal.birthDate) &&
                Objects.equals(birthPlace, proposal.birthPlace) &&
                Objects.equals(PESEL, proposal.PESEL) &&
                Objects.equals(addressOfStay, proposal.addressOfStay) &&
                Objects.equals(addressOfCorrespondence, proposal.addressOfCorrespondence) &&
                Objects.equals(phoneNumber, proposal.phoneNumber) &&
                Objects.equals(universityName, proposal.universityName) &&
                Objects.equals(universityFaculty, proposal.universityFaculty) &&
                Objects.equals(fieldOfStudy, proposal.fieldOfStudy) &&
                Objects.equals(yearOfStudy, proposal.yearOfStudy) &&
                Objects.equals(plannedYearOfGraduation, proposal.plannedYearOfGraduation) &&
                Objects.equals(healthCategory, proposal.healthCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proposalId, firstName, secondName, surname, citizenship, birthDate, birthPlace, PESEL, addressOfStay, addressOfCorrespondence, phoneNumber, universityName, universityFaculty, fieldOfStudy, yearOfStudy, plannedYearOfGraduation, healthCategory);
    }
}
