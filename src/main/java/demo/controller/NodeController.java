package demo.controller;

import java.util.List;

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

	@RequestMapping(value = "getData")
	public ModelAndView getData(int start, int end) {
		ModelAndView modelAndView = new ModelAndView();
		List<Node> nodes = nodeService.getData(start, end);

		System.out.println(nodes);
		// println(node);
		modelAndView.addObject("node", nodes);

		return modelAndView;

	}

	public NodeService getNodeService() {
		return nodeService;
	}

	public void setNodeService(NodeService nodeService) {
		this.nodeService = nodeService;
	}
}
