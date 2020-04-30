package ch.rhj.chunkdb;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class Driver implements java.sql.Driver {

	@Override
	public Connection connect(String url, Properties info) throws SQLException {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public int getMajorVersion() {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public int getMinorVersion() {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public boolean jdbcCompliant() {

		throw new UnsupportedOperationException("not yet implemented");
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {

		throw new UnsupportedOperationException("not yet implemented");
	}
}
