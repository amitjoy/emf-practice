package emfswitch;

import production.Article;
import production.Category;
import production.MyWeb;
import production.Webpage;
import production.util.ProductionSwitch;

public class Switch extends ProductionSwitch<String>{
	
	@Override
	public String caseArticle(Article object) {
		System.out.println("Visiting Article");
		return object.getName();
	}
	
	@Override
	public String caseMyWeb(MyWeb object) {
		System.out.println("Visiting MyWeb");
		return object.getName();
	}
	
	@Override
	public String caseWebpage(Webpage object) {
		System.out.println("Visiting Webpage");
		return object.getName();
	}
	
	@Override
	public String caseCategory(Category object) {
		System.out.println("Visiting Category");
		return object.getName().getName();
	}
	
}
