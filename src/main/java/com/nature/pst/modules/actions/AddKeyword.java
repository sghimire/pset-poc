package com.nature.pst.modules.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jahia.bin.Action;
import org.jahia.bin.ActionResult;
import org.jahia.services.content.JCRSessionWrapper;
import org.jahia.services.render.RenderContext;
import org.jahia.services.render.Resource;
import org.jahia.services.render.URLResolver;
import org.json.JSONObject;
import org.slf4j.Logger;

public class AddKeyword extends Action {

	Logger logger = org.slf4j.LoggerFactory.getLogger(AddKeyword.class);
	
	@Override
	public ActionResult doExecute(HttpServletRequest req,
			RenderContext renderContext, Resource resource,
			JCRSessionWrapper session, Map<String, List<String>> parameters,
			URLResolver urlResolver) throws Exception {
		
		logger.debug("In AddKeyword do execute method.");
		
		String keyword = req.getParameter("keywords");
		
		return new ActionResult(HttpServletResponse.SC_OK, null, new JSONObject(keyword));		
	}

}
