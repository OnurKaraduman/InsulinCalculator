package com.iüce.control;

import java.util.List;
import com.iüce.entity.Insulin;

public interface IInsulinOperations {

	public boolean addInsulin(Insulin insulin);

	public List<Insulin> listInsulin();

}
