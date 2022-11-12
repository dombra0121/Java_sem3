package ru.mirea.practika10.ex2;

public class TestChair {
    public static void main(String[] arg) {
        FunctionalChair functionalChair = new FunctionalChair();
        System.out.println(functionalChair.sum(4, 5));
        System.out.println(functionalChair);

        MagicChair magicChair = new MagicChair();
        magicChair.doMagic();
        System.out.println(magicChair);

        VictorianChair victorianChair = new VictorianChair(1);
        System.out.println(victorianChair.getAge());
        System.out.println(victorianChair);

        Client client = new Client();
        ChairFactory chairFactory = new ChairFactory();
        Chair chair1 = chairFactory.createMagicanChair();
        Chair chair2 = chairFactory.createVictorianChair();
        Chair chair3 = chairFactory.createFunctionalChair();
        client.setChair(chair1);
        System.out.println(client);
        client.setChair(chair2);
        System.out.println(client);
        client.setChair(chair3);
        System.out.println(client);
    }
}
