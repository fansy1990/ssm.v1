package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.NodeMapper;
import demo.model.Node;

@Service
public class NodeService {

	@Autowired
	private NodeMapper nodeMapper;

	public Node getNodes(int id) {
		return this.nodeMapper.selectByPrimaryKey(id);
	}

	public NodeMapper getNodeMapper() {
		return nodeMapper;
	}

	public void setNodeMapper(NodeMapper nodeMapper) {
		this.nodeMapper = nodeMapper;
	}

}
