package shop.metacoding.miniproject3.model.product;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRepository {
    public int insert(Product product);

    public int updateById(Product product);

    public int deleteById(int id);

    public List<Product> findAll();

    public Product findById(int id);
}
