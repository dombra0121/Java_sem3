package ru.mirea.practika10.ex2;

public class MagicChair implements Chair {
    public MagicChair() {
    }

    public void doMagic() {
        System.out.println("Magic!");
    }

    @Override
    public String toString() {
        return "MagicChair";
    }
}
