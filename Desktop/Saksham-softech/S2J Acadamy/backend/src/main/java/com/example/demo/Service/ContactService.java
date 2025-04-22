package com.example.demo.Service;
import java.util.List;
import com.example.demo.Entity.Entity;

public interface ContactService {

	public Entity savecontact(Entity entity);
	public List<Entity> getEntity();
	public Entity updatecontact(Entity entity);
	void deleteEntity(long parseLong);
}











	

