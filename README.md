# cs403_16-2_F-proj
Project work for F hr in Term 16-2, CS403 

This is the description for the card game Cheat

Cheat is a 4-player card game, also called other more explicit
names by the playerbase. 

	Win conditions: 

The objective of Cheat is for the player to discard 
all their cards before the other players (and not lose a challenge on 
the final play). The first player to do so is declared the winner, 
and upon completion of this task, the game ends.

	Equipment: 

4 players are required to play this game. It is played using
a normal 52-card deck consisting of cards of the 2, 3, 4, 5, 6, 7, 8, 9, 
10, Jack(J), Queen(Q), King(K), and Ace (A) cards. 

	Playing Area/Board: 
	
A four-sided table with a spot in the center of the 
table for the deck to be placed. 

	Actions Each Turn: 

The game begins with the cards being shuffled
into a random order. The cards are then dealt clockwise until all cards
have been dealt, so in a 4-player game each player should be dealt 
13 random cards from the 52-card deck. The player order is also rotated
in a clockwise manner. It is assumed that this game will be played around
a square table with 4 positions: the 12'o clock, 3'o clock, 6'o clock, 
and 9'o clock. Therefore the starting player will be in the 12'o clock,
then the next player is in 3, 6, then 9 until it rotates back to the 12.
These cards are not revealed to the other players; only the player 
knows what cards they hold in their hand. 

On a player turn, a player MUST place a card down on the stack in the 
center of the table. Starting with the first player, cards must be put down 
in ascending order. The first player must begin by placing down a number
of "Ace" cards from his/her hand onto the stack in the center of the table with a 
minimum of one card being placed, to a maximum of four. The player must 
declare the number and type of cards they are placing down. The next player 
must place down a number of "2" cards, then the next player a number of "3" cards
, and so on in ascending order until the Kings place has been reached, 
in which case the order loops back to Aces. This game continues until 
one person has no cards remaining in his/her hand and does not fail
a challenge from another player. 

A player may choose to disregard the order of cards and place down 
cards that do not match the current order. However, at the end of each 
player's turn any other player may declare that player has "cheated", and
the cards that player played are revealed. If any of them don't match
the current order, that player is considered "cheating", and must add the 
cards in the center stack to their own hand. However if the cards are 
revealed and they all match the card in the current order, then the player
that accused the current player of cheating must instead add all the cards
in the center stack to their own hand. 

The play then continues in the normal rotation, the next player starting
a new stack in the center. 
