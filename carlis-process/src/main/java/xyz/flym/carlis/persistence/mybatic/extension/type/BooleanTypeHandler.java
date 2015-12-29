package xyz.flym.carlis.persistence.mybatic.extension.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class BooleanTypeHandler implements TypeHandler<Boolean> {

	@Override
	public void setParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
		ps.setString(i, BooleanUtils.toString(parameter, "1", "0"));
	}

	@Override
	public Boolean getResult(ResultSet rs, String columnName) throws SQLException {
		String result = rs.getString(columnName);
		if (StringUtils.isEmpty(result)) {
			return Boolean.FALSE;
		}
		return BooleanUtils.toBooleanObject(result, "1", "0", "null");
	}

	@Override
	public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
		String result = rs.getString(columnIndex);
		if (StringUtils.isEmpty(result)) {
			return Boolean.FALSE;
		}
		return BooleanUtils.toBooleanObject(result, "1", "0", "null");
	}

	@Override
	public Boolean getResult(CallableStatement cs, int columnIndex) throws SQLException {
		String result = cs.getString(columnIndex);
		if (StringUtils.isEmpty(result)) {
			return Boolean.FALSE;
		}
		return BooleanUtils.toBooleanObject(result, "1", "0", "null");
	}

}
