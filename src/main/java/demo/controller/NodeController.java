package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import demo.model.Node;
import demo.service.NodeService;

@Controller
public class NodeController {

	@Autowired
	private NodeService nodeService;

	@RequestMapping(value = "nodeList")
	public ModelAndView getNodeList(int id) {
		ModelAndView modelAndView = new ModelAndView("navigator");
		Node node = nodeService.getNodes(id);

		// println(node);
		modelAndView.addObject("node", node);

		return modelAndView;

	}

	public NodeService getNodeService() {
		return nodeService;
	}

	public void setNodeService(NodeService nodeService) {
		this.nodeService = nodeService;
	}
}
