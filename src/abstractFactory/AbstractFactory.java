package abstractFactory;

import abstractProduits.AbstractOriental;
import abstractProduits.AbstractReines;
import abstractProduits.AbstractTroisFormages;
import factories.FactoryFR;
import factories.FactorySN;
import factories.FactoryUSA;

public abstract class AbstractFactory {
	
	public static AbstractFactory getFactory(String s) {
		switch (s) {
			case "SN":
				return new FactorySN();
			case "USA":
				return new FactoryUSA();
			case "FR":
				return new FactoryFR();
		}
		return null;
	}
	
	public abstract AbstractOriental createProductOriental();
	public abstract AbstractReines createProductReines();
	public abstract AbstractTroisFormages createProductTroisFromages();
}
