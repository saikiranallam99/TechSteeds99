package com.app.dao;

import java.util.List;

import com.app.model.Accountant;
import com.app.model.AssignFee;
import com.app.model.CollectFee;
import com.app.model.FeesDiscount;
import com.app.model.FeesGroup;
import com.app.model.FeesMaster;
import com.app.model.FeesType;


public interface IFeesCollectionDao {
	//Accountant
	public int  addAccountant(Accountant accountant);
	public Accountant  getAccountantById(int accountantId);
	public List<Accountant> getAllAccountants();
	public void updateAccountant(Accountant accountant);
	public void deleteAccountant(int accountantId);
	//Fees Discount
	public int  addFeesDiscount(FeesDiscount feesDiscount);
	public FeesDiscount  getFeesDiscountById(int feesDiscountId);
	public List<FeesDiscount> getAllFeesDiscounts();
	public void updateFeesDiscount(FeesDiscount feesDiscount);
	public void deleteFeesDiscount(int feesDiscountId);
	//Fees Group
	public int  addFeesGroup(FeesGroup feesGroup);
	public FeesGroup  getFeesGroupById(int feesGroupId);
	public List<FeesGroup> getAllFeesGroups();
	public void updateFeesGroup(FeesGroup feesGroup);
	public void deleteFeesGroup(int feesGroupId);
	//Fees Master
	public int  addFeesMaster(FeesMaster feesMaster);
	public FeesMaster  getFeesMasterById(int feesMasterId);
	public List<FeesMaster> getAllFeesMasters();
	public void updateFeesMaster(FeesMaster feesMaster);
	public void deleteFeesMaster(int feesMasterId);
	public int  saveAssignFee(AssignFee assignFee);
	//Fees Type
	public int  addFeesType(FeesType feesType);
	public FeesType  getFeesTypeById(int feesTypeId);
	public List<FeesType> getAllFeesTypes();
	public void updateFeesType(FeesType feesType);
	public void deleteFeesType(int feesTypeId);
	//CollectFees
	public int  saveCollectFee(CollectFee collectFee);
	public CollectFee  getCollectFeeById(int paymentId);
	public List<AssignFee> getAllAssignFeesToStudent(int studentId);
	public List<CollectFee> getAllStudentPayments(int studentId);
	public List<CollectFee> getAllPayments();
	public long getCollectFee(int studentId);
	public long getsumofAllFeesAssignedToStudent(int studentId,String cls,String section) ;
	
}
