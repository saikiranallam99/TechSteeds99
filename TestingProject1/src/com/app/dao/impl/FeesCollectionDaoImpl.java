package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IFeesCollectionDao;
import com.app.model.Accountant;
import com.app.model.AssignFee;
import com.app.model.CollectFee;
import com.app.model.FeesDiscount;
import com.app.model.FeesGroup;
import com.app.model.FeesMaster;
import com.app.model.FeesType;



@Repository
public class FeesCollectionDaoImpl implements  IFeesCollectionDao {
	
	@Autowired
	private HibernateTemplate ht;
	
	public int addAccountant(Accountant accountant) {
		int accountantId=(Integer) ht.save(accountant);
		return accountantId;	
	}

	public Accountant getAccountantById(int accountantId) {
		Accountant accountant=ht.get(Accountant.class, accountantId);
		return accountant;
	}

	public List<Accountant> getAllAccountants() {
		return ht.loadAll(Accountant.class);
	}

	public void updateAccountant(Accountant accountant) {
		ht.update(accountant);

	}

	public void deleteAccountant(int accountantId) {
		ht.delete(new Accountant(accountantId));

	}

	public int addFeesDiscount(FeesDiscount feesDiscount) {
		int feesDiscountId=(Integer) ht.save(feesDiscount);
		return feesDiscountId;	
	}

	public FeesDiscount getFeesDiscountById(int feesDiscountId) {
		FeesDiscount feesDiscount=ht.get(FeesDiscount.class, feesDiscountId);
		return feesDiscount;
	}

	public List<FeesDiscount> getAllFeesDiscounts() {
		return ht.loadAll(FeesDiscount.class);
	}

	public void updateFeesDiscount(FeesDiscount feesDiscount) {
		ht.update(feesDiscount);
		
	}

	public void deleteFeesDiscount(int feesDiscountId) {
		ht.delete(new FeesDiscount(feesDiscountId));
		
	}

	public int addFeesGroup(FeesGroup feesGroup) {
		int feesGroupId=(Integer) ht.save(feesGroup);
		return feesGroupId;
	}

	public FeesGroup getFeesGroupById(int feesGroupId) {
		FeesGroup feesGroup=ht.get(FeesGroup.class, feesGroupId);
		return feesGroup;
	}

	public List<FeesGroup> getAllFeesGroups() {
		return ht.loadAll(FeesGroup.class);
	}

	public void updateFeesGroup(FeesGroup feesGroup) {
		ht.update(feesGroup);
		
	}

	public void deleteFeesGroup(int feesGroupId) {
		ht.delete(new FeesGroup(feesGroupId));
		
	}

	public int addFeesMaster(FeesMaster feesMaster) {
		int feesMasterId=(Integer) ht.save(feesMaster);
		return feesMasterId;
	}

	public FeesMaster getFeesMasterById(int feesMasterId) {
		FeesMaster feesMaster=ht.get(FeesMaster.class, feesMasterId);
		return feesMaster;
	}

	public List<FeesMaster> getAllFeesMasters() {
		return ht.loadAll(FeesMaster.class);
	}

	public void updateFeesMaster(FeesMaster feesMaster) {
		ht.update(feesMaster);
		
	}

	public void deleteFeesMaster(int feesMasterId) {
		ht.delete(new FeesMaster(feesMasterId));
		
	}

	public int addFeesType(FeesType feesType) {
		int feesTypeId=(Integer) ht.save(feesType);
		return feesTypeId;
	}

	public FeesType getFeesTypeById(int feesTypeId) {
		FeesType feesType=ht.get(FeesType.class, feesTypeId);
		return feesType;
	}

	public List<FeesType> getAllFeesTypes() {
		return ht.loadAll(FeesType.class);
	}

	public void updateFeesType(FeesType feesType) {
		ht.update(feesType);
		
	}

	public void deleteFeesType(int feesTypeId) {
		ht.delete(new FeesType(feesTypeId));
		
	}

	public int saveAssignFee(AssignFee assignFee) {
		int assignFeeId=(Integer) ht.save(assignFee);
		return assignFeeId;
	}

	public int saveCollectFee(CollectFee collectFee) {
		int paymentId=(Integer) ht.save(collectFee);
		return paymentId;
	}

	public CollectFee getCollectFeeById(int paymentId) {
		CollectFee collectFee=ht.get(CollectFee.class, paymentId);
		return collectFee;
	}

	public List<AssignFee> getAllAssignFeesToStudent(int studentId) {
		String hql="from AssignFee a where a.availabileFor='ForAll' or a.availabileFor='"+studentId+"'";
     	@SuppressWarnings("unchecked")
     	List<AssignFee> assignFee=ht.find(hql);
		return assignFee;
	}

	public List<CollectFee> getAllStudentPayments(int studentId) {
		String hql="from CollectFee c where c.admissionNumber='"+studentId+"'";
     	@SuppressWarnings("unchecked")
     	List<CollectFee> payments=ht.find(hql);
		return payments;
	}

	public List<CollectFee> getAllPayments() {
		List<CollectFee> allPayments=ht.loadAll(CollectFee.class);
		return allPayments;
	}
	public long getsumofAllFeesAssignedToStudent(int studentId,String cls,String section) 
	{
		String hql="Select sum(a.amount) FROM AssignFee a where a.availabileFor='ForAll' or a.availabileFor='"+studentId+"' and a.cls='"+cls+"' and a.section='"+section+"'";
		@SuppressWarnings("rawtypes")
		List sum=ht.find(hql);
		if(sum.get(0)==null)
		{
			return 0;
		}
		else
		{
		return (Long) sum.get(0);
		}
	}

	
	public long getCollectFee(int studentId) {
		String hql="Select sum(c.amount) FROM CollectFee c where c.admissionNumber='"+studentId+"'";
		@SuppressWarnings("rawtypes")
		List sum=ht.find(hql);
		if(sum.get(0)==null)
		{
			return 0;
		}
		else
		{
		return (Long) sum.get(0);
		}
	}

}
