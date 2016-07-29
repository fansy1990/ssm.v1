package demo.dao;

import java.util.List;

import demo.model.Node;

public interface NodeMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Node record);

	int insertSelective(Node record);

	Node selectByPrimaryKey(Integer id);

	List<Node> selectPage(Integer start, Integer end);

	int updateByPrimaryKeySelective(Node record);

	int updateByPrimaryKey(Node record);
}