package pl.Legia.model;

import java.util.Objects;

public class Training {
    private long training_id;
    private String militaryBookNumber;
    private String substantiation;
    private String qualifications;
    private String theoreticalPart;
    private String basicModule;
    private String preOfficerModule;
    private String trainingPlace;
    private String universityAddress;
    private long userId;

    public Training() {
    }

    public Training(long training_id, String militaryBookNumber, String substantiation, String qualifications, String theoreticalPart, String basicModule, String preOfficerModule, String trainingPlace, String universityAddress, long userId) {
        this.training_id = training_id;
        this.militaryBookNumber = militaryBookNumber;
        this.substantiation = substantiation;
        this.qualifications = qualifications;
        this.theoreticalPart = theoreticalPart;
        this.basicModule = basicModule;
        this.preOfficerModule = preOfficerModule;
        this.trainingPlace = trainingPlace;
        this.universityAddress = universityAddress;
        this.userId = userId;
    }

    public long getTraining_id() {
        return training_id;
    }

    public void setTraining_id(long training_id) {
        this.training_id = training_id;
    }

    public String getMilitaryBookNumber() {
        return militaryBookNumber;
    }

    public void setMilitaryBookNumber(String militaryBookNumber) {
        this.militaryBookNumber = militaryBookNumber;
    }

    public String getSubstantiation() {
        return substantiation;
    }

    public void setSubstantiation(String substantiation) {
        this.substantiation = substantiation;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public String getTheoreticalPart() {
        return theoreticalPart;
    }

    public void setTheoreticalPart(String theoreticalPart) {
        this.theoreticalPart = theoreticalPart;
    }

    public String getBasicModule() {
        return basicModule;
    }

    public void setBasicModule(String basicModule) {
        this.basicModule = basicModule;
    }

    public String getPreOfficerModule() {
        return preOfficerModule;
    }

    public void setPreOfficerModule(String preOfficerModule) {
        this.preOfficerModule = preOfficerModule;
    }

    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Training)) return false;
        Training training = (Training) o;
        return getTraining_id() == training.getTraining_id() &&
                getUserId() == training.getUserId() &&
                Objects.equals(getMilitaryBookNumber(), training.getMilitaryBookNumber()) &&
                Objects.equals(getSubstantiation(), training.getSubstantiation()) &&
                Objects.equals(getQualifications(), training.getQualifications()) &&
                Objects.equals(getTheoreticalPart(), training.getTheoreticalPart()) &&
                Objects.equals(getBasicModule(), training.getBasicModule()) &&
                Objects.equals(getPreOfficerModule(), training.getPreOfficerModule()) &&
                Objects.equals(getTrainingPlace(), training.getTrainingPlace()) &&
                Objects.equals(getUniversityAddress(), training.getUniversityAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTraining_id(), getMilitaryBookNumber(), getSubstantiation(), getQualifications(), getTheoreticalPart(), getBasicModule(), getPreOfficerModule(), getTrainingPlace(), getUniversityAddress(), getUserId());
    }

    @Override
    public String toString() {
        return "Training{" +
                "training_id=" + training_id +
                ", militaryBookNumber='" + militaryBookNumber + '\'' +
                ", substantiation='" + substantiation + '\'' +
                ", qualifications='" + qualifications + '\'' +
                ", theoreticalPart='" + theoreticalPart + '\'' +
                ", basicModule='" + basicModule + '\'' +
                ", preOfficerModule='" + preOfficerModule + '\'' +
                ", trainingPlace='" + trainingPlace + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                ", userId=" + userId +
                '}';
    }
}