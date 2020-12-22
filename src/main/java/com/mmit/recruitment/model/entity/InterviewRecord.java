package com.mmit.recruitment.model.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;


@Entity
@NamedQuery(name="InterviewRecord.findAll",query="SELECT ir FROM InterviewRecord ir")
@NamedQuery(name="InterviewRecord.findExistOrNot",query="SELECT ir FROM InterviewRecord ir WHERE ir.candidateJobOrder.id = :eidtcandidateJobOrderId AND ir.status.id IN (500,600,700)")

public class InterviewRecord implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "candidateJobOrder_id", referencedColumnName = "id")
	private JobPipeline candidateJobOrder;
	
	@OneToOne
	@JoinColumn(name = "status_id", referencedColumnName = "id")
	private CandidateJoborderStatus status;
	
	private LocalDate interview_date;
	
	private int interview_interval;
	
	@ManyToOne
	@JoinColumn(name = "interviewType_id", referencedColumnName = "id")
	private InterviewType interviewType;
	
	private LocalDateTime entry_date;
	@ManyToOne
	@JoinColumn(name = "entryBy", referencedColumnName = "id")
	private  Recruiter entryBy;
	
	private LocalDateTime modify_date;
	@ManyToOne
	@JoinColumn(name = "modifyBy", referencedColumnName = "id")
	private Recruiter modifyBy;
	
	private static final long serialVersionUID = 1L;

	public InterviewRecord() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobPipeline getCandidateJobOrder() {
		return candidateJobOrder;
	}

	public void setCandidateJobOrder(JobPipeline candidateJobOrder) {
		this.candidateJobOrder = candidateJobOrder;
	}

	public LocalDate getInterview_date() {
		return interview_date;
	}

	public void setInterview_date(LocalDate interview_date) {
		this.interview_date = interview_date;
	}

	public int getInterview_interval() {
		return interview_interval;
	}

	public void setInterview_interval(int interview_interval) {
		this.interview_interval = interview_interval;
	}

	public InterviewType getInterviewType() {
		return interviewType;
	}

	public void setInterviewType(InterviewType interviewType) {
		this.interviewType = interviewType;
	}

	
	public LocalDateTime getEntry_date() {
		return entry_date;
	}

	public void setEntry_date(LocalDateTime entry_date) {
		this.entry_date = entry_date;
	}

	public void setModify_date(LocalDateTime modify_date) {
		this.modify_date = modify_date;
	}

	public Recruiter getEntryBy() {
		return entryBy;
	}

	public void setEntryBy(Recruiter entryBy) {
		this.entryBy = entryBy;
	}

	

	public LocalDateTime getModify_date() {
		return modify_date;
	}

	public Recruiter getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(Recruiter modifyBy) {
		this.modifyBy = modifyBy;
	}

	public CandidateJoborderStatus getStatus() {
		return status;
	}

	public void setStatus(CandidateJoborderStatus status) {
		this.status = status;
	}
	

}
