<%@ taglib prefix="jcr" uri="http://www.jahia.org/tags/jcr" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="utility" uri="http://www.jahia.org/tags/utilityLib" %>
<%@ taglib prefix="template" uri="http://www.jahia.org/tags/templateLib" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="Form">
	<h3>Add Product</h3>
	<form method="post" action="<c:url value="${url.base}${currentNode.path}"/>.addKeyword.do" name="addProductForm" id="addProductForm">
		<p>
			<label class="left" for="keywords">KeyWords</label><input type="text"
				name="keywords" id="keywords" />
		</p>
		<div class="divButton">
                <input type="submit" class="button"
                       value="Add Product"/>
            </div>
	</form>
</div>