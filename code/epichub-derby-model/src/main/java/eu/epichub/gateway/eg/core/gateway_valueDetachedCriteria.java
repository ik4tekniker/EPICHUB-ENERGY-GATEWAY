/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package eu.epichub.gateway.eg.core;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class gateway_valueDetachedCriteria extends AbstractORMDetachedCriteria {
	public final LongExpression dbID;
	public final LongExpression variableId;
	public final AssociationExpression variable;
	public final LongExpression timestamp;
	public final StringExpression value;
	
	public gateway_valueDetachedCriteria() {
		super(eu.epichub.gateway.eg.core.gateway_value.class, eu.epichub.gateway.eg.core.gateway_valueCriteria.class);
		dbID = new LongExpression("dbID", this.getDetachedCriteria());
		variableId = new LongExpression("variable.dbID", this.getDetachedCriteria());
		variable = new AssociationExpression("variable", this.getDetachedCriteria());
		timestamp = new LongExpression("timestamp", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
	}
	
	public gateway_valueDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, eu.epichub.gateway.eg.core.gateway_valueCriteria.class);
		dbID = new LongExpression("dbID", this.getDetachedCriteria());
		variableId = new LongExpression("variable.dbID", this.getDetachedCriteria());
		variable = new AssociationExpression("variable", this.getDetachedCriteria());
		timestamp = new LongExpression("timestamp", this.getDetachedCriteria());
		value = new StringExpression("value", this.getDetachedCriteria());
	}
	
	public gateway_variableDetachedCriteria createVariableCriteria() {
		return new gateway_variableDetachedCriteria(createCriteria("variable"));
	}
	
	public gateway_value uniqueGateway_value(PersistentSession session) {
		return (gateway_value) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public gateway_value[] listGateway_value(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (gateway_value[]) list.toArray(new gateway_value[list.size()]);
	}
}

