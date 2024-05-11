package org.Dependency.Bean.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="myPerson")
public class Person
{
	@Autowired
	private PanCard card;

	public PanCard getCard() {
		return card;
	}

	public void setCard(PanCard card) {
		this.card = card;
	}
	
	public void displayPanCard()
	{
		card.display();
	}
//	public Person()
//	{
//		
//	}
//	public Person(PanCard card)
//	{
//		this.card=card;
//	}
}
