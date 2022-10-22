package ru.mirea.laba_7;

public class Company {
    String company;

    public Company(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Company{" +
                "company='" + company + '\'' +
                '}';
    }
}
