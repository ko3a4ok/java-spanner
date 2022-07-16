/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.spanner.connection;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import com.google.cloud.spanner.Dialect;
import com.google.cloud.spanner.Statement;
import com.google.cloud.spanner.connection.AbstractStatementParser.ParsedStatement;
import com.google.cloud.spanner.connection.AbstractStatementParser.StatementType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SetPgSessionCharacteristicsTest {
  private final AbstractStatementParser parser =
      AbstractStatementParser.getInstance(Dialect.POSTGRESQL);

  @Test
  public void testSetIsolationLevelDefault() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set session characteristics as transaction isolation level default";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection, never()).setReadOnly(anyBoolean());
  }

  @Test
  public void testSetIsolationLevelSerializable() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set session characteristics as transaction isolation level serializable";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection, never()).setReadOnly(anyBoolean());
  }

  @Test
  public void testSetIsolationLevelReadOnly() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set\tsession\ncharacteristics as transaction read   only";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(true);
    verify(connection, never()).setReadOnly(false);
  }

  @Test
  public void testSetIsolationLevelReadWrite() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set   session   characteristics   as   transaction   read   write";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(false);
    verify(connection, never()).setReadOnly(true);
  }

  @Test
  public void testSetIsolationLevelSerializableReadWrite() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set   session   characteristics   as   transaction  isolation level serializable read write";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(false);
    verify(connection, never()).setReadOnly(true);
  }

  @Test
  public void testSetIsolationLevelSerializableReadOnly() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set   session   characteristics   as   transaction  isolation level serializable read only";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(true);
  }

  @Test
  public void testSetMultipleTransactionModes() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set session characteristics as transaction isolation level default, read only, isolation level serializable, read write";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(false);
    verify(connection, never()).setReadOnly(true);
  }

  @Test
  public void testDefaultTransactionIsolation() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set default_transaction_isolation = serializable";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    // Setting the isolation level is a no-op.
    verify(connection, never()).setReadOnly(anyBoolean());
  }

  @Test
  public void testDefaultTransactionReadOnlyTrue() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set default_transaction_read_only = true";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(true);
  }

  @Test
  public void testDefaultTransactionReadOnlyFalse() {
    ConnectionImpl connection = mock(ConnectionImpl.class);
    ConnectionStatementExecutorImpl executor = new ConnectionStatementExecutorImpl(connection);

    String sql = "set default_transaction_read_only = false";
    ParsedStatement statement = parser.parse(Statement.of(sql));
    assertEquals(sql, StatementType.CLIENT_SIDE, statement.getType());
    statement.getClientSideStatement().execute(executor, sql);

    verify(connection).setReadOnly(false);
  }
}
