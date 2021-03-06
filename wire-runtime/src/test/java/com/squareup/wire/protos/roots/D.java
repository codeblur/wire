// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/roots.proto
package com.squareup.wire.protos.roots;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.INT32;

public final class D extends Message {

  public static final Integer DEFAULT_I = 0;

  @ProtoField(tag = 1, type = INT32)
  public final Integer i;

  private D(Builder builder) {
    super(builder);
    this.i = builder.i;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof D)) return false;
    return equals(i, ((D) other).i);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = i != null ? i.hashCode() : 0);
  }

  public static final class Builder extends Message.Builder<D> {

    public Integer i;

    public Builder() {
    }

    public Builder(D message) {
      super(message);
      if (message == null) return;
      this.i = message.i;
    }

    public Builder i(Integer i) {
      this.i = i;
      return this;
    }

    @Override
    public D build() {
      return new D(this);
    }
  }
}
