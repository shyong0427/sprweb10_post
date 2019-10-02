package aa.bb.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SangpumController {
	@Autowired
	private SangpumModel sangpumModel;
	
	@RequestMapping(value = "sangpum", method = RequestMethod.POST)
	public ModelAndView submit(SangpumBean bean) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("result");
		modelAndView.addObject("data", sangpumModel.compute(bean));
		
		return modelAndView;
	}
}