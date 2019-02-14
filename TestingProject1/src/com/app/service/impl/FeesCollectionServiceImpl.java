package com.app.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IFeesCollectionDao;
import com.app.model.Accountant;
import com.app.model.AssignFee;
import com.app.model.CollectFee;
import com.app.model.FeesDiscount;
import com.app.model.FeesGroup;
import com.app.model.FeesMaster;
import com.app.model.FeesType;
import com.app.service.IFeesCollectionService;
@Service
public class FeesCollectionServiceImpl implements IFeesCollectionService {
	@Autowired
	private IFeesCollectionDao dao;
	public int addAccountant(Accountant accountant) {

		return dao.addAccountant(accountant);
	}

	public Accountant getAccountantById(int accountantId) {

		return dao.getAccountantById(accountantId);
	}

	public List<Accountant> getAllAccountants() {

		return dao.getAllAccountants();
	}

	public void updateAccountant(Accountant accountant) {

		dao.updateAccountant(accountant);
	}

	public void deleteAccountant(int accountantId) {

		dao.deleteAccountant(accountantId);
	}

	public int addFeesDiscount(FeesDiscount feesDiscount) {

		return dao.addFeesDiscount(feesDiscount);
	}

	public FeesDiscount getFeesDiscountById(int feesDiscountId) {

		return dao.getFeesDiscountById(feesDiscountId);
	}

	public List<FeesDiscount> getAllFeesDiscounts() {

		return dao.getAllFeesDiscounts();
	}

	public void updateFeesDiscount(FeesDiscount feesDiscount) {
		dao.updateFeesDiscount(feesDiscount);

	}

	public void deleteFeesDiscount(int feesDiscountId) {
		dao.deleteFeesDiscount(feesDiscountId);

	}

	public int addFeesGroup(FeesGroup feesGroup) {

		return dao.addFeesGroup(feesGroup);
	}

	public FeesGroup getFeesGroupById(int feesGroupId) {

		return dao.getFeesGroupById(feesGroupId);
	}

	public List<FeesGroup> getAllFeesGroups() {

		return dao.getAllFeesGroups();
	}

	public void updateFeesGroup(FeesGroup feesGroup) {

		dao.updateFeesGroup(feesGroup);
	}

	public void deleteFeesGroup(int feesGroupId) {

		dao.deleteFeesGroup(feesGroupId);

	}

	public int addFeesMaster(FeesMaster feesMaster) {

		return dao.addFeesMaster(feesMaster);
	}

	public FeesMaster getFeesMasterById(int feesMasterId) {

		return dao.getFeesMasterById(feesMasterId);
	}

	public List<FeesMaster> getAllFeesMasters() {

		return dao.getAllFeesMasters();
	}

	public void updateFeesMaster(FeesMaster feesMaster) {

		dao.updateFeesMaster(feesMaster);
	}

	public void deleteFeesMaster(int feesMasterId) {

		dao.deleteFeesMaster(feesMasterId);
	}

	public int addFeesType(FeesType feesType) {

		return dao.addFeesType(feesType);
	}

	public FeesType getFeesTypeById(int feesTypeId) {

		return dao.getFeesTypeById(feesTypeId);
	}

	public List<FeesType> getAllFeesTypes() {

		return dao.getAllFeesTypes();
	}

	public void updateFeesType(FeesType feesType) {
		dao.updateFeesType(feesType);

	}

	public void deleteFeesType(int feesTypeId) {
		dao.deleteFeesType(feesTypeId);

	}

	public int saveAssignFee(AssignFee assignFee) {
		
		return dao.saveAssignFee(assignFee);
	}

	public int saveCollectFee(CollectFee collectFee) {
		
		return dao.saveCollectFee(collectFee);
	}

	public CollectFee getCollectFeeById(int paymentId) {
		
		return dao.getCollectFeeById(paymentId);
	}

	public List<AssignFee> getAllAssignFeesToStudent(int studentId) {
		
		return dao.getAllAssignFeesToStudent(studentId);
	}

	public List<CollectFee> getAllStudentPayments(int studentId) {
		
		return dao.getAllStudentPayments(studentId);
	}

	public List<CollectFee> getAllPayments() {
		
		return dao.getAllPayments();
	}

	public long getCollectFee(int studentId) {
		
		return dao.getCollectFee(studentId);
	}

	public long getsumofAllFeesAssignedToStudent(int studentId, String cls,
			String section) {
		
		return dao.getsumofAllFeesAssignedToStudent(studentId, cls, section);
	}

}
