package com.exemple.sqlbuilder.select;

import com.exemple.sqlbuilder.SqlQuery;
import com.exemple.sqlbuilder.commands.*;

/**
 * Describes the state of a where statement
 */
public interface WhereQuery extends
        WhereCommand<WhereQuery>,
        OrderByCommand<OrderByQuery>,
        LimitCommand<LimitQuery>,
        SqlQuery {
}
