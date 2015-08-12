package service.imp;

import java.util.List;

import dao.IInfoDAO;
import dao.imp.InfoDAO;
import domain.Information;
import service.IInfoService;

public class InfoService implements IInfoService {
	private IInfoDAO infoDAO = new InfoDAO();
	public InfoService(){
		
	}

	public void addInfo(Information information) {
		// TODO Auto-generated method stub
		if(information == null){
			return;
		}
		//if the id != null, means the information has exists, should not be added, but updated
		if(information.getId() != null){
			return;
		}
		
		infoDAO.addInfo(information);
	}

	public List<Information> getAllInfo() {
		// TODO Auto-generated method stub
		return infoDAO.getAllInfo();
	}

}
