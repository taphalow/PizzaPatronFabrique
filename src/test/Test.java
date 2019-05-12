package test;

import abstractFactory.AbstractFactory;
import abstractProduits.AbstractOriental;
import abstractProduits.AbstractReines;
import abstractProduits.AbstractTroisFormages;

public class Test {

	public static void main(String[] args) {
		String pays = "FR";
		AbstractFactory factory = AbstractFactory.getFactory(pays);
		AbstractOriental oriental = factory.createProductOriental();
		AbstractReines reines = factory.createProductReines();
		AbstractTroisFormages troisFromages = factory.createProductTroisFromages();
		
		oriental.service();
		reines.service();
		troisFromages.service();
	}

}
