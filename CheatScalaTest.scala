package tdd_intro

import org.scalatest.FunSpec
import org.scalatest.Matchers

class GameAreaTest extends FunSpec with Matchers {
  
   describe("Test for the simulation of the first turn") {
    describe("Test for the simulation of the 5th turn") {
      describe("Test for the simulation of the 13th turn") {
		describe("Test for the simulation of the 14th turn") {
			describe("Test for the simulation of the -1 turn") {
				describe("Test for the simulation of the current turn") {

        val turn1 = 1
        val turn5 = 5        
        val turn13 = 16        
		val turn14= 17
		val turnX= -1
		
		val p1Cards= getCards("p1") // A function of the main game that returns a string of the cards in a player's hand
		val p2Cards= getCards("p2")
		val p3Cards= getCards("p3")
		val p4Cards= getCards("p4")
		
		val p1Count= countCards("p1")
		val p2Count= countCards("p2")
		val p3Count= countCards("p3")
		val p4Count= countCards("p4")
		val centerDeck= countCards("center")
		val currentTurn= getTurnNumber()
		
        showGameArea(turn1) shouldBe "Current card order is: Ace. Player 1 has: " + p1Count. + " cards. Player 2 has: "+p2Count+ " cards. Player 3 has: "+ p3Count + " cards. Player 4 has: " + p4Count+ " cards. Cards in center deck: 0."
		showGameArea(turn5) shouldBe "Current card order is: 4. Player 1 has: " + p1Count. + " cards. Player 2 has: "+p2Count+ " cards. Player 3 has: "+ p3Count + " cards. Player 4 has: " + p4Count+ " cards. Cards in center deck: "+ centerDeck+ "."
		showGameArea(turn13) shouldBe "Current card order is: King. Player 1 has: " + p1Count. + " cards. Player 2 has: "+p2Count+ " cards. Player 3 has: "+ p3Count + " cards. Player 4 has: " + p4Count+ " cards. Cards in center deck: "+ centerDeck+ "."
		showGameArea(turn14) shouldBe "Current card order is: Ace. Player 1 has: " + p1Count. + " cards. Player 2 has: "+p2Count+ " cards. Player 3 has: "+ p3Count + " cards. Player 4 has: " + p4Count+ " cards. Cards in center deck: "+ centerDeck+ "."
		showGameArea() shouldBe "Current card order is: "+getCurrentCard(currentTurn) + ". Player 1 has: " + p1Count. + " cards. Player 2 has: "+p2Count+ " cards. Player 3 has: "+ p3Count + " cards. Player 4 has: " + p4Count+ " cards. Cards in center deck: "+ centerDeck+ "."
        showGameArea(turnX) shouldBe "Not an acceptable turn number"
						}   
					}
				}
			}
		}
	}
}

class testShowPlayerOrder extends FunSpec with Matchers {
  
   describe("Test for the starting player order") {
    val p1= "Greg"
	val p2= "Zach"
	val p3= "Natasha"
	val p4 = "April"
	
	val expectedResult= "Greg, Zach, Natasha, April"
	
	menu.showPlayerOrder(p1,p2,p3,p4) shouldBe expectedResult
	
	}   
}

class testAdvanceOrder extends FunSpec with Matchers {
  
   describe("Test for the advance player order") {
    val order1=  "Greg, Zach, Natasha, April"
	val order2=  "Zach, Natasha, April, Greg"
	val order3=  "Natasha, April, Greg, Zach"
	val order4=  "April, Greg, Zach, Natasha"
	
	advanceOrder(order1) shouldBe order2
	advanceOrder(order2) shouldBe order3
	advanceOrder(order3) shouldBe order4
	advanceOrder(order4) shouldBe order1
	
	}   
}

