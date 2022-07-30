package com.bridgelabz.cards;

public class DeckOfCards {
    String[] suits;
    String[] ranks;
    String[] cards;

    public DeckOfCards()
    {
        suits=new String[]{"Club","Diamond","Hearts","Speads"};
        ranks=new String[]{"2", "3", "4", "5", "6", "7", "8",
                "9", "10", "Jack", "Queen", "King", "Ace"};
        cards=new String[suits.length*ranks.length];
    }

    void initDeck()
    {
        for (int i = 0; i < suits.length; i++)
        {
            for(int j=0;j<ranks.length;j++)
            {
                cards[i*ranks.length+j]=suits[i]+ " of "+ranks[j];
            }
        }
    }

    void printDeck()
    {
        for(int i=0;i< cards.length;i++)
        {
            System.out.println(cards[i]);
        }
    }
}
