package shop.metacoding.miniproject3.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.metacoding.miniproject3.dto.JoinReqDto;
import shop.metacoding.miniproject3.dto.LoginReqDto;

@Mapper
public interface UserRepository {
    public int insert(JoinReqDto joinReqDto);

    public int updateById(LoginReqDto loginReqDto);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(LoginReqDto loginReqDto);
}
