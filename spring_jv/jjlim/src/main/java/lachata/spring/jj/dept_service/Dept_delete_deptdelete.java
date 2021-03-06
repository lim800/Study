package lachata.spring.jj.dept_service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.action.dept_action.Action;
import dept.dao.dept_dao.Dept_DAO;
import dept.dto.dept_dto.DeptDTO;
import dept.model.dept_model.ActionCommand;

public class Dept_delete_deptdelete implements Action{

	@Override
	public ActionCommand execute(HttpServletRequest request, HttpServletResponse respson) {

		aaaaaDAO dept_DAO = new aaaaaDAO();
		//? μ²? ??΄λΈ? κ΅¬μ±? λ³΄μ¬μ£ΌκΈ° ??΄ select?¨?λ₯? ?¨? DTO ArrayList??λ‘? ???₯
		ArrayList<DeptDTO> arrayList = dept_DAO.selectAll();
		//λΆ?? ??΄λΈ? ? μ²? ?°?΄?°λ₯? forward λ°©μ?Όλ‘? Deletedata/delete_send.jspλ‘? λ³΄λ΄μ€?
		request.setAttribute("dept", arrayList);
		
		ActionCommand actionCommand = new ActionCommand();
		actionCommand.setRedirect(false);
		actionCommand.setPath("./Deletedata/delete_send.jsp");
		
		return actionCommand;
		
		
		
	}

}
