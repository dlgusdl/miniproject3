package shop.metacoding.miniproject3.model.boad;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoadRepository {
    public int insert(Boad boad);

    public int updateById(Boad boad);

    public int deleteById(int id);

    public List<Boad> findAll();

    public Boad findById(int id);
}
