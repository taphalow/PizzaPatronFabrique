package factories;

import abstractFactory.AbstractFactory;
import abstractProduits.AbstractOriental;
import abstractProduits.AbstractReines;
import abstractProduits.AbstractTroisFormages;
import produits.OrientalFR;
import produits.ReinesFR;
import produits.TroisFromagesFR;

public class FactoryFR extends AbstractFactory {

	@Override
	public AbstractOriental createProductOriental() {
		// TODO Auto-generated method stub
		return new OrientalFR();
	}

	@Override
	public AbstractReines createProductReines() {
		// TODO Auto-generated method stub
		return new ReinesFR();
	}

	@Override
	public AbstractTroisFormages createProductTroisFromages() {
		// TODO Auto-generated method stub
		return new TroisFromagesFR();
	}

}
