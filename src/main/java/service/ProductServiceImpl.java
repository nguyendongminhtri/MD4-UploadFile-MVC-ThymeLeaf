package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    private List<Product> products = new ArrayList<>();

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        for (Product product1 : products) {
            if (product1.getId() == id) {
                product1 = product;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i=0;i<products.size();i++){
            if(products.get(i).getId()==id){
                products.remove(i);
                break;
            }
        }
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }
}
