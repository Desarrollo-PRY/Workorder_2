package com.ec.tvcable.workorder.bean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.component.bean.Service;

import com.ec.tvcable.workorder.InterfaceMaterials;
import com.ec.tvcable.workorder.jpa.Ytbl_Materials;

@Service(InterfaceMaterials.class)
public class TransactionMaterialCWO implements InterfaceMaterials {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveMaterials(Ytbl_Materials parameter) {
		em.persist(parameter);

	}

}
