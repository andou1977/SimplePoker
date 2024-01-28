package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){



        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};
        List<String>list = new ArrayList<>();

        list.add(Arrays.toString(ranks));

        Deck deck = new Deck();
        deck.shuffle();

        List<Player> players = new ArrayList<>();
        players.add(new Player("Joueur 1"));
        players.add(new Player("Joueur 2"));

        // Distribuer deux cartes à chaque joueur
        for (Player player : players) {
            player.addCard(deck.dealCard());
            player.addCard(deck.dealCard());
        }

        // Afficher les cartes de chaque joueur
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getHand());
        }

        // Déterminer le gagnant
        Player winner = determineWinner(players);
        System.out.println("Le gagnant est : " + winner.getName());
    }
    private static Player determineWinner(List<Player> players) {
        Player winner = players.get(0);
        for (Player player : players) {
//            if (player.getHand().compareTo(winner.getHand()) > 0) {
                winner = player;
//            }
        }
        return winner;
    }
}
