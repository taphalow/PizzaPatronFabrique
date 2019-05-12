package factories;

import abstractFactory.AbstractFactory;
import abstractProduits.AbstractOriental;
import abstractProduits.AbstractReines;
import abstractProduits.AbstractTroisFormages;
import produits.OrientalSN;
import produits.ReinesSN;
import produits.TroisFromagesSN;

public class FactorySN extends AbstractFactory {

	public FactorySN() {
		super();
	}
	@Override
	public AbstractOriental createProductOriental() {
		// TODO Auto-generated method stub
		return new OrientalSN();
	}

	@Override
	public AbstractReines createProductReines() {
		// TODO Auto-generated method stub
		return new ReinesSN();
	}

	@Override
	public AbstractTroisFormages createProductTroisFromages() {
		// TODO Auto-generated method stub
		return new TroisFromagesSN();
	}

}
