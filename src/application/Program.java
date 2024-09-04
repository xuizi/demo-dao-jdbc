package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		seller seller1 = sellerDao.findById(3);
		System.out.println(seller1);
	}

}
