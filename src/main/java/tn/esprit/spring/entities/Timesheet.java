package tn.esprit.spring.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Timesheet implements Serializable{

private static final long serialVersionUID = 3876346912862238239L;

	@EmbeddedId
	private TimesheetPK timesheetPK;
	

}