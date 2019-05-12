package factories;

import abstractFactory.AbstractFactory;
import abstractProduits.AbstractOriental;
import abstractProduits.AbstractReines;
import abstractProduits.AbstractTroisFormages;
import produits.OrientalUSA;
import produits.ReinesUSA;
import produits.TroisFromagesUSA;

public class FactoryUSA extends AbstractFactory {

	@Override
	public AbstractOriental createProductOriental() {
		// TODO Auto-generated method stub
		return new OrientalUSA();
	}

	@Override
	public AbstractReines createProductReines() {
		// TODO Auto-generated method stub
		return new ReinesUSA();
	}

	@Override
	public AbstractTroisFormages createProductTroisFromages() {
		// TODO Auto-generated method stub
		return new TroisFromagesUSA();
	}

}
