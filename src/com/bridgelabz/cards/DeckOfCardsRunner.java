package com.bridgelabz.cards;

public class DeckOfCardsRunner
{
    public static void main(String[] args)
    {
        DistributeCards distributeCards=new DistributeCards(4,9);
        distributeCards.distribute();
        distributeCards.printDistributedCards();

    }

}
