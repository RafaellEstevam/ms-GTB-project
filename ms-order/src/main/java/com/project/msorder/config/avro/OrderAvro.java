/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.project.msorder.config.avro;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4778493090856368688L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderAvro\",\"namespace\":\"com.project.msorder.config.avro\",\"fields\":[{\"name\":\"customerId\",\"type\":\"int\"},{\"name\":\"items\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ItemAvro\",\"fields\":[{\"name\":\"product\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"quantity\",\"type\":\"int\"},{\"name\":\"price\",\"type\":\"float\"}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderAvro> ENCODER =
      new BinaryMessageEncoder<OrderAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderAvro> DECODER =
      new BinaryMessageDecoder<OrderAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderAvro> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OrderAvro>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderAvro to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderAvro from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderAvro instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int customerId;
   private java.util.List<com.project.msorder.config.avro.ItemAvro> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderAvro() {}

  /**
   * All-args constructor.
   * @param customerId The new value for customerId
   * @param items The new value for items
   */
  public OrderAvro(java.lang.Integer customerId, java.util.List<com.project.msorder.config.avro.ItemAvro> items) {
    this.customerId = customerId;
    this.items = items;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return customerId;
    case 1: return items;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: customerId = (java.lang.Integer)value$; break;
    case 1: items = (java.util.List<com.project.msorder.config.avro.ItemAvro>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'customerId' field.
   * @return The value of the 'customerId' field.
   */
  public int getCustomerId() {
    return customerId;
  }



  /**
   * Gets the value of the 'items' field.
   * @return The value of the 'items' field.
   */
  public java.util.List<com.project.msorder.config.avro.ItemAvro> getItems() {
    return items;
  }



  /**
   * Creates a new OrderAvro RecordBuilder.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.project.msorder.config.avro.OrderAvro.Builder newBuilder() {
    return new com.project.msorder.config.avro.OrderAvro.Builder();
  }

  /**
   * Creates a new OrderAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.project.msorder.config.avro.OrderAvro.Builder newBuilder(com.project.msorder.config.avro.OrderAvro.Builder other) {
    if (other == null) {
      return new com.project.msorder.config.avro.OrderAvro.Builder();
    } else {
      return new com.project.msorder.config.avro.OrderAvro.Builder(other);
    }
  }

  /**
   * Creates a new OrderAvro RecordBuilder by copying an existing OrderAvro instance.
   * @param other The existing instance to copy.
   * @return A new OrderAvro RecordBuilder
   */
  public static com.project.msorder.config.avro.OrderAvro.Builder newBuilder(com.project.msorder.config.avro.OrderAvro other) {
    if (other == null) {
      return new com.project.msorder.config.avro.OrderAvro.Builder();
    } else {
      return new com.project.msorder.config.avro.OrderAvro.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderAvro instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderAvro>
    implements org.apache.avro.data.RecordBuilder<OrderAvro> {

    private int customerId;
    private java.util.List<com.project.msorder.config.avro.ItemAvro> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.project.msorder.config.avro.OrderAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(com.project.msorder.config.avro.OrderAvro other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.customerId)) {
        this.customerId = data().deepCopy(fields()[0].schema(), other.customerId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.items)) {
        this.items = data().deepCopy(fields()[1].schema(), other.items);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'customerId' field.
      * @return The value.
      */
    public int getCustomerId() {
      return customerId;
    }


    /**
      * Sets the value of the 'customerId' field.
      * @param value The value of 'customerId'.
      * @return This builder.
      */
    public com.project.msorder.config.avro.OrderAvro.Builder setCustomerId(int value) {
      validate(fields()[0], value);
      this.customerId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'customerId' field has been set.
      * @return True if the 'customerId' field has been set, false otherwise.
      */
    public boolean hasCustomerId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'customerId' field.
      * @return This builder.
      */
    public com.project.msorder.config.avro.OrderAvro.Builder clearCustomerId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'items' field.
      * @return The value.
      */
    public java.util.List<com.project.msorder.config.avro.ItemAvro> getItems() {
      return items;
    }


    /**
      * Sets the value of the 'items' field.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.project.msorder.config.avro.OrderAvro.Builder setItems(java.util.List<com.project.msorder.config.avro.ItemAvro> value) {
      validate(fields()[1], value);
      this.items = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'items' field.
      * @return This builder.
      */
    public com.project.msorder.config.avro.OrderAvro.Builder clearItems() {
      items = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderAvro build() {
      try {
        OrderAvro record = new OrderAvro();
        record.customerId = fieldSetFlags()[0] ? this.customerId : (java.lang.Integer) defaultValue(fields()[0]);
        record.items = fieldSetFlags()[1] ? this.items : (java.util.List<com.project.msorder.config.avro.ItemAvro>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderAvro>
    READER$ = (org.apache.avro.io.DatumReader<OrderAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.customerId);

    long size0 = this.items.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (com.project.msorder.config.avro.ItemAvro e0: this.items) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.customerId = in.readInt();

      long size0 = in.readArrayStart();
      java.util.List<com.project.msorder.config.avro.ItemAvro> a0 = this.items;
      if (a0 == null) {
        a0 = new SpecificData.Array<com.project.msorder.config.avro.ItemAvro>((int)size0, SCHEMA$.getField("items").schema());
        this.items = a0;
      } else a0.clear();
      SpecificData.Array<com.project.msorder.config.avro.ItemAvro> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.project.msorder.config.avro.ItemAvro>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          com.project.msorder.config.avro.ItemAvro e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new com.project.msorder.config.avro.ItemAvro();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.customerId = in.readInt();
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<com.project.msorder.config.avro.ItemAvro> a0 = this.items;
          if (a0 == null) {
            a0 = new SpecificData.Array<com.project.msorder.config.avro.ItemAvro>((int)size0, SCHEMA$.getField("items").schema());
            this.items = a0;
          } else a0.clear();
          SpecificData.Array<com.project.msorder.config.avro.ItemAvro> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.project.msorder.config.avro.ItemAvro>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              com.project.msorder.config.avro.ItemAvro e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new com.project.msorder.config.avro.ItemAvro();
              }
              e0.customDecode(in);
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









