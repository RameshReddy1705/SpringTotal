package org.Ramesh.Siva;

public class Person
{
	private PanCard card;
	
	public Person()
	{
		
	}
	public Person(PanCard card)
	{
		this.card=card;
	}
	public PanCard getCard() {
		return card;
	}
	public void setCard(PanCard card) {
		this.card = card;
	}
}
