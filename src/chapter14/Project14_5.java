package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Project14_5 {

	public static void main(String[] args){
		Deck deck = new Deck(); deck.populate(); deck.shuffle();
		Player player1 = new Player(), player2 = new Player();
		
		player1.unplayed.addCards(deck.takeCards(26));
		player2.unplayed.addCards(deck.takeCards(26));
		
		while(player1.unplayed.size() > 0 && player2.unplayed.size() > 0){
			int compare = 0;
			do{
				player1.playCard(); player2.playCard();
				System.out.println("Player 1: " + player1.war);
				System.out.println("Player 2: " + player2.war);
				
				compare = player1.war.getTopCard().compareTo(player2.war.getTopCard());
				if(compare == 0){
					System.out.println("TIE");
				}
			} while(compare == 0);
			
			if(compare > 0){
				System.out.println("Player 1 Wins");
				player1.wins.addCards(player1.war.takeCards());
				player1.wins.addCards(player2.war.takeCards());
			}else if(compare < 0){
				System.out.println("Player 2 Wins");
				player2.wins.addCards(player1.war.takeCards());
				player2.wins.addCards(player2.war.takeCards());
			}
			
			System.out.println(player1.score() + " - " + player2.score());
		}
		String msg = "The winner is ";
		msg += (player1.score() > player2.score()) ? "Player 1" : "Player 2";
		msg = (player1.score() == player2.score()) ? "The game resulted in a tie" : msg;
		System.out.println(msg);
	}
	
}

class Card implements Comparable<Card> {
	static final int HEART = 0, DIAMOND = 1, SPADE = 2, CLUB = 3;
	static final int JACK = 11, QUEEN = 12, KING = 13, ACE = 14;
	
	private int rank, suit;
	
	Card(int suit, int rank){
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank(){
		return rank;
	}
	public int getSuit(){
		return suit;
	}
	
	@Override
	public int compareTo(Card card) {
		Card c = (Card)card;
		return (this.rank == c.getRank()) ? 0 :
			this.rank - c.getRank();
	}
	
	public String toString(){
		String result = "";
		switch(suit){
			case HEART:
				result += "H";
				break;
			case DIAMOND:
				result += "D";
				break;
			case SPADE:
				result += "S";
				break;
			case CLUB:
				default:
				result += "C";
		}
		result += String.format("%02d", rank);
		return result;
	}
	
}

class Deck {
	List<Card> cards = new ArrayList<Card>();
	
	public Card takeCard(){
		Card c = cards.get(cards.size()-1);
		cards.remove(cards.size()-1);
		return c;
	}
	public List<Card> takeCards(int x){
		List<Card> cs = new ArrayList<Card>();
		x = (x > cards.size()) ? cards.size() : x;
		for(int i = 0; i < x; i++){
			cs.add(takeCard());
		}
		return cs;
	}
	public List<Card> takeCards(){
		return takeCards(cards.size());
	}
	public void addCard(Card c){
		cards.add(c);
	}
	public void addCards(List<Card> cs){
		for(Card c : cs){
			addCard(c);
		}
	}
	
	public void populate(){
		for(int suit = 0; suit < 4; suit++){
			for(int rank = 2; rank <= 14; rank++){
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	public Card getTopCard(){
		return cards.get(cards.size()-1);
	}
	
	public int size(){
		return cards.size();
	}
	
	public void shuffle(){
		Random rand = new Random();
		for(int times = 0; times < rand.nextInt(3)+1; times++)
			for(int i = 0; i < cards.size(); i++){
				int index = rand.nextInt(cards.size());
				Card c = cards.get(index);
				cards.set(index, cards.get(i));
				cards.set(i, c);
			}
	}
	
	public String toString(){
		String result = "";
		for(Card c : cards){
			result += c + " ";
		}
		return result;
	}
}

class Player {
	public Deck unplayed = new Deck(), war = new Deck(), wins = new Deck();
	
	public int score(){
		return wins.size();
	}
	
	public void playCard(){
		war.addCard(unplayed.takeCard());
	}
}