package ru.mirea.practika10.ex2;

public class Client implements Chair {
    public Chair chair;

    public void sit() {
        System.out.println(chair);
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Client{" +
                "chair=" + chair +
                '}';
    }
}
