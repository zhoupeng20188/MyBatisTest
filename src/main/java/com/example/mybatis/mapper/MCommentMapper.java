package com.example.mybatis.mapper;

import com.example.mybatis.dto.CommentDto;
import com.example.mybatis.entity.MComment;
import com.example.mybatis.entity.MCommentExample;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MCommentMapper {
    @Select("select a.*, c.name as user_name from m_comment a inner join t_goods b on a.goods_id = b.id left join t_user c on a.user_id = c.id where a.goods_id = #{id}")
    List<CommentDto> selectComment(Integer id);

    long countByExample(MCommentExample example);

    int deleteByExample(MCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MComment record);

    int insertSelective(MComment record);

    List<MComment> selectByExample(MCommentExample example);

    MComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MComment record);

    int updateByPrimaryKey(MComment record);
}