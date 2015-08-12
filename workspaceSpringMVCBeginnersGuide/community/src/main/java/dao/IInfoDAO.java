package dao;

import java.util.List;

import domain.Information;

public interface IInfoDAO {
	public void addInfo(Information info);
	public List<Information> getAllInfo();
	public List<Information> getInfoBySqlString(String sql);

}
