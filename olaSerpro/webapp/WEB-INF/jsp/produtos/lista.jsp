<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<ul>
<c:forEach items="${produtoList}" var="produto">
    <li> ${produto.nome} - ${produto.descricao} - ${produto.preco} </li>
</c:forEach>
</ul>
<a href="${linkTo[ProdutosController].novo}" id="botaoAdiciona">Novo Produto</a>
